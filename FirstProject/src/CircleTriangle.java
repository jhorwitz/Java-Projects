
import java.util.Scanner;

public class CircleTriangle {
	
	public static void main(String[] args) {
		double diam, height, base, area_circle, area_triangle;
		final double PI = 3.14;
		Scanner jimbob = new Scanner(System.in);
		
		System.out.println("Enter the diameter of a circle");
		diam = jimbob.nextDouble();
		
		System.out.println("Enter the base of a triangle");
		base = jimbob.nextDouble();
		
		System.out.println("Enter the height of a triangle");
		height = jimbob.nextDouble();
		
		jimbob.close();
		
		area_circle = PI * (diam / 2) * (diam / 2);
		area_triangle = (1.0 / 2.0) * base * height;
		System.out.println("The area of the circle is " + area_circle + " and the area of the triangle is " + area_triangle);
		
	}

}
