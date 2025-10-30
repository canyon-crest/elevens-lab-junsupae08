package Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester1 {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card1 cardOne = new Card1("King", "Spades", 13);
		Card1 cardTwo = new Card1("Queen", "Hearts", 12);
		Card1 cardThree = new Card1("Jack", "Clubs", 11);
		System.out.println(cardOne.suit());
		cardTwo.matches(cardThree);
		cardThree.toString();
	}
}
