
import java.util.Scanner;

public class Monogram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String first, middle, last;
		
		System.out.println("Enter your first name: ");
		first = in.nextLine();
		first = first.substring(0, 1).toLowerCase();
		
		System.out.println("Enter your middle initial: ");
		middle = in.nextLine();
		middle = middle.toUpperCase();
		
		System.out.println("Enter your last name: ");
		last = in.nextLine();
		last = last.substring(0, 1).toLowerCase();
		
		System.out.print("Your monogram is: " + first + middle + last);
		
		

	}

}
