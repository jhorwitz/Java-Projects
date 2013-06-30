import java.util.Scanner;
import java.util.ArrayList;
public class HighestGrade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> grades = new ArrayList<Integer>();
		int grade, highest = 0;
		
		System.out.println("Enter 5 grades between 0 and 100: ");
		for(int i = 0; i < 5; i++){
			grade = in.nextInt();
			grades.add(grade);
		}
		
		for(Integer num: grades){
			if(num > highest){
				highest = num;
			}
		}
		System.out.println("The highest grade is: " + highest);
		
	}

}
