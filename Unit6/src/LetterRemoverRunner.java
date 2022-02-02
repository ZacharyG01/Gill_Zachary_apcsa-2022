//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover();
		
		test.setRemover("I am Sam I am", 'a');
		out.print(test);
		//add test cases	
		
		test.setRemover("ssssssssxssssesssssesss", 's');
		out.print(test);
		
		test.setRemover("qwertyqwertyqwerty", 'a');
		out.print(test);
		
		test.setRemover("abababababa", 'b');
		out.print(test);
											
	}
}