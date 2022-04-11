//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = 100;
		yPos = 150;
		width = 10;
		height = 10;
		color = new Color(0);
	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y, int wdth, int hght, Color colur)
	{
		xPos = x;
		yPos = y;
		width = wdth;
		height = hght;
		color = colur;
	}
	
	public Block(int x, int y, int wdth, int hght)
	{
		xPos = x;
		yPos = y;
		width = wdth;
		height = hght;
		color = new Color(0);
	}
	
	public Block(int x, int y, int wdth)
	{
		xPos = x;
		yPos = y;
		width = wdth;
		height = 10;
		color = new Color(0);
	}
	
	
	
	public Block(int x, int y)
	{
		xPos = x;
		yPos = y;
		width = 10;
		height = 10;
		color = new Color(0);
	}
	
	
	
	
	
	
	
	
	
   //add the other set methods
	public void setPos( int x, int y)
	{
		xPos = x;
		yPos = y;
	}
    public void setX( int x )
    {
    	xPos = x;
    }
    public void setY( int y )
    {
    	yPos = y;
    }

   public void setColor(Color col)
   {
	   color = col;
   }

   public int getX()
   {
	   return xPos;
   }
   public int getY()
   {
	   return yPos;
   }
   
   public int getWidth()
   {
	   return width;
   }
   
   public int getHeight()
   {
	   return height;
   }
   
   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}

		return false;
	}   

    

   //add a toString() method  - x , y , width, height, color
	public String toString()
	{
		return xPos + " " + yPos + " " + width + " " + height + " " + color;
	}
}