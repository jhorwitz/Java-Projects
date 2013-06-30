
import java.util.Scanner;

public class OtherMethodTypes {
	
	public static double raiseTo(int pow){
		double result = 1, new_pow;
		new_pow = Math.abs(pow);
		for(int i = 1; i <= new_pow; i++){
			result *= 5;
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
		
		System.out.println("Enter a power to raise 5 to: ");
		power = in.nextInt();
		
		System.out.println("5 raised to the " + power + " is " + raiseTo(power));
	}

}
