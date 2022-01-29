//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality test = new StringEquality();
		test.setWords("hello", "goodbye");
		test.checkEquality();
		System.out.print(test);
		//add test cases

		
		test.setWords("same", "same");
		test.checkEquality();
		System.out.print(test);
		
		test.setWords("one", "two");
		test.checkEquality();
		System.out.print(test);
		
		test.setWords("ABC", "ABC");
		test.checkEquality();
		System.out.print(test);
		
	}
}