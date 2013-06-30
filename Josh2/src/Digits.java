
import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a two-digit number");
		number = input.nextInt();
		
		input.close();
		
		System.out.println("The digit in the tens place is: " + number/10);
		System.out.println("The digit in the ones place is: " + number%10);

	}

}
