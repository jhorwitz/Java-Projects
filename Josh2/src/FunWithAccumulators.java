
import java.util.Scanner;

public class FunWithAccumulators {
/**
 * test is an accumulator
 * count is a counter
 * total starts at 1 because to quit the user enters -1, which lowers the total by 1.
 * count starts at -1 because the user has to run the loop again to quit, which raises the count by 1.
 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test, total = 1, count = -1;
		double ave;
		
		do{
			System.out.println("Enter a test grade (Enter -1 to quit)");
			test = in.nextInt();
			count++;
			total += test;
			
		}while(test != -1);

		ave = (double)total/count;
		System.out.println("The average grade is " + ave);
	}

}
