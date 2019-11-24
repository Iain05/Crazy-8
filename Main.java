import java.util.*;

class Main {

	public static Random rand;
	public static Scanner input;
	public static HashMap<Integer, String> cardIdToName;

  public static void main(String[] args) {
	cardIdToName = new HashMap<Integer, String>();

	cardIdToName.put(2, "2");
	cardIdToName.put(3, "3");
	cardIdToName.put(4, "4");
	cardIdToName.put(5, "5");
	cardIdToName.put(6, "6");
	cardIdToName.put(7, "7");
	cardIdToName.put(8, "8");
	cardIdToName.put(9, "9");
	cardIdToName.put(10, "10");
	cardIdToName.put(11, "Jack");
	cardIdToName.put(12, "Queen");
	cardIdToName.put(13, "King");
	cardIdToName.put(14, "Ace");

    input=new Scanner(System.in);
	rand = new Random();

	new Game();
  }

public static void ClearConsole() {
	System.out.print("\033[H\033[2J");
	}
}