//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() 
   {
	   setInt(0);
   }
   
   public Perfect(int s)
   {
	   setInt(s);
   }

	//add a set method
   public void setInt(int s) 
   {
	   number = s;
   }

	public boolean isPerfect()
	{
		int temp = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				temp += i;
			}
		}
		if (temp == number)
			return true;
		else
			return false;
	}

	//add a toString	
	public String toString() {
		if (isPerfect() == true)
		return number + " is perfect\n";
	else
		return number + " is not perfect\n";
}}