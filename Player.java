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
		System.out.println(Game.Pile.peek().GetCardName());
	}
}