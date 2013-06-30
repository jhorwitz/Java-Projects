
import java.util.Scanner;

public class AddCoins {
	
	/*
	 * Adds the coins up to a total amount in dollars
	 * PRE: p, n, d, and q must be positive integers
	 * POST: Returns a string
	 */
	public static String getDollarAmount(int p, int n, int d, int q){
		double total = ((q*.25) + (n*.05) + (d*.1) + (p*.01));
		return "$" + total;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p, n, d, q;
		String dollar;
		
		System.out.println("Enter the number of Quarters: ");
		q = in.nextInt();
		System.out.println("Enter the number of Dimes: ");
		d = in.nextInt();
		System.out.println("Enter the number of Nickels: ");
		n = in.nextInt();
		System.out.println("Enter the number of Pennies: ");
		p = in.nextInt();
		
		System.out.println("Total: " + getDollarAmount(p, n, d, q));

	}

}
