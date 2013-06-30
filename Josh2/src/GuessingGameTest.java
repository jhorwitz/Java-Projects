
import java.util.Scanner;

public class GuessingGameTest {

	/*
	 * Gets the user's guess
	 * PRE: NONE
	 * POST: returns an integer
	 */
	public static int getUserGuess(){
		Scanner in = new Scanner(System.in);
		return (in.nextInt());
		
	}
	
	/*
	 * gets a random number
	 * PRE: NONE
	 * POST: returns an integer
	 */
	public static int getRandomNum(){
		return (int)((20 - 1 + 1)*Math.random() + 1);
	}
	
	/*
	 * gives a hint
	 * PRE: guess and NUM are between 1 and 20, inclusive
	 * POST: returns a string
	 */
	public static String giveHint(int guess, final int NUM){
		if(guess > NUM)
			return ("Too high. Guess again.");
		else if(guess < NUM)
			return ("Too Low. Guess again.");
		else
			return ("You guessed it!");
	}
	
	/*
	 * loop to play game
	 * PRE: NONE
	 * POST: NONE
	 */
	public static void playGame(){
		System.out.println("Guess a number between 1 and 20, inclusive: ");
		int guess = getUserGuess();
		final int NUM = getRandomNum();
		String hint;
		
		do{
			hint = giveHint(guess, NUM);
			System.out.println(hint);
			guess = getUserGuess();
		}while(!(hint.equals("You guessed it!")));
	}
	
	public static void main(String[] args) {
		playGame();

	}

}
