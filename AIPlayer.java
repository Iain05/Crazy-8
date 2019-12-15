public class AIPlayer extends Player {
	public AIPlayer(String _name) {
		super(_name);
	}
	
	public void doTurn() {
		super.doTurn();
		PlayCard();
		
		System.out.print(name + " has " + cardsInHand.size() + " cards left");
		Main.input.nextLine();
	}

	 void PlayCard() {
    for (Card c : cardsInHand)
    {
      if (TryPlayCard(c))
      {
        System.out.println(name + " played " + c.GetCardName());
        return;
      }
    }

    System.out.println(name + " picked a new card from the deck ");
    GetCardFromDeck();
  }
}