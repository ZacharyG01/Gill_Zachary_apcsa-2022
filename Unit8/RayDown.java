//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		int decreasing = numArray[0];
		int count = 0;
		for (int i = 0; i < numArray.length; i++) 
		{
			if (numArray[i] < decreasing)
				count++;
		}
		if (count == numArray.length-1)
			return true;
		else
			return false;
	}	
}
