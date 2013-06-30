
import java.util.Scanner;

public class DistanceCalculator {

	/**
	 * Calculates and displays the distance of a race with three segments
	 */
	
	public static void main(String[] args) {
		double first_segment, second_segment, third_segment, total_distance;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the distance of the first segment:");
		first_segment = in.nextDouble();
		
		System.out.println("Enter the distance of the second segment:");
		second_segment = in.nextDouble();
		
		System.out.println("Enter the distance of the third segment:");
		third_segment = in.nextDouble();
		
		total_distance = first_segment + second_segment + third_segment;
		
		System.out.println("The total distance of the race is " + total_distance + " km");
		

	}

}
