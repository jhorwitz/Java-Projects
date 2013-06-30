
import java.util.Scanner;
import java.text.NumberFormat;

public class SimpleInterest {

	public static void main(String[] args) {
		double principle, rate, total, years;
		Scanner input = new Scanner(System.in);
		NumberFormat decimal = NumberFormat.getNumberInstance();
		decimal.setMaximumFractionDigits(2);
		decimal.setMinimumFractionDigits(2);
		
		System.out.println("Enter the desired total: ");
		total = input.nextDouble();
		System.out.println("Enter the number of years: ");
		years = input.nextInt();
		System.out.println("Enter the interest rate: ");
		rate = input.nextDouble();
		
		input.close();
		
		principle = total / (1 + years * rate);
		System.out.println("The initial amount that must be invested is: $" + decimal.format(principle));

	}

}
