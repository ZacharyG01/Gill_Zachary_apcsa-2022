//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{

		int count = 0;
		int c = 0;
		for (int i = 0; i < ray.size(); i++) 
		{
		
			if (ray.get(i) % 2 != 0) {
				while ((ray.get(i) % 2 != 0) && (i < ray.size()-1)) 
				{
					count++;
					i++;
				}
				break;
					
			}
		}
		for (int i = 0; i < ray.size(); i++) 
		{
			if (ray.get(i) % 2 != 0) {
				c = i;
				break;
			}

		}
				for (int b = c; b < ray.size(); b++) {
					if (ray.get(b) % 2 == 0 && count != 0)
						return count;
					
				}
			
		
		
		return -1;
		
	}
	}
