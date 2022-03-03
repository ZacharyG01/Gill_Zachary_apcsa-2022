//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		for (int i = spot; i < pups.length; i++)
		{
			pups[i] = new Dog(age,name);
		}
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		int oldest = pups[0].getAge();
		int name = 0;
		for (int i = 0; i < pups.length; i++)
			if (pups[i].getAge() > oldest)
			{
				oldest = pups[i].getAge();
				name = i;
			}
		return pups[name].getName(); 
	}

	public String getNameOfYoungest()
	{
		int youngest = pups[0].getAge();
		int name = 0;
		for (int i = 0; i < pups.length; i++)
			if (pups[i].getAge() < youngest)
			{
				youngest = pups[i].getAge();
				name = i;
			}
		return pups[name].getName(); 
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}