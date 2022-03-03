//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numer;
	private int denom;
	
	//write two constructors
	public Rational()
	{
		setRational(1, 1);
	}
	
	public Rational(int num, int den)
	{
		setRational(num, den);
	}
	


	//write a setRational method
	public void setRational(int num, int den)
	{
		numer = num;
		denom = den;
	}
	

	//write  a set method for numerator and denominator
	

	
	public void add(Rational  other)
	{
		numer = (numer * other.den()) + (other.num() * denom);
		denom = gcd(denom, other.den());
		
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		


		reduce();
	}

	private void reduce()
	{
		int reduce = 1;
		if (numer == denom)
		{
			numer = 1;
			denom = 1;
		}
		for (int i = 1; i <= numer && i <= denom; i++)
		{
				if (numer % i == 0 && denom % i == 0)
				{
					reduce = i;
				}
		}
		numer = numer / reduce;
		denom = denom / reduce;


	}

	private int gcd(int numOne, int numTwo)
	{
		

		return numOne * numTwo;
	}

	public Object clone ()
	{
		Object test = new Rational();
		return test;
	}

	//ACCESSORS

	//write get methods for numerator and denominator
	public int num()
	{
		return numer;
	}
	public int den()
	{
		return denom;
	}
	
	
	public boolean equals( Object obj)
	{
		return toString().equals(obj.toString());
	}

	public int compareTo(Rational other)
	{
		return toString().compareTo(other.toString());
	}



	
	//write  toString() method
	public String toString()
	{
		reduce();
		return numer + "/" + denom;
	}
	
	
}
