import java.util.*;

public class Game {
	public static Stack<Card> deck = new Stack<Card>();
	public static Stack<Card> pile = new Stack<Card>();
	List<Player> players;
	int nCardsPerPlay = 7;

	public Game () {
		CreateDeck();
		ShuffleDeck();

		players = new ArrayList<Player>();
		players.add(new HumanPlayer("name1"));
		players.add(new AIPlayer("name2"));

		//hand out cards
		HandOutCards();
		pile.push(deck.pop());


		for(Card c : deck) {
      		System.out.println(c.GetCardName());
    	}

    	while (true) {
     		for(Player p : players) {
        		p.doTurn();
				if (p.cardsInHand.size() == 0) {
          			System.out.println(p.name + " you win! ");
            		return;
       			 }
      		}
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
			for (int i = 0; i <nCardsPerPlay; i++) { // for loop
				Card topCard = deck.pop();
				p.cardsInHand.add(topCard);
			}
		}
	}


	
}