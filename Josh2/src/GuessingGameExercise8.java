import java.util.Scanner;


import java.util.Scanner;

public class GuessingGameExercise8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int guess;
		final int RAND_NUM = (int)((20 - 1 + 1)*Math.random() + 1);
		System.out.println("Guess a number between 1 and 20, inclusive: ");
		guess = in.nextInt();
		
		do{
			if(guess > RAND_NUM)
				System.out.println("Too high. Guess again.");
			else if(guess < RAND_NUM)
				System.out.println("Too Low. Guess again.");
			guess = in.nextInt();
		}while(guess != RAND_NUM);
		
		System.out.println("You guessed it!");

	}

}
