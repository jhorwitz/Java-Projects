
import java.util.Scanner;
import java.text.NumberFormat;
import java.lang.Math;

public class TrigFunctions {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double angle, sine, cosine, tangent;
		
		NumberFormat decimal = NumberFormat.getNumberInstance();
		decimal.setMaximumFractionDigits(3);
		
		System.out.println("Enter an angle in degrees: ");
		angle = in.nextDouble();
		
		sine = Math.sin(Math.toRadians(angle));
		cosine = Math.cos(Math.toRadians(angle));
		tangent = Math.tan(Math.toRadians(angle));
		
		System.out.println("Sine: " + decimal.format(sine));
		System.out.println("Cosine: " + decimal.format(cosine));
		System.out.println("Tangent: " + decimal.format(tangent));
		

	}

}
