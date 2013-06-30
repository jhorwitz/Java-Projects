import java.util.Scanner;

public class FunWithArrays2 {
	
	public static void main(String[] args) {
		String[] outcomes = new String[13];
		Scanner in = new Scanner(System.in);
		int num_rolls, outcome;
		
		for(int i = 0; i <= 12; i++){
			outcomes[i] = "";
		}
		
		/*prompt user for number of rolls*/
		System.out.println("Enter the number of rolls:");
		num_rolls = in.nextInt();
		
		/*roll dice and add to outcomes*/
		for(int i = 1; i <= num_rolls; i++){
			outcome = (int)(6*Math.random() + 1) + (int)(6*Math.random() + 1);
			outcomes[outcome] += "-";
		}
		
		/*show results*/
		for(int i = 2; i <= 12; i++){
			System.out.println(i + ": " + outcomes[i]);
		}

	}
	//two programs due thursday night at midnight
	//enter number of rolls
	//enter number of rolls, number of dice, number of sides on dice

}
