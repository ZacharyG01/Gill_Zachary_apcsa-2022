//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private int amount;
	private int difficulty;

	public AlienHorde(int size, int diffic)
	{
		difficulty = diffic;
		amount = size;
		aliens = new ArrayList<Alien>(size);
		int diff = 75;
		int x = 0;
		int y = 60;
		int direction = 1;
		for (int i = 0; i < size; i++)
		{
			aliens.add(new Alien(x,y,50,50,direction * difficulty));
			x+= diff;
			
			if (x > 750)
			{
				x = 750;
				y+= 60;
				diff = -diff;
				direction = -direction;
			}
				
			else if (x < 0) {
				x = 0;
				y+= 60;
				diff = -diff;
				direction = -direction;
			}

		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (int i = 0; i < aliens.size(); i++)
		{
		aliens.get(i).draw(window);
		}
	}
	public void moveEmAll()
	{
		for (int i = 0; i < aliens.size(); i++)
		{
		aliens.get(i).move("DOWN");
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		if (shots.size() > 0)
		{
		for (int i = 0; i < aliens.size(); i++)
		{
				if ((Math.abs(shots.get(0).getX() - aliens.get(i).getX()) < 30) && (Math.abs(shots.get(0).getY() - aliens.get(i).getY()) < 40))
				{
					if (!OuterSpace.win && !OuterSpace.gameOver)
					{
						OuterSpace.score++;
						OuterSpace.totalscore++;
					}
					aliens.remove(i);
					shots.remove(0);
					break;
				}
		}
		}
	}
	
	public boolean gameOver(Ship ship)
	{
		for (int i = 0; i < aliens.size(); i++)
		{
				if ((Math.abs(ship.getX() - aliens.get(i).getX()) < 30 && Math.abs(ship.getY() - aliens.get(i).getY()) < 50) || aliens.get(i).getY() > 500)
				{
					return true;
				}
		}
		return false;
	}
	
	
	public boolean Win()
	{
		if (aliens.size() == 0 && OuterSpace.score == amount)
			return true;
		return false;
	}

	public String toString()
	{
		return "";
	}
}
