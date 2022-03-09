//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;
import java.util.ArrayList;
public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
			Scanner file = new Scanner(new File("C:\\\\Users\\\\gillz1500\\\\Desktop\\\\Gill_Zachary_apcsa-2022\\\\Unit12\\\\src\\\\words.dat"));
			int size = file.nextInt();
			file.nextLine();
			String[] list = new String[size];
			for (int i = 0; i < size; i++)
			{
				String test = file.nextLine();
				list[i] = test;
			}
			
			
			for (int i = 0; i < list.length; i++) {
				int b = i;
				Word test = new Word(list[b]);
				for(int j = i; j < list.length; j++)
				{
					test = new Word(list[b]);
					Word test2 = new Word(list[j]);
					if (test.compareTo(test2) > 0)
					{
						b = j;
					}
				}
				String copy = list[i];
				list[i] = test.toString();
				list[b] = copy;
				
				
			}
			for (int i = 0; i < list.length; i++) {
				System.out.println(list[i]);
			}
		}









	
}
