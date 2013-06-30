
import java.util.Scanner;

public class Exponentiation {
	
	/*
	 * Raises a base to a power
	 * PRE: base is a double and power is an integer
	 * POST: return a double
	 */
	public static double raiseTo(double base, int pow){
		double result = 1, new_pow;
		new_pow = Math.abs(pow);
		for(int i = 1; i <= new_pow; i++){
			result *= base;
		}
		if(pow > 0){
			return result;
		}else if(pow < 0){
			return (1.0/result);
		}else
			return 1;
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int power;
		double base;
		
		System.out.println("Enter a base you wish to raise to a power: ");
		base = in.nextDouble();
		System.out.println("Enter a power to raise " + base + " to: ");
		power = in.nextInt();
		
		System.out.println(base + " raised to the " + power + " is " + raiseTo(base, power));
	}

}