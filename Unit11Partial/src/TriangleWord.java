//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
	public static void printTriangle(String word)
	{
		int c = 0;
		for (int i = 0; i < word.length(); i++)
		{
			for (int b = 0; b <= i; b++)
			{
			System.out.print(word.substring(0,c+1));
			}
			c++;
			System.out.println("");
		}
	}
}