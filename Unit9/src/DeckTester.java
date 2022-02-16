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
		String[] rank = { "1", "10", "3" };
		String[] suit = { "Hearts", "Spades" };
		int[] value = { 1, 10, 3 };
		Deck deckA = new Deck(rank, suit, value);
		System.out.println(deckA.isEmpty());
		System.out.println(deckA.deal());
		System.out.println(deckA.deal());
		System.out.println(deckA.deal());
		System.out.println(deckA.deal());
		System.out.println(deckA.deal());
		System.out.println(deckA.deal());
		System.out.println(deckA.deal());
		System.out.println(deckA.deal());
		System.out.println(deckA.deal());
		
	}
}
