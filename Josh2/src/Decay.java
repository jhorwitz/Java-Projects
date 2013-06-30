
import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

public class Decay {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int calculation;
		double final_amount, initial_amount, half_life, time;
		
		System.out.println("1)Final amount \n2) Initial Amount \n3) Constant (Half Life) ");
		System.out.println("Enter the number of the calculation you wish to make: ");
		calculation = in.nextInt();
		
		NumberFormat decimal = NumberFormat.getNumberInstance();
		decimal.setMaximumFractionDigits(3);
		
		if(calculation == 1){
			System.out.println("Enter the initial mass: ");
			initial_amount = in.nextDouble();
			System.out.println("Enter the half-life: ");
			half_life = in.nextDouble();
			System.out.println("Enter the elapsed time in years: ");
			time = in.nextDouble();
			final_amount = initial_amount*Math.pow(2.71828182845459023, (-1)*half_life*time);
			System.out.println("Final Mass = " + decimal.format(final_amount));
		}
		else if(calculation == 2){
			System.out.println("Enter the half-life: ");
			half_life = in.nextDouble();
			System.out.println("Enter the elapsed time in years: ");
			time = in.nextDouble();
			System.out.println("Enter the final mass: ");
			final_amount = in.nextDouble();
			initial_amount = final_amount / Math.pow(2.71828182845459023, (-1)*half_life*time);
			System.out.println("Initial Mass = " + decimal.format(initial_amount));
		}
		else if(calculation == 3){
			System.out.println("Enter the initial mass: ");
			initial_amount = in.nextDouble();
			System.out.println("Enter the elapsed time in years: ");
			time = in.nextDouble();
			System.out.println("Enter the final mass: ");
			final_amount = in.nextDouble();
			half_life = (Math.log(final_amount/initial_amount))/time;
			System.out.println("Half-Life = " + decimal.format(half_life));
		}			
		in.close();
	
	}
		
}

