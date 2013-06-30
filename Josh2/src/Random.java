
import java.lang.Math;
import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int guess;
		System.out.println("Enter a number between 4 and 23, inclusive");
		final int RAND_NUM = (int)((20 - 1 + 1)*Math.random() + 1);
		guess = in.nextInt();
		
		in.close();
		
		if(guess == RAND_NUM)
			System.out.println("You guessed " + guess + " and the computer guessed " + RAND_NUM + ", You got it right!");
		else
			System.out.println("You guessed " + guess + " and the computer guessed " + RAND_NUM + ", You were wrong. You're a horrible person who deserves to die!");
		

	}

}
