
import java.util.Scanner;

public class FormalGreeting {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = "a", title = "a";
		
		System.out.println("Enter your name and title (Mr. Mrs. etc): ");
		name = in.nextLine();
		
		if(name.startsWith("Mr."))
			System.out.println("Hello, sir.");
		else if(name.startsWith("Ms.") || name.startsWith("Mrs.") || name.startsWith("Miss"))
			System.out.println("Hello, ma'am");
		else
			System.out.println("Hello, " + name);
		

	}

}
