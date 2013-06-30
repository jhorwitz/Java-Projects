
import java.util.Scanner;

public class Prompter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int min, max, input;
		
		do{
			System.out.println("Enter a number for a minimum: ");
			min = in.nextInt();
			System.out.println("Enter a number for a maximum: ");
			max = in.nextInt();
			if(min > max)
				System.out.println("The minimum cannot be greater than the maximum!");
		}
		while(min > max);
			
		
		do{
			System.out.println("Enter a number between the maximum and the minimum");
			input = in.nextInt();
		}while(input > max || input < min);

		System.out.println("Congratulations! You followed the directions!");
	}

}
