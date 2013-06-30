import java.util.Scanner;
public class Mastermind {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int pegs, colors, count = 0, win = 0;
		System.out.println("Enter the number of pegs (1-10): ");
		pegs = in.nextInt();
		System.out.println("Enter the number of colors (1-9): ");
		colors = in.nextInt();
		
		MastermindGame game = new MastermindGame(pegs, colors);
		
		do{
			if(!(game.equals())){
				System.out.println();
				System.out.println(game.guess());
			}else{
				System.out.println("You have broken the code in " + game.getCount() + " guesses.");
				win = 1;
			}
			count++;
		}while(count < 10 && win != 1);

	}

}
