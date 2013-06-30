
import java.util.Scanner;

public class PizzaCost extends TempConverter {

	public static void main(String[] args) {
		double diam, pizza_cost;
		final double LABOR_COST = 1.75; 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the diameter of the pizza in inches: ");
		diam = input.nextDouble();
		
		input.close();
		
		pizza_cost = 0.05*diam*diam + LABOR_COST;
		
		System.out.println("The cost of making the pizza is: $" + pizza_cost);

	}

}
