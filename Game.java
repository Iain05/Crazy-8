import java.util.*;

public class Game {
	public static Stack<Card> deck = new Stack<Card>();
	public static Stack<Card> Pile = new Stack<Card>();
	List<Player> players;
	final int MAX_CARDS_PLAYER = 7;

	public Game () {
		CreateDeck();
		ShuffleDeck();

		players = new ArrayList<Player>();
		players.add(new HumanPlayer("name1"));
		players.add(new AIPlayer("name2"));

		//hand out cards
		HandOutCards();
		Pile.push(deck.pop());

		for (Player p : players) {
			p.doTurn();
		}
		// for (Card c : deck) {
		// 	System.out.println(c.GetCardName());
		// }
	}

	void CreateDeck() {
		for(int i = 2;i < 15;i++) {
			deck.push(new Card(i, Card.Suit.Hearts));
			deck.push(new Card(i, Card.Suit.Diamonds));
			deck.push(new Card(i, Card.Suit.Clubs));
			deck.push(new Card(i, Card.Suit.Spades));
		}
	}

	void ShuffleDeck() {
		for(int i = 0; i <deck.size(); i++) {
			int r = Main.rand.nextInt(deck.size());
			Card temp = deck.get(r);
			deck.set(r, deck.get(i));
			deck.set(i, temp);
		}
	}

	void HandOutCards() {
		for(Player p : players) { //for each loop
			for (int i = 0; i <MAX_CARDS_PLAYER; i++) { // for loop
				Card topCard = deck.pop();
				p.cardsInHand.add(topCard);
			}
		}
	}


	
}