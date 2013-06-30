import java.util.Scanner;
import java.text.NumberFormat;
import java.lang.Math;

public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c, root1, root2;
		
		NumberFormat decimal = NumberFormat.getNumberInstance();
		decimal.setMaximumFractionDigits(2);
		decimal.setMinimumFractionDigits(2);
		
		System.out.println("Enter a value for a: ");
		a = in.nextDouble();
		System.out.println("Enter a value for b: ");
		b = in.nextDouble();
		System.out.println("Enter a value for c: ");
		c = in.nextDouble();
		
		in.close();
		
		root1 = ((-1)*b + Math.sqrt(Math.pow(b, 2) - 4.0*a*c)) / (2.0*a);
		root2 = ((-1)*b - Math.sqrt(Math.pow(b, 2) - 4.0*a*c)) / (2.0*a);
		
		System.out.println("The roots are " + decimal.format(root1) + " and " + decimal.format(root2));
		
	}

}
