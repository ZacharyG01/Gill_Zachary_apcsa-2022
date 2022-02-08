//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('a');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}
	
	public String calcTriangle() {
		int temp = 0;
		int count2 = amount;
		int count = 0;
		int count4 = amount;
		int count5 = amount;
		int temp2 = amount;
		while (count2 > 0) {
			count += count2;
			count2--;
		}
		for (int d = 0; d < amount; d++) {
		for (int i = 0; i < count4; i++) {
			for (int j = 1; j <= count5; j++) {
				if (temp2 > temp)
					out.print((char)(letter + temp));
				if (j == count5 && count5 != 0) {
					temp++;
					count5--;
					out.print(" ");
				}
				
			}
		count--;

		}
		temp2--;
		count5 = amount;
		temp = 0;
		out.println();
		}
		
		String output = "";
		return output;
	}

	public String toString()
	{
		
		String output= calcTriangle();
		return output;
	}
}