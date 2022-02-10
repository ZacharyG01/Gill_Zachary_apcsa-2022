//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	int count;
	public RaySumLast() {
		count = 0;
	}
	public static int go(int[] ray)
	{
		int count = 0;
		for (int i = 0; i < ray.length; i++) 
		{
			if (ray[i] > ray[ray.length-1])
				count += ray[i];
		}
		if (count == 0)
			return -1;
		return count;
	}
}