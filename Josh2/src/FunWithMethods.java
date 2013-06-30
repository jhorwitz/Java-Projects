
import java.util.Scanner;

public class FunWithMethods {

	public static void convertTemp(double t, int u){
		if(u == 1)
			System.out.println("The temperature in deg. Farenheit is: " + ((9.0/5) * t + 32));
		else
			System.out.println("The temperature in deg. Celcius is: " + ((5.0/9) * (t - 32)));
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double temp;
		int user;
		
		System.out.println("Enter 1 to convert Celcius to Farenheit, Enter 2 to convert Farenheit to Celcius");
		user = in.nextInt();
		System.out.println("Enter the Temperature");
		temp = in.nextDouble();
		
		convertTemp(temp, user);

	}

}
