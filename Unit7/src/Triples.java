//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	public boolean greatestCommonFactor(int a, int b, int c)
	{
		int min = Math.min(a, Math.min(b, c));
		int i = 0;
		for (i = min; i >= 1; i--)
			if((a%i == 0) && (b%i == 0 && c%i == 0))
				break;
		int max = i;


		if (max > 2)
			return false;
		else if (max < 2)
			return true;
		else
			return false;
	}
	private String calcTriples() 
	{ 
		String output = "";
		for (int a = 1; a < number; a++) {
			for (int b = a+1; b < number; b++) {
				for (int c = b+1; c < number; c++) {
					if ((Math.pow(a, 2) + Math.pow(b, 2) == Math. pow(c, 2)) && greatestCommonFactor(a, b, c) == true)
						output += " " + a + " " + b + " " + c + "\n";
				}
			}
		}
		
		
		
		return output;
	}

	public String toString()
	{
		String output="" + calcTriples();






		return output+"\n";
	}
}