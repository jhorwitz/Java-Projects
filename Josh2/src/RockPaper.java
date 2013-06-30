
import java.util.Scanner;
import java.lang.Math;

public class RockPaper {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int player1, player2;
		
		System.out.println("Enter a choice (Rock = 1, Paper = 2): ");
		player1 = in.nextInt();
		in.close();
		player2 = (int) (2*Math.random() + 1);
		
		if(player1 == 1)
			System.out.println("Player1 picks rock");
		else
			System.out.println("Player1 picks paper");
		
		if(player2 == 1)
			System.out.println("Player2 (the computer) picks rock");
		else
			System.out.println("Player2 (the computer) picks paper");
		
		if(player1 == player2)
			System.out.println("Player1 WINS!");
		else
			System.out.println("The computer WINS!");
			
		

	}

}
