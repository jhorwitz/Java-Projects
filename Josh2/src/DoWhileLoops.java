
import java.util.Scanner;

public class DoWhileLoops {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int user_input;
		
		do{
			
			System.out.println("Enter a number between 1 and 10, inclusive");
			user_input = in.nextInt();
			if(user_input > 10 || user_input < 1){
				System.out.println("Your number is not between 1 and 10, inclusive");
			}	
		}while(user_input > 10 || user_input < 1);
		
		System.out.println("Congrats! You're not retarded!");

	}

}
