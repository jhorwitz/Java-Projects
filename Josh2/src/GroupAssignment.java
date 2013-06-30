
import java.util.Scanner;

public class GroupAssignment {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String first, last;
		int compare, compare2;
		
		System.out.println("Enter your first name: ");
		first = in.nextLine();
		System.out.println("Enter your last name: ");
		last = in.nextLine();
		System.out.print(first + " " + last);
		
		compare = (last.substring(0, 1)).compareToIgnoreCase("I");
		compare2 = (last.substring(0, 1)).compareToIgnoreCase("S");
		
		if(compare <= 0){
			System.out.print(" is in group 1.");
		}else if(compare2 <= 0){
			System.out.print(" is in group 2.");
		}else{
			System.out.print(" is in group 3.");
		}
		
	}

}
