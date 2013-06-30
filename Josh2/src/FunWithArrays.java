import java.util.Scanner;
public class FunWithArrays {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double sum = 0;
		int[] tests = new int[5];
		
		//Array position starts at 0. i.e array of length 5 like above starts at 0 and goes 0, 1, 2, 3, 4. This is why the integer below is saved as [i-1]
		for(int i = 1; i <= 5; i++){
			System.out.println("Enter test " + i + ": ");
			tests[i-1] = in.nextInt();
		}
		
		for(int i = 0; i <= 4; i++){
			sum += tests[i];
		}
		
		sum /= 5.0;
		
		System.out.println("The test values are: ");
		for(int i = 0; i <= 4; i++){
			System.out.println(tests[i]);
		}
		
		System.out.println("The averages test grade is " + sum);
		

	}

}
