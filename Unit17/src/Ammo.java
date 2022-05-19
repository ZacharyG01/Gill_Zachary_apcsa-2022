//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		super(x,y);
		speed = 0;
		//add code
	}

	public Ammo(int x, int y, int s)
	{
		super(x,y);
		speed = s;
		//add code
	}

	public void setSpeed(int s)
	{
		speed = s;
	   //add code
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.YELLOW);
		window.fillRect(getX(), getY(), 10,10);
		//add code to draw the ammo
	}
	
	
	public void move( String direction )
	{
		
			setY(getY() - speed / 2);
		//add code to draw the ammo
	}

	public String toString()
	{
		return "";
	}
}
