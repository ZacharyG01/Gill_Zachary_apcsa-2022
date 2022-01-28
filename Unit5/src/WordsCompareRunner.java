//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   WordsCompare test = new WordsCompare();
	   test.setWords("abc", "cba");
	   test.compare();
	   System.out.print(test);
		//add test cases
	   
	   test.setWords("fun", "funny");
	   test.compare();
	   System.out.print(test);

	   test.setWords("goofy", "godfather");
	   test.compare();
	   System.out.print(test);
	}
}