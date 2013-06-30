
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num, factorial = 1;
		
		System.out.println("Enter a number: ");
		num = in.nextInt();
		
		while(num < 0){
			System.out.println("The value must be positive.");
			num = in.nextInt();
		}
		
			System.out.print(num + "! = ");
		
			for(int i = num; i <= num && i > 0; i--){
				factorial *= i;
				if(i >= 2)
					System.out.print(i + "*");
				else if(i == 1)
					System.out.print(i + " = " + factorial);
			}
				if(num == 0)
					System.out.print("1");
			
	}

}
