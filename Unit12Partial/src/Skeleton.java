//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables
	private String name;
	private int size;

	//add a constructor
	public Skeleton()
	{
		name = "";
		size = 1;
	}
	
	public Skeleton(String id, int big)
	{
		name = id;
		size = big;
	}

	//add code to implement the Monster interface
	public int getHowBig() 
	{
		return size;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean isBigger(Monster other)
	{
		Skeleton skeleton2 = (Skeleton)other; 
		if (size > skeleton2.getHowBig())
		{
			return true;
		}
		else
			return false;
	}

	public boolean isSmaller(Monster other)
	{
		Skeleton skeleton2 = (Skeleton)other; 
		if (size < skeleton2.getHowBig())
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean namesTheSame(Monster other)
	{
		Skeleton skeleton2 = (Skeleton)other; 
		if (name.equals(skeleton2.getName()))
		{
			return true;
		}
		else
			return false;
	}
	//add a toString
	
	public String toString() 
	{
		return name + " " + size;
	}
}