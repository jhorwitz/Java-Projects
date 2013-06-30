
import java.util.Scanner;

public class SurfsUp extends IfStatements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double user_input;
		System.out.println("Enter the height of the waves: ");
		user_input = input.nextDouble();
		
		if(user_input >= 6.0)
			System.out.println("Great day for surfing!");
		else
			System.out.println("Go body boarding!");

	}

}
