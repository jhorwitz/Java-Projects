
import java.util.Scanner;

public class GuessingGameWithStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = "a", guess = "a";
		
		System.out.println("Enter a word");
		input = in.nextLine();
		input = input.toLowerCase();
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Guess a lower letter. When you know the word, guess it.");
		guess = in.nextLine();
		guess = guess.toLowerCase();
		
		while(!guess.equalsIgnoreCase(input)){
			while(input.contains(guess) && !input.equalsIgnoreCase(guess)){
				System.out.println("Yes, " + guess + " is in the word");
				System.out.println("Guess another letter");
				guess = in.nextLine();
				guess = guess.toLowerCase();
			}
		
			while(!input.contains(guess)){
				System.out.println("No, " + guess + " is not in the word.");
				System.out.println("Try again.");
				guess = in.nextLine();
				guess = guess.toLowerCase();
			}
		}
		
		if(input.equalsIgnoreCase(guess)){
			System.out.println("Congratulations! You guessed the word!");
		}
			

	
	}

}
