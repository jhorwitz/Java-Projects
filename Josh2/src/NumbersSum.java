
import java.util.Scanner;

public class NumbersSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 1, user_input, sum = 0;
		
		System.out.println("Enter a number");
		user_input = in.nextInt();
		
		System.out.println("The numbers between 1 and " + user_input + " are: ");
		do{
			System.out.println(num);
			num++;
			sum += num;
		}while(num <= user_input);
		
		System.out.println("The sum is: " + sum);

	}

}
