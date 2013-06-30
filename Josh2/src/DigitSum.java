
import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String num = "a", digit = "a";
		int sum = 0;
		
		System.out.println("Enter a positive integer: ");
		num = in.nextLine();
		
		for(int i = 0; i < num.length(); i++){
			digit = num.substring(i, i + 1);
			
			if(digit.equals("1")){
				sum += 1;
			}else if(digit.equals("2")){
				sum += 2;
			}else if(digit.equals("3")){
				sum += 3;
			}else if(digit.equals("4")){
				sum += 4;
			}else if(digit.equals("5")){
				sum += 5;
			}else if(digit.equals("6")){
				sum += 6;
			}else if(digit.equals("7")){
				sum += 7;
			}else if(digit.equals("8")){
				sum += 8;
			}else if(digit.equals("9")){
				sum += 9;
			}
		}
		System.out.println("The sum of the digits is: " + sum);
	}
}
