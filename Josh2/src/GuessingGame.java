
import java.lang.Math;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int guess;
		final int RAND_NUM = (int)((20 - 1 + 1)*Math.random() + 1);
		System.out.println("Enter a number between 1 and 20, inclusive: ");
		guess = in.nextInt();
		
		in.close();
		System.out.println("Computer's Number: " + RAND_NUM);
		System.out.println("Player's Number: " + guess);
		
		if(guess == RAND_NUM)
			System.out.println("Congratulations! You guessed correctly!");
		else
			System.out.println("Better luck next time!");
		

	}

}
