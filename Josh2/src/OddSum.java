
import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num, sum = 0;
		
		System.out.println("Enter a number");
		num = in.nextInt();
		
		System.out.println("The odd numbers between 1 and " + num + ", are: ");
		
		for(int i = 1; i <= num; i += 2){
			System.out.println(i);
			sum += i;
		}
		
		System.out.println("The sum is: " + sum);
	}

}
