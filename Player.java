import java.util.*;

public class Player {
	public String name;
	public List<Card> cardsInHand = new ArrayList<>();

	public Player(String _name) {
		name = _name;
	}

	public void doTurn() { 
		Main.ClearConsole();
		System.out.println("it's " + name + "'s turn");
		System.out.println("Card on pile");
		System.out.println(Game.pile.peek().GetCardName());
		System.out.println("------");
	}

	boolean TryPlayCard (Card c) {
    	Card topCard = Game.pile.peek();
    
    	boolean canPlay = false;
    
    	if (c.number == 8 || topCard.number == c.number || topCard.suit == c.suit) {
      		canPlay = true;
    	}

    	if (canPlay) {
      		cardsInHand.remove(c);
      		Game.pile.push(c);
    	}
    		return canPlay;
  	}

  	void GetCardFromDeck () {
    	Card c = Game.deck.pop();
    	cardsInHand.add(c);
  	}
}