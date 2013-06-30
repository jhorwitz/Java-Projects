
import java.util.Scanner;

public class Stages {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		
		System.out.println("Enter an age: ");
		age = input.nextInt();
		
		if(age > 18)
			System.out.println("Adult");
		else if(age <= 5)
			System.out.println("Toddler");
		else if(age > 5 && age <= 10)
			System.out.println("Child");
		else if(age > 10 && age <= 12)
			System.out.println("Preteen");
		else if(age > 12 && age <= 18)
			System.out.println("Teen");

	}

}
