//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect test = new Perfect();
		test.setInt(496);
		out.print(test);
		//add test cases
		test.setInt(45);
		out.print(test);
		
		test.setInt(6);
		out.print(test);
		
		test.setInt(33550336);
		out.print(test);
																
	}
}