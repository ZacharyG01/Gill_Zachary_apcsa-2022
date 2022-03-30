//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;
    private int row;
    private int col;
    
    public WordSearch( int size, String str )
    {
    	int d = 0;
    	row = size;
    	col = str.length() / row;
    	m = new String[row][col];
    	for (int i = 0; i < row; i++)
    	{
    		for (int b = 0; b < col; b++)
    		{
    			m[i][b] = str.substring(d, d+1);
    			d++;
    		}
    	}
  
    }

    public boolean isFound( String word )
    {
    	if (checkRight(word, row, col) || checkLeft(word, row, col) || checkUp(word, row, col) || checkDown(word, row, col) || checkDiagUpRight(word, row, col) || checkDiagUpLeft(word, row, col) || checkDiagDownLeft(word, row, col) || checkDiagDownRight(word, row, col))
    		return true;
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		String tmp = "";
		String tmp2 = "";
		for (int row = 0; row < r; row++) 
		{
			for (int col = 0; col < c; col++)
			{
				tmp += m[row][col]; 
			}
			for (int i = 0; i < tmp.length() - w.length(); i++)
			{
				tmp2 = tmp.substring(i, w.length() + i);
				if (tmp2.equals(w))
				{
					return true;
				}
			}
			tmp = "";
		}
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		String tmp = "";
		String tmp2 = "";
		for (int row = 0; row < r; row++) 
		{
			for (int col = c-1; col >= 0; col--)
			{
				tmp += m[row][col]; 
			}
			for (int i = 0; i < tmp.length() - w.length(); i++)
			{
				tmp2 = tmp.substring(i, w.length() + i);
				if (tmp2.equals(w))
				{
					return true;
				}
			}
			tmp = "";
		}
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		String tmp = "";
		String tmp2 = "";
		for (int col = 0; col < c; col++) 
		{
			for (int row = r-1; row >= 0; row--)
			{
				tmp += m[row][col];
			}
			for (int i = 0; i < tmp.length() - w.length(); i++)
			{
				tmp2 = tmp.substring(i, w.length() + i);
				if (tmp2.equals(w))
				{
					return true;
				}
			}
			tmp = "";
		}
	   return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
		String tmp = "";
		String tmp2 = "";
		for (int col = 0; col < c; col++) 
		{
			for (int row = 0; row < r; row++)
			{
				tmp += m[row][col];
			}
			for (int i = 0; i < tmp.length() - w.length(); i++)
			{
				tmp2 = tmp.substring(i, w.length() + i);
				if (tmp2.equals(w))
				{
					return true;
				}
			}
			tmp = "";
		}
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		String tmp = "";
		String tmp2 = "";
		/*tmp ==[7][7]
		 * 		[7][6] [6][7] 
		 * 		[7][5] [6][6] [5][7]
		 * 		
		 * 
		 */
		for (int col = r-1; col >= 0; col--) 
		{
			for (int rows = r-1, f = 0; rows >= col; rows--, f++)
			{
				tmp += m[rows][col+f];
				//System.out.println(rows + "  " + (col + f));
			}
			for (int i = 0; i < tmp.length() - w.length(); i++)
			{
				tmp2 = tmp.substring(i, w.length() + i);
				if (tmp2.equals(w))
				{
					return true;
				}
			}
			tmp = "";
		}
		
		for (int rows = 0; rows <= r-1; rows++) 
		{
			for (int  col = 0, f = 0; col <= rows; col++, f++)
			{
				tmp += m[rows-f][col];
				//System.out.println(rows + "  " + (col + f));
			}
			for (int i = 0; i < tmp.length() - w.length(); i++)
			{
				tmp2 = tmp.substring(i, w.length() + i);
				if (tmp2.equals(w))
				{
					return true;
				}
			}
			tmp = "";
		}
		
	   return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		
		String tmp = "";
		String tmp2 = "";
		/*tmp ==[7][0]
		 * 		[7][1] [6][0] 
		 * 		[7][2] [6][1] [5][0]
		 * 		
		 * 
		 */
		for (int col = 0; col <= r-1; col++) 
		{
			for (int rows = 0, f = r-1, t = 0; rows <= col; rows++, f--, t--)
			{
				tmp += m[rows+f+t][col+t];
				//System.out.println((rows+f+t) + "  " + (col+t));
			}
			for (int i = 0; i < tmp.length() - w.length(); i++)
			{
				tmp2 = tmp.substring(i, w.length() + i);
				if (tmp2.equals(w))
				{
					return true;
				}
			}
			tmp = "";
		}
		
		/*tmp ==[0][7]
		 * 		[1][7] [0][6] 
		 * 		[2][7] [1][6] [0][5]
		 * 		
		 * 
		 */
		
		for (int rows = 0; rows <= r-1; rows++) 
		{
			for (int col = 0, f = r-1, t = 0; col <= rows; col++, f--, t--)
			{
				tmp += m[rows+t][col+f+t];
				//System.out.println((rows+f+t) + "  " + (col+t));
			}
			for (int i = 0; i < tmp.length() - w.length(); i++)
			{
				tmp2 = tmp.substring(i, w.length() + i);
				if (tmp2.equals(w))
				{
					return true;
				}
			}
			tmp = "";
		}
		
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		String tmp = "";
		String tmp2 = "";
		/*tmp ==[7][0]
		 * 		[6][0] [7][1] 
		 * 		[5][0] [6][1] [7][2]
		 * 		
		 * 
		 */
		for (int rows = r-1, p = 0; rows <= r-1; rows--, p++) 
		{
			if (rows == 0)
				break;
			for (int col = 0, f = 0; col <= p; col++, f++)
			{
				
				tmp += m[rows+f][col];
				//System.out.println((rows+f) + "  " + (col));
			}
			for (int i = 0; i < tmp.length() - w.length(); i++)
			{
				tmp2 = tmp.substring(i, w.length() + i);
				if (tmp2.equals(w))
				{
					return true;
				}
			}
			tmp = "";
		}
		/*tmp ==[0][7]
		 * 		[1][7] [0][6] 
		 * 		[2][7] [1][6] [0][5]
		 * 		
		 * 
		 */
		
		for (int rows = 0; rows <= r-1; rows++) 
		{
			for (int col = 0, f = r-1, t = 0; col <= rows; col++, f--, t--)
			{
				tmp += m[rows+t][col+f+t];
				//System.out.println((rows+f+t) + "  " + (col+t));
			}
			for (int i = 0; i < tmp.length() - w.length(); i++)
			{
				tmp2 = tmp.substring(i, w.length() + i);
				if (tmp2.equals(w))
				{
					return true;
				}
			}
			tmp = "";
		}
		
		
		
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		return false;
	}

    public String toString()
    {
    	String output = "";
    	for (String[]x : m)
    	{
    		for (String y : x)
    		{
    			output += y + " ";
    		}
    		output += "\n";
    	}
 		return output;
    }
}
