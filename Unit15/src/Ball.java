 //(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	//add the other Ball constructors
	
	public Ball(int x, int y, int height, int width)
	{
		super(x, y, height, width);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y)
	{
		super(x, y);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int height, int width, Color color)
	{
		super(x, y, height, width, color);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int height, int width, Color color, int xSpd)
	{
		super(x, y, height, width, color);
		xSpeed = xSpd;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int height, int width, Color color, int xSpd, int ySpd)
	{
		super(x, y, height, width, color);
		xSpeed = xSpd;
		ySpeed = ySpd;
	}
	
	
	
	
	
	
	
	
	   
   //add the set methods
	
	public void setXSpeed(int xSpd)
	{
		xSpeed = xSpd;
	}
   
	public void setYSpeed(int ySpd)
	{
		ySpeed = ySpd;
	}

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	super.draw(window, new Color(0));

      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);

		//draw the ball at its new location
      super.draw(window);
   }
   
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;



		return false;
	}   

   //add the get methods
	public int getXSpeed()
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}

   //add a toString() method
	
	public String toString()
	{
		return super.toString();
	}
}