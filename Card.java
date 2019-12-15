class Card {
	public int number;
	public enum Suit {Hearts, Diamonds, Spades, Clubs}
		
	public Suit suit;

	public Card(int _number, Suit _suit) {
		number = _number;
		suit = _suit;
	}

	public String GetCardName() {
		return Main.cardIdToName.get(number) + " of " + suit;
	}
}