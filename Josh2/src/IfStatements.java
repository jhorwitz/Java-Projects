
import java.util.Scanner;

public class IfStatements {

	public static void main(String[] args) {
		final int NUMBER = 4;
		int user_guess;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a guess between 1 and 10, inclusive");
		user_guess = in.nextInt();
		
		if(user_guess == 7)
			System.out.println("You guessed lucky number 7!");
		
		if(user_guess == NUMBER)
			System.out.println("WOOHOO! You guessed correctly!");	
		else if(user_guess > NUMBER && user_guess < 11 && user_guess != 7)
			System.out.println("You guessed too high!");		
		else if(user_guess < 1 || user_guess > 10)
			System.out.println("You are and IDIOT!");
		else if(user_guess >= 1 && user_guess < NUMBER)
			System.out.println("You guessed to low!");
		
		

	}

}
