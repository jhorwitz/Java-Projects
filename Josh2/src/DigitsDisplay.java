
import java.util.Scanner;

public class DigitsDisplay {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num = "a", digit = "a";
		
		System.out.println("Enter a positive integer: ");
		num = in.nextLine();
		
		for(int i = 0; i < num.length(); i++){
			digit = num.substring(i, i + 1);
			System.out.println(digit);
		}
		

	}

}
