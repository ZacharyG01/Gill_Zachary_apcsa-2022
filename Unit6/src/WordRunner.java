//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word test = new Word();
		test.setString("Hello");
		out.print(test);
		//add test cases		
		test.setString("World");
		out.print(test);
		
		test.setString("UIL");
		out.print(test);
		
		test.setString("JukeBox");
		out.print(test);
	}
}