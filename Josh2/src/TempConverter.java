
import java.util.Scanner;
import java.text.NumberFormat;

public class TempConverter {

	public static void main(String[] args) {
		double temperature, celsius;
		Scanner input = new Scanner(System.in);
		
		NumberFormat decimal = NumberFormat.getNumberInstance();
		decimal.setMaximumFractionDigits(2);
		
		System.out.println("Enter a temperature in degrees Fahrenheit: ");
		temperature = input.nextDouble();
		
		input.close();
		
		celsius = (5*(temperature - 32))/9.0;
		
		System.out.println("The temperature in degrees Celsius is: " + decimal.format(celsius) + " C");
		
	}

}
