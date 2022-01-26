//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		
		System.out.println("12 is odd :: " + NumberVerify.isOdd(12));
		System.out.println("12 is even :: " + NumberVerify.isEven(12));
		
		System.out.println("-6 is odd :: " + NumberVerify.isOdd(-6));
		System.out.println("-6 is even :: " + NumberVerify.isEven(-6));
		
		System.out.println("-21 is odd :: " + NumberVerify.isOdd(-21));
		System.out.println("-21 is even :: " + NumberVerify.isEven(-21));
		
		System.out.println("1023 is odd :: " + NumberVerify.isOdd(1023));
		System.out.println("1023 is even :: " + NumberVerify.isEven(1023));
		
		System.out.println("100 is odd :: " + NumberVerify.isOdd(100));
		System.out.println("100 is even :: " + NumberVerify.isEven(100));
		
		//add in more test cases
	}
}