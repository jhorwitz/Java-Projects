
import java.util.Scanner;

public class PrimeNumber {

	/*
	 * Tells if num is prime
	 * PRE: num is positive
	 * POST: true or false
	 */
	public static boolean isPrime(int num){
		for(int i = 2; i<= num; i++){
			if(num % i == 0 && i != num)
				return false;
		}
		return true;
	
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, count = 0;
		
		System.out.println("Enter the smaller number");
		num1 = in.nextInt();
		System.out.println("Enter the larger numeber");
		num2 = in.nextInt();
		
		System.out.println("THe prime numbers between " + num1 + " and " + num2 + " are: \n");
		
		for(int i = num1; i <= num2; i++){
			if(isPrime(i) && count == 0){
				System.out.print(i);
				count++;
			}else if(isPrime(i)){
				System.out.print(", " + i);
			}
		}
		
	}

}
