import java.util.Scanner;

public class DiceRolls1 {
	
	public static void main(String[] args) {
		int[] outcomes = new int[19];
		Scanner in = new Scanner(System.in);
		int num_rolls, outcome;
		
		System.out.println("Enter the number of rolls:");
		num_rolls = in.nextInt();
		
		for(int i = 1; i <= num_rolls; i++){
			outcome = (int)(6*Math.random() + 1) + (int)(6*Math.random() + 1) + (int)(6*Math.random() + 1);
			outcomes[outcome] += 1;
		}
		
		for(int i = 2; i <= 18; i++){
			System.out.println(i + ": " + outcomes[i]);
		}

	}
}
