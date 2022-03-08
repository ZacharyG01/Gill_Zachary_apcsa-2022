//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;
	private String other;
	
	public Word( String s)
	{
		word = s;
	}
	public Word( String s , String oth)
	{
		word = s;
		other = oth;
	}
	
	public boolean order()
	{
		for (int i = 0; i < word.length(); i++)
		{
			if (!(word.charAt(i) == (other.charAt(i))))
			{
				char a = word.charAt(i);
				char b = other.charAt(i);
				if (a > b)
						{
							return true;
						}
				return false;
			}
		}
		return true;
	}

	public int compareTo( Word rhs )
	{
		
		other = rhs.word;
		if (word.length() > other.length())
			return 1;
		if (word.length() < other.length())
			return -1;
		return 0;
	}
	
	public String toString()
	{
		return word;
	}
}