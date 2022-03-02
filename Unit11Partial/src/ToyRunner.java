//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.ArrayList;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy toy1 = new Toy();
		toy1.setName("hello");
		toy1.setCount(4);
		out.println(toy1);

		toy1.setName("toy");
		toy1.setCount(7);
		out.println(toy1);
		
		toy1.setName("buzz");
		toy1.setCount(1);
		out.println(toy1);
	}
}