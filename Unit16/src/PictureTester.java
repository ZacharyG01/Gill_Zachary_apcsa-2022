/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("C:\\\\\\\\Users\\\\\\\\gillz1500\\\\\\\\Desktop\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\Unit16\\\\\\\\src\\\\\\\\images\\\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	  Picture beach = new Picture("C:\\\\\\\\Users\\\\\\\\gillz1500\\\\\\\\Desktop\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\Unit16\\\\\\\\src\\\\\\\\images\\\\beach.jpg");
	    beach.explore();
	    beach.keepOnlyBlue();
	    beach.explore();
  }
  
  public static void testKeepOnlyGreen()
  {
	  Picture beach = new Picture("C:\\\\\\\\Users\\\\\\\\gillz1500\\\\\\\\Desktop\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\Unit16\\\\\\\\src\\\\\\\\images\\\\beach.jpg");
	    beach.explore();
	    beach.keepOnlyGreen();
	    beach.explore();
  }
  
  
  public static void testKeepOnlyRed()
  {
	  Picture beach = new Picture("C:\\\\\\\\Users\\\\\\\\gillz1500\\\\\\\\Desktop\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\Unit16\\\\\\\\src\\\\\\\\images\\\\beach.jpg");
	    beach.explore();
	    beach.keepOnlyRed();
	    beach.explore();
  }
  
  public static void testNegate()
  {
	  Picture beach = new Picture("C:\\\\\\\\Users\\\\\\\\gillz1500\\\\\\\\Desktop\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\Unit16\\\\\\\\src\\\\\\\\images\\\\beach.jpg");
	    beach.explore();
	    beach.negate();
	    beach.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture beach = new Picture("C:\\\\\\\\Users\\\\\\\\gillz1500\\\\\\\\Desktop\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\Unit16\\\\\\\\src\\\\\\\\images\\\\beach.jpg");
	    beach.explore();
	    beach.grayscale();
	    beach.explore();
  }
  
  public static void testFixUnderwater()
  {
	  Picture water = new Picture("C:\\\\\\\\Users\\\\\\\\gillz1500\\\\\\\\Desktop\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\Unit16\\\\\\\\src\\\\\\\\images\\\\water.jpg");
	    water.explore();
	    water.fixUnderwater();
	    water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\gillz1500\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\\\\\\\\\Unit16\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\images\\\\\\\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\gillz1500\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\\\\\\\\\Unit16\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\images\\\\\\\\redmotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\gillz1500\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\\\\\\\\\Unit16\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\images\\\\\\\\redmotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\gillz1500\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\\\\\\\\\Unit16\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\images\\\\\\\\redmotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  
  public static void testMirrorDiagonal()
  {
    Picture caterpillar = new Picture("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\gillz1500\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\\\\\\\\\Unit16\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\images\\\\\\\\beach.jpg");
    caterpillar.explore();
    caterpillar.mirrorDiagonal();
    caterpillar.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\gillz1500\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Unit16\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\images\\\\\\\\\\\\\\\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture temple = new Picture("C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\gillz1500\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Unit16\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\images\\\\\\\\\\\\\\\\snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture temple = new Picture("C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\gillz1500\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Unit16\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\images\\\\\\\\\\\\\\\\seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }
  
  public static void testCopy(Picture fromPic, int startRow, int startCol, int cropStart, int cropEnd)
  {
	  Picture temple = new Picture("C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\gillz1500\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Unit16\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\images\\\\\\\\\\\\\\\\seagull.jpg");
	    temple.explore();
	    temple.copy3(fromPic, startRow, startCol, cropStart, cropEnd);
	    temple.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\gillz1500\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Unit16\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\images\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\gillz1500\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Unit16\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\images\\\\\\\\\\\\\\\\swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
	  Picture swan = new Picture("C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\gillz1500\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Unit16\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\images\\\\\\\\\\\\\\\\swan.jpg");
	    swan.explore();
	    swan.edgeDetection2(20);
	    swan.explore();
  }

	
public static void testEncode()
{
	Picture beach = new Picture("C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\gillz1500\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Unit16\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\images\\\\\\\\\\\\\\\\beach.jpg");
	Picture msg = new Picture("C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\gillz1500\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Unit16\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\images\\\\\\\\\\\\\\\\msg.jpg");
	beach.explore();
	beach.encode(msg);
	beach.explore();
	Picture dec = new Picture(beach.decode());
	dec.explore();
	
}
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	  testEncode();
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy(new Picture("C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\gillz1500\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Gill_Zachary_apcsa-2022\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Unit16\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\images\\\\\\\\\\\\\\\\temple.jpg"), 45, 45, 100, 300);
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}
