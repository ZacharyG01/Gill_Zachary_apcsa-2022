//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	//private Alien alienOne;
	//private Alien alienTwo;
	//private Ammo Ammo1;

	
   private AlienHorde horde;
	
	
	private Bullets shots;
	private boolean[] keys;
	private BufferedImage back;
	private boolean ammo;
	public static int score;
	public static int totalscore;
	public static boolean gameOver;
	public static boolean win;
	public double accuracy;
	private double totalaccuracy;
	private int maxLevel;
	private double scale;
	private int size;
	public static int level;
	private Powerup pow;
	public static boolean removePU;
	private int diff;
	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		size = 10;
		gameOver = false;
		level = 1;
		maxLevel = 4;
		ship = new Ship(350,500,50,50,10);
		//alienOne = new Alien(300,10,50,50,1);
		//alienTwo = new Alien(350,10,50,50,1);
		//Ammo1 = new Ammo(ship.getX()+20,ship.getY(), 10);
		ammo = false;
		shots = new Bullets();
		horde = new AlienHorde(size, 1);
		totalaccuracy = 100;
		accuracy = 100;
		scale = Math.pow(10, 2);
		//pow = new Powerup(300,300, 50, 50);

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
		
	}
	
	public OuterSpace(int aliens, int digitsscaled, int shipsize, int max, String difficulty)
	{
		if (difficulty.equals("Normal") || difficulty.equals("normal"))
		{
			diff = 1;
		}
		if (difficulty.equals("Hard") || difficulty.equals("hard"))
		{
			diff = 2;
		}
		if (difficulty.equals("Expert") || difficulty.equals("expert"))
		{
			diff = 3;
		}
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		size = aliens;
		gameOver = false;
		level = 1;
		maxLevel = max;
		ship = new Ship(350,500,shipsize,shipsize,10);
		ammo = false;
		shots = new Bullets();
		horde = new AlienHorde(size, diff);
		totalaccuracy = 100;
		accuracy = 100;
		scale = Math.pow(10, digitsscaled);
		//pow = new Powerup(300,300, 50, 50);

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
		
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		graphToBack.setColor(Color.WHITE);
		graphToBack.drawString("StarFighter ", 25, 40 );
		graphToBack.drawString("SCORE : " + totalscore, 500, 40 );
		graphToBack.drawString("LEVEL ACCURACY : " + accuracy + "%", 300, 40 );
		graphToBack.drawString("TOTAL ACCURACY : " + totalaccuracy + "%", 300, 60 );
		graphToBack.drawString("Level : " + level, 25, 60 );
		ship.draw(graphToBack);
		horde.drawEmAll(graphToBack);
		//alienOne.draw(graphToBack);
		//alienTwo.draw(graphToBack);
		shots.drawEmAll(graphToBack);
		//if (!removePU)
		//pow.draw(graphToBack);
		
		
		
		
		if (win && !(level > maxLevel))
		{
			level++;
			size += 10;
			horde = new AlienHorde(size, diff);
			win = false;
			score = 0;
			Bullets.levelshots = 0;
			accuracy = 100;
		}
		
		if (level > maxLevel)
		{
			graphToBack.setColor(new Color(50,150,0));
			graphToBack.fillRect(0,0,800,600);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("WIN!", 350, 300);
			graphToBack.drawString("SCORE : " + totalscore, 335, 325 );
			graphToBack.drawString("ACCURACY : " + totalaccuracy + "%", 325  , 350 );
		}
		
		if (gameOver && !(level > maxLevel))
		{
			graphToBack.setColor(Color.RED);
			graphToBack.fillRect(0,0,800,600);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("GAME OVER!", 325, 300);
			graphToBack.drawString("SCORE : " + totalscore, 335, 325 );
			graphToBack.drawString("ACCURACY : " + totalaccuracy + "%", 315, 350 );
		}

		if(keys[0] == true)
		{
			ship.move("LEFT");
		}

		//add code to move Ship, Alien, etc.
		if(keys[1] == true)
		{
			ship.move("RIGHT");
		}
		if(keys[2] == true)
		{
			ship.move("UP");
		}
		if(keys[3] == true)
		{
			ship.move("DOWN");
		}
		
		if(keys[4] == true)
		{
			shots.moveEmAll();
			shots.cleanEmUp();
			
			ammo = true;
			keys[4] = false;
			repaint();
		}
		
		shots.cleanEmUp();
		horde.moveEmAll();
		//pow.powerUp(ship);
		if (shots.getList().size() > 0)
		{
		horde.removeDeadOnes(shots.getList());
		}
		//alienOne.move("DOWN");
		//alienTwo.move("DOWN");
		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
		if (ammo == true)
		{
			shots.moveEmAll();
			//repaint();
			
		}
		
		
		if (horde.gameOver(ship))
		{
			gameOver = true;
		}
		
		if (horde.Win())
		{
			win = true;
		}
		if (!gameOver && !(level > maxLevel))
		{
		accuracy = (double)(score / (shots.levelshots + score) * 100); 
		accuracy = Math.round(accuracy * scale) / scale;
		totalaccuracy = (double)(totalscore / (shots.totalshots + totalscore) * 100); 
		totalaccuracy = Math.round(totalaccuracy * scale) / scale;
		}
		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			shots.cleanEmUp();
			if (shots.getList().size() == 0 && !(level > maxLevel))
			{
			shots.add(new Ammo(ship.getX()+20,ship.getY(), 10));
			keys[4] = true;
			}
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

