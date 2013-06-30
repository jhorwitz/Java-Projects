
import java.util.Scanner;
public class FunWithStrings {

	public static void main(String[] args) {
		
		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		int guess;
		String user_word = "y";
		
		do{
			System.out.println("Enter an integer");
			guess = in1.nextInt();
			if(guess > 5){
				System.out.println("Guess is too high");
			}else if(guess < 5){
				System.out.println("Guess is too low");
			}else
				System.out.println("Winner!!!");
			
			System.out.println("If you wish to guess again, enter y");
			user_word = in2.nextLine();
			
		}while(user_word.equalsIgnoreCase("y"));
		
	}

}
