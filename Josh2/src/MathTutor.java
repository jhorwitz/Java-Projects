
import java.util.Scanner;
import java.lang.Math;

public class MathTutor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int user_answer, answer;
		final int RANDOM1, RANDOM2, OPERATOR; 
		OPERATOR = (int) ((4-1+1)*Math.random() + 1);
		RANDOM1 = (int) ((10-1+1)*Math.random() + 1);
		RANDOM2 = (int) ((10-1+1)*Math.random() + 1);
		
		if(OPERATOR == 1){
			System.out.println("What is " + RANDOM1 + " + " + RANDOM2);
			answer = RANDOM1 + RANDOM2;
		}
		else if(OPERATOR == 2){
			System.out.println("What is " + RANDOM1 + " - " + RANDOM2);
			answer = RANDOM1 - RANDOM2;
		}
		else if(OPERATOR == 3){
			System.out.println("What is " + RANDOM1 + " * " + RANDOM2);
			answer = RANDOM1 * RANDOM2;
		}
		else if(OPERATOR == 4){
			System.out.println("What is " + RANDOM1 + " / " + RANDOM2);
			answer = RANDOM1 / RANDOM2;
		}
		else
			answer = 0;
			
			
		user_answer = in.nextInt();
		
		if(user_answer == answer)
			System.out.println("Correct!");
		else
			System.out.println("Incorrect");
		

	}

}
