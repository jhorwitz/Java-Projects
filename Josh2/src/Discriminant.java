
import java.util.Scanner;

public class Discriminant extends Change {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c, roots;
		
		System.out.println("Enter the value for a: ");
		a = in.nextDouble();
		System.out.println("Enter the value for b: ");
		b = in.nextDouble();
		System.out.println("Enter the value for c: ");
		c = in.nextDouble();
		
		in.close();
		
		roots = (b*b) - (4*a*c);
		
		if(roots < 0)
			System.out.println("No roots");
		else if(roots == 0)
			System.out.println("One root");
		else
			System.out.println("Two roots");

	}

}
