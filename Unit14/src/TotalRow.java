//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	System.out.print("Row Totals are :: [");
    	int tmp = 0;
    	int count = 0;
    	for (int[] row : m)
    	{
    		
    		for(int num : row)
    		{
    			
    			count += num;
    		}
    		if (tmp == 1)
    			System.out.print("," + count);
    		else
    			System.out.print(count);
    		tmp = 1;
    		count =  0;
    	}
    	System.out.println("]");
    	//add code here
		return null;
    }
}
