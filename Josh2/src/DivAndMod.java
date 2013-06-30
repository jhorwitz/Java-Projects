
import java.util.Scanner;

public class DivAndMod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int first, second;
		
		System.out.println("Enter an integer: ");
		first = input.nextInt();
		
		System.out.println("Enter a second integer: ");
		second = input.nextInt();
		
		System.out.println(first + " / " + second + " = " + first/second);
		System.out.println(first + " % " + second + " = " + first%second + "\n");
		System.out.println(second + " / " + first + " = " + second/first);
		System.out.println(second + " % " + first + " = " + second%first);
		
		
		
	}

}
