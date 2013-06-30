
import java.util.Scanner;

public class GradeAvg {

	public static void main(String[] args) {
		int grade_1, grade_2, grade_3, grade_4, grade_5;
		double average;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first grade: ");
		grade_1 = input.nextInt();
		
		System.out.println("Enter the second grade: ");
		grade_2 = input.nextInt();
		
		System.out.println("Enter the third grade: ");
		grade_3 = input.nextInt();
		
		System.out.println("Enter the fourth grade: ");
		grade_4 = input.nextInt();
		
		System.out.println("Enter the fifth grade: ");
		grade_5 = input.nextInt();
		
		average = (grade_1 + grade_2 + grade_3 + grade_4 + grade_5)/5.0;
		
		System.out.println("The average is: " + average);
		
		

	}

}
