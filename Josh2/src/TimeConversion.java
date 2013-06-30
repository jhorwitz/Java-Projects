
import java.text.NumberFormat;
import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int input_minutes, hours, output_minutes;
		
		NumberFormat number = NumberFormat.getIntegerInstance();
		number.setMinimumIntegerDigits(2);
		
		System.out.println("Enter the time in minutes: ");
		input_minutes = input.nextInt();
		
		input.close();
		
		hours = input_minutes/60;
		output_minutes = input_minutes%60;
		
		System.out.println("The time is: " + hours + ":" + number.format(output_minutes));
		
		
	}

}
