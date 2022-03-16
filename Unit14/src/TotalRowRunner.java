//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		TotalRow test = new TotalRow();
		test.getRowTotals(new int[][]{{1,2,3,4}, {7,9,10,1}});
		test.getRowTotals(new int[][]{{0,0,0,0,0,0}, {4,3,2}});
		test.getRowTotals(new int[][]{{5,6,1,2}, {7,10,10,10,10,10}});
		test.getRowTotals(new int[][]{{0,6,1,7}, {7,1,5,13,12,1}, {1000, 100, 10}, {1,2,3}});
		//add code here			
	}
}



