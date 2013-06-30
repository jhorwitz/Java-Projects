
import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int change, quarters, dimes, nickels, pennies;
		
		System.out.println("Enter the change in cents: ");
		change = input.nextInt();
		
		input.close();
		
		quarters = change/25;
		change %= 25;
		dimes = change/10;
		change %= 10;
		nickels = change/5;
		change %= 5;
		pennies = change;
		
		System.out.println("The minimum number of coins is: ");
		System.out.println("	Quarters: " + quarters);
		System.out.println("	Dimes: " + dimes);
		System.out.println("	Nickels: " + nickels);
		System.out.println("	Pennies: " + pennies);
		
	}

}
