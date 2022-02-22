/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] rank = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		String[] suit = { "Hearts", "Spades", "Clubs", };
		int[] value = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Deck deckA = new Deck(rank, suit, value);
		System.out.println(deckA);
		deckA.shuffle();
		System.out.println(deckA.deal());
		System.out.println(deckA.deal());
		System.out.println(deckA);
		
	}
}
