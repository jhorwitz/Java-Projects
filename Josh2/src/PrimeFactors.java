
import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int input, number, counter = 2;
		
		System.out.println("Enter a number");
		input = in.nextInt();
		
		number = input;
		
		 while(counter <= input){
			 if(number % counter == 0){
				 if(counter != number){
					System.out.print(counter + "*");
					number /= counter;
				 }
			 
				 else{
					 System.out.print(counter);
					 number /= counter;
				 }
			 }
			 else
				counter += 1;
		 }
		 
		 System.out.print(" = " + input);

	}

}
