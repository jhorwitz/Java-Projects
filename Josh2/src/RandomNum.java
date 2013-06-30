
import java.lang.Math;
import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
		int minimum, maximum, random;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer for the minimum value: ");
		minimum = in.nextInt();
		System.out.println("Enter an integer for the maximum value: ");
		maximum = in.nextInt();
		random = (int) ((maximum - minimum + 1)*Math.random() + minimum);
		in.close();
		
		System.out.println("Random number between the maximum and minimum: " + (int) random);
		

	}

}
