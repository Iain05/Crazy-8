class Card {
	public int number;
	public enum Suit {Hearts, Diamonds, Spades, Clubs}
		
	public Suit mySuit;

	public Card(int number, Suit mySuit) {
		this.number = number;
		this.mySuit = mySuit;
	}

	public String GetCardName() {
		return Main.cardIdToName.get(number) + " of " + mySuit;
	}
}