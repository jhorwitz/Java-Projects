
import java.util.Scanner;

public class WhileLoops1 {

	public static void main(String[] args) {
		double user_input;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number between 1 and 10, inclusive");
		user_input = in.nextDouble();
		
		while((user_input > 10 || user_input < 1) || user_input != (int)user_input){
			if(user_input != (int)user_input)
				System.out.println("Use ints! " + user_input + " is not reasonable");
			if(user_input > 10 || user_input < 1)
				System.out.println("You need to be between 1 and 10, inclusive");
				
			user_input = in.nextDouble();
		}
		
		System.out.println("Congrats! You entered a number between 1 and 10, inclusive!");

	}

}
