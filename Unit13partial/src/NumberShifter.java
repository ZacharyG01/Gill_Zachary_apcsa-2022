//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] array = new int[size];
		for (int i = 0; i < size; i++)
		{
			array[i] = (int)((Math.random() * 10) + 1);
		}
		
		return array;
	}
	public static void shiftEm(int[] array)
	{
		System.out.println(Arrays.toString(array));
		int count7 = 0;
		int[] indexes;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == 7)
				count7++;
		}
		indexes = new int[count7];
		
		for (int i = 0, b = 0; i < array.length; i++)
		{
			if (array[i] == 7)
			{
				indexes[b] = i;
				b++;
			}
		}
		for (int i = 0; i < indexes.length; i++)
		{
			int tmp = array[i];
			array[indexes[i]] = tmp;
			array[i] = 7;
		}
		System.out.println(Arrays.toString(array) + "\n");
	}
}