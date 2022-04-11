//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
      speed =5;
   }


   //add the other Paddle constructors
   public Paddle(int x, int y)
   {
	   super(x, y);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int spd)
   {
	   super(x, y);
	   speed = spd;
   }
   
   public Paddle(int x, int y, int width, int height, int spd)
   {
	   super(x, y, width, height);
	   speed = spd;
   }
   
   public Paddle(int x, int y, int width, int height)
   {
	   super(x, y, width, height);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int width, int height, Color color, int spd)
   {
	   super(x, y, width, height, color);
	   speed = spd;
   }
   
   public void setSpeed(int spd)
   {
	   speed = spd;
   }









   public void moveUpAndDraw(Graphics window)
   {
	   super.draw(window, new Color(0));

	      setSpeed(getSpeed()+speed);
		
	 

	      super.draw(window);

   }

   public void moveDownAndDraw(Graphics window)
   {
	   super.draw(window, new Color(0));

	      setSpeed(getSpeed()-speed);
		
	 

	      super.draw(window);

   }

   //add get methods
   public int getSpeed()
   {
	   return speed;
   }
   
   
   //add a toString() method
   
   public String toString()
   {
	   return super.toString() + "  " + speed;
   }
   
}