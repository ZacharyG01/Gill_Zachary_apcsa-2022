//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i != 0) {
				if (str.charAt(i-1) == str.charAt(i)) {
					count++;
			}
		}}
		return count;
	}
}