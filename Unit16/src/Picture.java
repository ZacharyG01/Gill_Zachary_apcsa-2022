import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  public void keepOnlyBlue()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(0);
	        pixelObj.setGreen(0);
	      }
	    }
  }
  
  public void keepOnlyRed()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setBlue(0);
	        pixelObj.setGreen(0);
	      }
	    }
  }
  
  public void keepOnlyGreen()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(0);
	        pixelObj.setBlue(0);
	      }
	    }
  }
  
   public void encode(Picture messagePict)
  {
  Pixel[][] messagePixels = messagePict.getPixels2D();
  Pixel[][] currPixels = this.getPixels2D();
  Pixel currPixel = null;
  Pixel messagePixel = null;
  int count = 0;
  int blueRand = (int)(Math.random() * 4 + 2);
  int redRand = (int)(Math.random() * 4 + 2);
  int greenRand = (int)(Math.random() * 4 + 2);
  int r = 0;
  int c = 0;
  int redVal = currPixels[r][c].getRed();
  int greenVal = currPixels[r][c].getGreen();
  int blueVal = currPixels[r][c].getBlue();
  int maxrow = 0;
  int maxc = 0;
  int maxVal = Integer.MAX_VALUE;
  int divisor;
 
  //Sets rand variables to different values 2-5
  while (greenRand == blueRand)
  {
	  greenRand = (int)(Math.random()*4 + 2);
  }
  while (greenRand == redRand || redRand == blueRand)
  {
	  redRand = (int)(Math.random()*4 + 2);
  }
  
  //Encodes the image into current image
  for (int row = 0; row < this.getHeight(); row++)
  {
	  for (int col = 0; col < this.getWidth(); col++)
	  {
		  currPixel = currPixels[row][col];
		  
		  	messagePixel = messagePixels[row][col];
		  	//if the message is on that pixel, the RGB values get changed based on the random mods
		  	if (messagePixel.colorDistance(Color.BLACK) < 60)
		  	{
		  		count++;
		  		while (currPixel.getBlue() % blueRand != 0)
		  		{
		  			if (currPixel.getBlue() == 255)
		  				currPixel.setBlue(currPixel.getBlue() - 1);
		  			else
		  				currPixel.setBlue(currPixel.getBlue() + 1);
		  		}
		  		while (currPixel.getGreen() % greenRand != 0)
		  		{
		  			if (currPixel.getGreen() == 255)
		  				currPixel.setGreen(currPixel.getGreen() - 1);
		  			else
		  				currPixel.setGreen(currPixel.getGreen() + 1);
		  			
		  		}
		  		while (currPixel.getRed() % redRand != 0)
		  		{
		  			if (currPixel.getRed() == 255)
		  				currPixel.setRed(currPixel.getRed() - 1);
		  			else
		  				currPixel.setRed(currPixel.getRed() + 1);
		  		}
		  			
		  	}
		  	
		  	//if the message is not on that pixel, the RGB values get changed to not equal the random mods
		  	else
		  	{
		  		if (currPixel.getBlue() % blueRand == 0)
		  		{
		  			if (currPixel.getBlue() == 255)
		  				currPixel.setBlue(currPixel.getBlue() - 1);
		  			else
		  				currPixel.setBlue(currPixel.getBlue() + 1);
		  		}
		  		if (currPixel.getGreen() % greenRand == 0)
		  		{
		  			if (currPixel.getGreen() == 255)
		  				currPixel.setGreen(currPixel.getGreen() - 1);
		  			else
		  				currPixel.setGreen(currPixel.getGreen() + 1);
		  		}
		  		if (currPixel.getRed() % redRand == 0)
		  		{
		  			if (currPixel.getRed() == 255)
		  				currPixel.setRed(currPixel.getRed() - 1);
		  			else
		  				currPixel.setRed(currPixel.getRed() + 1);
		  		}
		  	}
	  }
  }
  
  //Sets the RGB to the count of msg pixels to decode the count later (red * green + blue == count)
  while (count - (redVal * greenVal) < -255)
  {
	  if (redVal > 0 && redVal >= greenVal)
		  redVal--;
	  else
		  greenVal--;
  }
  while (count - (redVal * greenVal) > 255)
  {
	  if (redVal < 255 && redVal <= greenVal)
		  redVal++;
	  else
		  greenVal++;
  }
  
  while (redVal * greenVal + blueVal != count)
  {
	  if (redVal * greenVal + blueVal < count)
		  blueVal++;
	  else
		  blueVal--;
  }
  
  
  //finds the most similar pixel
  for (int row = 0; row < this.getHeight(); row++)
  {
	  for (int col = 0; col < this.getWidth(); col++)
	  {
		  currPixel = currPixels[row][col];
		  if (Math.abs(currPixel.getBlue() - blueVal) + Math.abs(currPixel.getRed() - redVal) + Math.abs(currPixel.getGreen() - greenVal)  < maxVal )
		  {
			  maxrow = row;
			  maxc = col;
			  maxVal = Math.abs(currPixel.getBlue() - blueVal) + Math.abs(currPixel.getRed() - redVal) + Math.abs(currPixel.getGreen() - greenVal);
		  }
	  }
  }
  
  currPixels[maxrow][maxc].setBlue(blueVal);
  currPixels[maxrow][maxc].setRed(redVal);
  currPixels[maxrow][maxc].setGreen(greenVal);
  
  
  //Sets all of the blue values to even or odd based on what the count pixel is
  for (int row = 0; row < this.getHeight(); row++)
  {
	  for (int col = 0; col < this.getWidth(); col++)
	  {
		  currPixel = currPixels[row][col];
		  if (currPixels[maxrow][maxc].getBlue() % 2 == 0)
		  {
			  if (currPixel.getBlue() % 2 == 0 && currPixel != currPixels[maxrow][maxc])
				  currPixel.setBlue(currPixel.getBlue() + 1);
		  }
		  else if (currPixel != currPixels[maxrow][maxc])
			  if (currPixel.getBlue() == 255)
				  currPixel.setBlue(currPixel.getBlue() - 1);
			  else if (currPixel.getBlue() % 2 != 0)
				  currPixel.setBlue(currPixel.getBlue() + 1);
	  }
  }
  
  
  System.out.println(count);
  }

  
public Picture decode()
  {
	  int blueCount = 0;
	  int blueMod = 1;
	  int greenCount = 0;
	  int greenMod = 1;
	  int redCount = 0;
	  int redMod = 1;
	  int evencount = 0;
	  int oddcount = 0;
	  int count = 0;
	  int countr = 0;
	  int countc = 0;
	  
	  Pixel[][] pixels = this.getPixels2D();
	  int height = this.getHeight();
	  int width = this.getWidth();
	  Pixel currPixel = null;

	  Pixel messagePixel = null;
	  Picture messagePicture = new Picture(height,width);
	  Pixel[][] messagePixels = messagePicture.getPixels2D();
	  
	  //Blue value is decoded and count variable is set to the RGB values of the count pixel
	  
	  for (int row = 0; row < this.getHeight(); row++)
		{
		  for (int col = 0; col < this.getWidth(); col++)
		  {
			  currPixel = pixels[row][col];
			  if (currPixel.getBlue() % 2 == 0)
				  evencount++;
			  else
				  oddcount++;
		  }
		}
	  
	  for (int row = 0; row < this.getHeight(); row++)
		{
		  for (int col = 0; col < this.getWidth(); col++)
		  {
			  currPixel = pixels[row][col];
			  if (evencount > oddcount)
			  {
				  if (currPixel.getBlue() % 2 != 0)
				  {
					  countr = row;
					  countc = col;
				  }
					  
			  }
			  else
				  if (currPixel.getBlue() % 2 == 0)
				  {
					  countr = row;
					  countc = col;
				  }
		  }
		}
	  currPixel = pixels[countr][countc];
	  count = currPixel.getBlue() + currPixel.getRed() * currPixel.getGreen();
	  
	  //determines the random mod based on the count compared to the RGB count
	  for (int i = 2; i < 6; i++)
	  {
	  for (int row = 1; row < this.getHeight(); row++)
  		{
		  for (int col = 1; col < this.getWidth(); col++)
		  {
			  currPixel = pixels[row][col];
			  messagePixel = messagePixels[row][col];
				  if (currPixel.getBlue() % i == 0)
				  {
					  blueCount++;
				  }
				  if (currPixel.getRed() % i == 0)
				  {
					  redCount++;
				  }
				  if (currPixel.getGreen() % i == 0)
				  {
					  greenCount++;
				  }
		  }
			  
		  }
	  if (blueCount == count)
		  blueMod = i;
	  if (redCount == count)
		  redMod = i;
	  if (greenCount == count)
		  greenMod = i;
	  redCount = 0;
	  blueCount = 0;
	  greenCount = 0;
  		}
	  
	  
	  
	  //sets the image to show the message
	  for (int row = 1; row < this.getHeight(); row++)
  		{
		  for (int col = 1; col < this.getWidth(); col++)
		  {
			  currPixel = pixels[row][col];
			  messagePixel = messagePixels[row][col];
				  if (currPixel.getBlue() % blueMod == 0 && currPixel.getRed() % redMod == 0 && currPixel.getGreen() % greenMod == 0)
				  {
					  messagePixel.setColor(Color.BLACK);
				  }
		  }
			  
		  }
	  
	  
	  
  System.out.println("Total count : " + count);
  System.out.println("Count pixel row : " + countr);
  System.out.println("Count pixel col : " + countc);
  System.out.println("Red mod : " +redMod);
  System.out.println("Green mod : " + greenMod);
  return messagePicture;
  }
  
  
  
  
  
  
  
  
  public void negate()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(255-pixelObj.getRed());
	        pixelObj.setGreen(255-pixelObj.getGreen());
	        pixelObj.setBlue(255-pixelObj.getBlue());
	      }
	    }  
  }
  
  public void fixUnderwater()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	    	if ((pixelObj.getBlue() > 170 && pixelObj.getGreen() < 170) || (pixelObj.getRed() < 24 && pixelObj.getBlue() > 157))
	    		pixelObj.setBlue(50+pixelObj.getBlue());
	      }
	    }  
  }
  
  public void grayscale()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen() / 3);
	        pixelObj.setGreen(pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen() / 3);
	        pixelObj.setBlue(pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen() / 3);
	      }
	    }  
  }
  
  public void mirrorVerticalRightToLeft()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  int width = pixels[0].length;
	  for (int row = pixels.length-1; row >= 0; row--)
	  {
		  for (int col = width-1; col >= width / 2; col--)
		  {
			  leftPixel = pixels[row][col];
			  rightPixel = pixels[row][width - 1 - col];
		  	  rightPixel.setColor(leftPixel.getColor());
		  }
	  }
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int height = pixels.length;
    for (int row = 0; row < height / 2; row++)
    {
      for (int col = 0; col < pixels[0].length; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[height - 1 - row][col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int height = pixels.length;
    for (int row = height-1; row >= height / 2; row--)
    {
      for (int col = pixels[0].length-1; col >= 0; col--)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[height - 1 - row][col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorDiagonal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int height = pixels.length;
    int width = pixels[0].length;
    if (height > pixels[0].length)
    {
    	height = pixels[0].length;
    }
    for (int row = 0; row < height; row++)
    {
      for (int col = 0; col < height; col++)
      {
        leftPixel = pixels[col][row];
        rightPixel = pixels[row][col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        count++;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    System.out.print("Count: " + count);
  }
  
  public void mirrorArms()
  {
    int mirrorPoint = 170;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 155; row < 185; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 100; col < mirrorPoint; col++)
      {
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row+75]                       
                         [mirrorPoint - col + mirrorPoint+73];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    
    for (int row = 170; row < 195; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 240; col < 290; col++)
      {
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row+75]                       
                         [mirrorPoint - col + mirrorPoint+62];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  
  public void mirrorGull()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 230; row < 318; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 239; col < 344; col++)
      {
        count++;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row+10]                       
                         [mirrorPoint - col + mirrorPoint+160];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  
  
  public void copy3(Picture fromPic, 
          int startRow, int startCol, int cropStart, int cropEnd)
{
Pixel fromPixel = null;
Pixel toPixel = null;
Pixel[][] toPixels = this.getPixels2D();
Pixel[][] fromPixels = fromPic.getPixels2D();
for (int fromRow = 0, toRow = startRow; 
  fromRow < fromPixels.length &&
  toRow < toPixels.length; 
  fromRow++, toRow++)
{
for (int fromCol = cropStart, toCol = startCol; 
    fromCol < cropEnd &&
    toCol < toPixels[0].length;  
    fromCol++, toCol++)
{
 fromPixel = fromPixels[fromRow][fromCol];
 toPixel = toPixels[toRow][toCol];
 toPixel.setColor(fromPixel.getColor());
}
}   
}
  
  

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\gillz1500\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Unit16\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\images\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\flower1.jpg");
    Picture flower2 = new Picture("C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\gillz1500\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Unit16\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\images\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\flower2.jpg");
    //this.copy(flower1, 0, 0);
    this.copy3(flower1,100,0,10,50);
    this.copy3(flower2,200, 100, 10, 50);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy3(flowerNoBlue,300,50, 10, 50);
    //this.copy(flower1,400,0);
    //this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\gillz1500\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Unit16\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\images\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  
  public void edgeDetection2(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    Color bottomColor = null;
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        bottomPixel = pixels[row+1][col];
        topPixel = pixels[row][col];
        rightColor = rightPixel.getColor();
        bottomColor = bottomPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist || topPixel.colorDistance(bottomColor) > edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
    
    
   /* for (int col = 0; col < pixels[0].length; col++)
    {
    	for (int row = 0; row < pixels.length-1; row++)
    	{
    		topPixel = pixels[row][col];
    		bottomPixel = pixels[row+1][col];
    		bottomColor = bottomPixel.getColor();
    		if (topPixel.colorDistance(bottomColor) > 
            edgeDist)
    			topPixel.setColor(Color.BLACK);
    		else
    			topPixel.setColor(Color.WHITE);
    	}
    }
    */
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("C:\\\\\\\\Users\\\\\\\\gillz1500\\\\\\\\Desktop\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\Unit16\\\\\\\\src\\\\\\\\images\\\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
