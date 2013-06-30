
import java.util.Scanner;

public class Necklace {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, accum, num1num2;
		
		System.out.println("Enter the first starting number: ");
		num1 = in.nextInt();
		System.out.println("Enter the second starting number: ");
		num2 = in.nextInt();
		
		num1num2 = (num1 * 10) + num2;
		System.out.print(num1 + " " + num2 + " ");
		
		do{
			accum = (num1 + num2) % 10;
			System.out.print(accum + " ");
			num1 = num2;
			num2 = accum;
		}while(num1num2 != (num1 * 10) + num2);
	}

}
