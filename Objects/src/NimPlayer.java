import java.util.Scanner;


public class NimPlayer {
	
	/*
	 * tells if the user's entry is valid or not
	 * PRE: num and stones are positive
	 * POST: Returns a boolean value
	 */
	public boolean isValidEntry(int num, int stones){
		if(num >= 1 && num <= 3 && num <= stones){
			return true;
		}else{
			return false;
		}
	}
	
	/*
	 * takes the user's input and calls on isValidEntry() to see if it is valid
	 * PRE: stones > 0
	 * POST: returns a valid entry for the user's turn
	 */
	public int playerTurn(int stones){
		Scanner in = new Scanner(System.in);
		int player;
		player = in.nextInt();
		do{
			if(!(isValidEntry(player, stones))){
				System.out.println("You must take either 1, 2, or 3 and you cannot take more than the number that is there.");
				player = in.nextInt();
			}
		}while(!(isValidEntry(player, stones)));
		return player;
	}

}
