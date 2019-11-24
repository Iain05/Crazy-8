import java.util.*;

public class Game {
	public static Stack<Card> deck = new Stack<Card>();
	public Game () {
		CreateDeck();
		for (Card c : deck) {
			System.out.println(c.GetCardName());
		}
	}

	void CreateDeck() {
		for(int i = 2;i < 15;i++) {
			deck.push(new Card(i, Card.Suit.Hearts));
			deck.push(new Card(i, Card.Suit.Diamonds));
			deck.push(new Card(i, Card.Suit.Clubs));
			deck.push(new Card(i, Card.Suit.Spades));
		}
	}
	
}