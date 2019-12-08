public class AIPlayer extends Player {
	public AIPlayer(String _name) {
		super(_name);
	}
	
	public void doTurn() {
		super.doTurn();
		System.out.print("The AI does it's turn here");
		Main.input.nextLine();
	}
}