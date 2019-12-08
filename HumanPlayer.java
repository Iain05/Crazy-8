public class HumanPlayer extends Player {
	public HumanPlayer(String _name) {
		super(_name);
	}
	
	public void doTurn() {
		super.doTurn();
		System.out.print("The Player does it's turn here");
		Main.input.nextLine();
	}
}