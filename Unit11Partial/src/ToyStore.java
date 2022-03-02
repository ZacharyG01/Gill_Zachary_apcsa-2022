//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;
	private ArrayList<Toy> sorted;
	private ArrayList<Toy> toyCopy;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
		sorted = new ArrayList<Toy>();
		toyCopy = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		for (String name : toys.split( " "))
		{
			Toy a = getThatToy(name);
			if (a == null)
				toyList.add( new Toy(name));
				
			else
			{
				a.setCount(a.getCount() + 1);
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (Toy t : toyList)
  		{
  			if (t.getName().equals(nm))
  				return t;
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy(ArrayList<Toy> toys)
  	{
  		String name = "";
  		int max = Integer.MIN_VALUE;
  		for (Toy t: toys)
  		{
  			if (max < t.getCount())
  			{
  				max = t.getCount();
  				name = t.getName();
  			}
  		}
  		if (name != "")
  		{
  		return "max == " + name;
  		}
  		return name;
  	}  
  	
  
  	public void sortToysByCount()
  	{
  		toyCopy = (ArrayList)toyList.clone();
  		while (toyCopy.size() > 0)
  		{
  			for (Toy t : toyList)
  			{
  				if (getMostFrequentToy(toyCopy).equals("max == " + t.getName()))
  				{
  					sorted.add(t);
  					toyCopy.remove(t);
  				}
  			}
  		}
  	}
  	  
	public String toString()
	{
	   return "" + sorted + "\n" + getMostFrequentToy(toyList);
	}
}