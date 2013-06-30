
import java.util.Scanner;
import java.text.NumberFormat;

public class Project {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int designing_input, coding_input, debugging_input, testing_input;
		double total, designing_output, coding_output, debugging_output, testing_output;
		NumberFormat decimal = NumberFormat.getNumberInstance();
		decimal.setMaximumFractionDigits(2);
		
		System.out.println("Enter the number of minutes spent on each of the following project tasks:");
		System.out.println("Designing: ");
		designing_input = input.nextInt();
		System.out.println("Coding: ");
		coding_input = input.nextInt();
		System.out.println("Debugging: ");
		debugging_input = input.nextInt();
		System.out.println("Testing: ");
		testing_input = input.nextInt();
		
		input.close();
		
		total = designing_input + coding_input + debugging_input + testing_input;
		designing_output = (double) designing_input / total * 100.00;
		coding_output = (double) coding_input / total * 100.00;
		debugging_output = (double) debugging_input / total * 100.00;
		testing_output = (double) testing_input / total * 100.00;
		
		System.out.format("%-13s %-12s", "Task", "Percent Time\n");
		System.out.format("%-13s", "Designing:    % " + decimal.format((double) designing_output) + "\n");
		System.out.format("%-13s", "Coding:       % " + decimal.format((double) coding_output) + "\n");
		System.out.format("%-13s", "Debugging:    % " + decimal.format((double) debugging_output) + "\n");
		System.out.format("%-13s", "Testing:      % " + decimal.format((double) testing_output) + "\n");
		
	}

}
