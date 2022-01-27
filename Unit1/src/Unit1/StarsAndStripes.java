package Unit1;

//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
 public StarsAndStripes()
 {
    out.println("StarsAndStripes");
    printTwoBlankLines();
    printASmallBox();
    printTwoBlankLines();
    printABigBox();
 }

 public void printTwentyStars()
 {
	 out.println("********************");
 }

 public void printTwentyDashes()
 {
	 out.println("--------------------");
 }

 public void printTwoBlankLines()
 {
	 out.println("");
	 out.println("");
 }
 
 public void printASmallBox()
 {	
	 printTwentyStars();
	 printTwentyDashes();
	 printTwentyStars();
	 printTwentyDashes();
 }

 public void printABigBox()
 { 	
	 printTwentyStars();
	 printTwentyStars();
	 printTwentyDashes();
	 printTwentyDashes();
	 printTwentyStars();
	 printTwentyStars();
 }   
}