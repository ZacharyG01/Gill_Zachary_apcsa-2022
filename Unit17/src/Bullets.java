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

public class Bullets
{
	private List<Ammo> ammo;
	public static double totalshots;
	public static double levelshots;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
	}

	public void add(Ammo al)
	{
		ammo.add(al);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		for (int i = 0; i < ammo.size(); i++)
		{
		ammo.get(i).draw(window);
		}
	}

	public void moveEmAll()
	{
		for (int i = 0; i < ammo.size(); i++)
		{
		ammo.get(i).move("UP");
		}
	}

	public void cleanEmUp()
	{
		if (ammo.size() == 1)
			if (ammo.get(0).getY() <= 0)
			{
				levelshots++;
				totalshots++;
				ammo.remove(0);
			}
		
	}

	public List<Ammo> getList()
	{
		return ammo;
	}

	public String toString()
	{
		return "";
	}
}
