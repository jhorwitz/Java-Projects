import java.util.Scanner;

public class DiceRolls2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num_rolls, outcome = 0, num_dice, num_sides, counter = 0;
		
		System.out.println("Enter the number of sides you want to the dice to have:");
		num_sides = in.nextInt();
		System.out.println("Enter the number of dice you want to roll:");
		num_dice = in.nextInt();
		System.out.println("Enter the number of rolls:");
		num_rolls = in.nextInt();
		
		int[] outcomes = new int[(num_sides * num_dice + 1)];
		
		for(int i = 1; i <= num_rolls; i++){
			do{
				outcome += (int)(num_sides*Math.random() + 1);
				counter++;
			}while(counter < num_dice);
			outcomes[outcome] += 1;
			outcome = 0;
			counter = 0;
		}
		
		for(int i = num_dice; i <= (num_sides * num_dice); i++){
			System.out.println(i + ": " + outcomes[i]);
		}

	}
}
