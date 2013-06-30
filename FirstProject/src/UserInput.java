
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		int length, width, area;
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter a value for length: ");
		length = in.nextInt();
		
		System.out.println("Enter a value for width: ");
		width = in.nextInt();
		
		area = length*width;
		System.out.println("The area of the rectangle is " + area);

	}
}
