//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for (int i = 0; i < rows; i++)
		{
			for (int b = 0; b < cols; b++)
			{
				int random = (int)(Math.random() * vals.length);
				grid[i][b] = vals[random];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int max = 0;
		int pos = 0;
		for (int i = 0; i < vals.length; i++)
		{
			if (countVals(vals[i]) > max)
			{
				max = countVals(vals[i]);
				pos = i;
			}
		}
		return vals[pos];
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for (String[] row : grid)
    	{
    		for(String num : row)
    		{
    			if (num == val)
    				count++;
    		}
    	}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		System.out.println("Matrix Values");
    	for (String[] row : grid)
    	{
    		for(String num : row)
    		{
    			output += num + " ";
    		}
    		output+= "\n";
    	}
		return output;
	}
}