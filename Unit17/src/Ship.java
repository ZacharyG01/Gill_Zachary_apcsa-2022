//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
		this(x,y,10,10,10);
	   //add code here
	}

	public Ship(int x, int y, int s)
	{
		this(x,y,10,10,s);
	   //add code here
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			URL url = getClass().getResource("/images/ship.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.print("error");
			//feel free to do something here
		}
	}


	public void setSpeed(int s)
	{
		speed = s;
	   //add more code
	}

	public int getSpeed()
	{
	   return 0;
	}

	public void move(String direction)
	{
		if (direction.equals("LEFT") && this.getX() > 0)
			setX(getX() - speed / 2);
		else if (direction.equals("RIGHT") && this.getX() < 740)
			setX(getX() + speed / 2);
		else if (direction.equals("UP") && this.getY() > 0)
			setY(getY() - speed / 2);
		else if (direction.equals("DOWN") && this.getY() < 500)
			setY(getY() + speed / 2);
		//add code here
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
