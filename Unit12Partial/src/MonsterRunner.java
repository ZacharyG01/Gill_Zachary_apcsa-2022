//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.print("Enter 1st monster's name : ");
		String name = keyboard.next();
		System.out.print("Enter 1st monster's size : ");
		int size = keyboard.nextInt();
		
		
		//instantiate monster one
		Monster skeleton1 = new Skeleton(name, size);
		
		//ask for name and size
		System.out.print("Enter 2nd monster's name : ");
		String name2 = keyboard.next();
		System.out.print("Enter 2nd monster's size : ");
		int size2 = keyboard.nextInt();
		
		//instantiate monster two
		Monster skeleton2 = new Skeleton(name2, size2);
		
		System.out.println("Monster 1 - " + skeleton1);
		System.out.println("Monster 2 - " + skeleton2);
		
		
		if (skeleton1.isBigger(skeleton2))
		{
			System.out.println("Monster one is bigger than monster two");
		}
		else
			System.out.println("Monster one is smaller than monster two");
		if (skeleton1.namesTheSame(skeleton2))
			System.out.println("Monster one has the same name as Monster two");
		else
			System.out.println("Monster one does not have the same name as Monster two");
			
		
	}
}