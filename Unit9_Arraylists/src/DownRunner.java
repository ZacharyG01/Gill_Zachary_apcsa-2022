import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{					
		ArrayList<Integer> arraylist;
		arraylist = new ArrayList<Integer>();
		arraylist.add(7);
	    arraylist.add(6);
	    arraylist.add(5);
	    arraylist.add(4);
	    arraylist.add(3);
	    arraylist.add(2);
	    arraylist.add(1);
		ListDown test = new ListDown();
		System.out.println(test.go(arraylist));
		arraylist.clear();
		arraylist.add(100);
	    arraylist.add(2);
	    arraylist.add(3);
	    arraylist.add(4);
	    arraylist.add(5);
	    arraylist.add(6);
	    arraylist.add(7);
	    System.out.println(test.go(arraylist));
	}
}