
import java.util.Scanner;
import java.lang.Math;

public class PerfectSquare {

	public static void main(String[] args) {
		int input, output;
		double sqrt;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer to see if it is a perfect square: ");
		input = in.nextInt();
		sqrt = Math.sqrt((double) input);
		sqrt = (int)sqrt;
		output = (int)(sqrt*sqrt);
		
		if(output == input)
			System.out.println(input + " is a perfect square.");
		else
			System.out.println(input + " is not a perfect square.");
		
	}

}
