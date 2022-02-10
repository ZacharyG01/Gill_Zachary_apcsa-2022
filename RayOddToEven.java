//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int count = 0;
		int c = 0;
		for (int i = 0; i < ray.length; i++) 
		{
		
			if (ray[i] % 2 != 0) {
				while ((ray[i] % 2 != 0) && (i < ray.length-1)) 
				{
					count++;
					i++;
				}
				break;
					
			}
		}
		for (int i = 0; i < ray.length; i++) 
		{
			if (ray[i] % 2 != 0) {
				c = i;
				break;
			}

		}
				for (int b = c; b < ray.length; b++) {
					if (ray[b] % 2 == 0 && count != 0)
						return count;
					
				}
			
		
		
		return -1;
		
	}
}