//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MatrixCount1Runner
{
	public static void main( String args[] ) throws Exception
	{
		//add code
		MatrixCount1 test = new MatrixCount1();
		test.print();
		System.out.println();
		System.out.println("There are " + test.count(2) + " 2s");
		System.out.println("There are " + test.count(11) + " 11s");
		System.out.println("There are " + test.count(0) + " 0s");
		System.out.println("There are " + test.count(9) + " 9s");
	}
}



