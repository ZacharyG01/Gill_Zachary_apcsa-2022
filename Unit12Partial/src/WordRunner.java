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
		/*
		ArrayList<String> list = new ArrayList<String>();
		Scanner file = new Scanner(new File("C:\\Users\\gillz1500\\Desktop\\Gill_Zachary_apcsa-2022\\Unit12\\src\\words.dat"));

		int size = file.nextInt();
		file.nextLine();
		Word max = new Word("");
		for (int i = 0; i < size; i++)
		{
			Word name = new Word(file.next(), max.getWord());
			file.nextLine();
			
			if (name.compareTo(max) == 1)
			{
				max = name;
			}
		}
		System.out.println(max.getWord());
		Word min = new Word(max.getWord());
		/*Word name = new Word("a");
		for (int b = 0; b < size; b++)
		{
			Scanner file2 = new Scanner(new File("C:\\Users\\gillz1500\\Desktop\\Gill_Zachary_apcsa-2022\\Unit12\\src\\words.dat"));
			file2.nextLine();
			for (int i = 0; i < size; i++)
			{
				Scanner file3 = new Scanner(new File("C:\\Users\\gillz1500\\Desktop\\Gill_Zachary_apcsa-2022\\Unit12\\src\\words.dat"));
				file3.nextLine();
				for (int f = 0; f < list.size(); f++)
				{
				if (list.get(f) != file3.next())
					name = new Word(file3.next(), max.getWord());
				}
				file2.nextLine();
				for (int d = 0; d < list.size(); d++)
				{
					if (name.compareTo(min) == -1 && name.getWord() != list.get(d))
					{
						min = name;
						break;
					}
				}
			}*/
			Scanner file = new Scanner(new File("C:\\\\Users\\\\gillz1500\\\\Desktop\\\\Gill_Zachary_apcsa-2022\\\\Unit12\\\\src\\\\words.dat"));
			int size = file.nextInt();
			file.nextLine();
			String[] list = new String[size];
			for (int i = 0; i < size; i++)
			{
				String testing = file.nextLine();
				list[i] = testing;
			}
			
			
			for (int i = 0; i < list.length; i++) {
				int spot = i;
				Word test = new Word(list[spot]);
				for(int j = i; i < list.length; j++)
				{
					test = new Word(list[spot]);
					Word test2 = new Word(list[j]);
					if (test.compareTo(test2) > 0)
					{
						spot = j;
					}
				}
				String save = list[i];
				list[i] = test.toString();
				list[spot] = save;
				
				
			}
			for (int i = 0; i < list.length; i++) {
				System.out.println(list[i]);
			}
		}











	
}