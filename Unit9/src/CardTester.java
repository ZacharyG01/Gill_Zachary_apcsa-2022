/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card cardA = new Card("9", "Hearts", 9);
		Card cardB = new Card("2", "Diamonds", 2);
		Card cardC = new Card("9", "Hearts", 9);
		System.out.println(cardA);
		System.out.println(cardB);
		System.out.println(cardC);
		System.out.println(cardA.matches(cardB));
		System.out.println(cardA.matches(cardC));
		
	}
}
