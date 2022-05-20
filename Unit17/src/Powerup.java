
import java.io.File;

import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.net.URL;

import javax.imageio.ImageIO;

public class Powerup extends MovingThing {
	private Image image;
	private int xPos;
	private int yPos;
	private int speed;
	
	public Powerup()
	{
		
	}
	public Powerup(int x, int y, int w, int h)
	{
		super(x,y,w,h);
		try
		{
			URL url = getClass().getResource("/images/pu.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.print("error");
			//feel free to do something here
		}
	}
	
	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(), getHeight(), getWidth(), null);
	}
	
	public void setSpeed(int sp)
	{
		speed = sp;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public void powerUp(Ship ship)
	{
		if ((Math.abs(ship.getX() - this.getX()) < 30 && Math.abs(ship.getY() - this.getY()) < 50))
		{
			OuterSpace.removePU = true;
			this.setX(xPos + 1000);
			this.setY(yPos + 1000);
			ship = new Ship(ship.getX(), ship.getY(), ship.getWidth(), ship.getHeight(), ship.getSpeed(), true);
		}
	}
	
	public void move(String direction)
	{
		
	}

	
}
