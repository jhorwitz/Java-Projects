
import java.util.Scanner;

public class AccountSetup {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String username = "y", password = "y";
		
		System.out.println("Enter a user name: ");
		username = in.nextLine();
		
		do{
			System.out.println("Enter a password that is at least 8 characters: ");
			password = in.nextLine();
		}while(password.length() < 8);
		
		username = username.toLowerCase();
		password = password.toLowerCase();
		
		System.out.println("Your user name is " + username + " and your password is " + password);

	}

}
