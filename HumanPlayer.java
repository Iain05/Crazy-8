public class HumanPlayer extends Player {
	public HumanPlayer(String _name) {
		super(_name);
	}
	
	public void doTurn() {
		super.doTurn();
		OrganizeHand();
		DisplayHand();
		System.out.print("select the card you want to play or press n to take from the deck");
		PickCard();
	}
	void DisplayHand () {
    	for (int i = 0; i < cardsInHand.size(); i++) {
      		Card c = cardsInHand.get(i);
      		System.out.println("[" + i + "] "+ c.GetCardName());
    	}
 	 }

  	void PickCard () {
    	try {
      		String input = Main.input.nextLine();
      		if (input.equals("n")) {
        		GetCardFromDeck();
        		return;
     		}
      		
			int i = Integer.parseInt(input);
      		Card c = cardsInHand.get(i);
      		if (!TryPlayCard(c)) {
        		System.out.println("that card can't go on the pile");
        		PickCard ();
      		}
    	}
    	
		catch (Exception e) {
      		System.out.println(e.getMessage());
      		PickCard ();
    	}
  	}
	void OrganizeHand () {
		int n = cardsInHand.size(); 
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (cardsInHand.get(j).number > cardsInHand.get(j+1).number) { 
					Card temp = cardsInHand.get(j);
					cardsInHand.set(j, cardsInHand.get(j+1));
					cardsInHand.set(j+1, temp);
				}
			}
		}
  	}
}