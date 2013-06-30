
import java.util.Scanner;
import java.lang.Math;

public class HiLo {
	
	/*
	 * creates a random number and compares it to the user's guess
	 * PRE: p > 0
	 * POST: returns a value of p such that p >= 0
	 */
	public static int hiLo(int p){
		int c, r, num = (int) ((13)*Math.random()+1);
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of points to risk: ");
		r = in.nextInt();
		
		System.out.println("Predict (1 = high, 0 = low)");
		c = in.nextInt();
		
		System.out.println("Number is " + num);
		
		if(c == 0){
			if(num <= 6){
				System.out.println("You win.");
				return (p + r);
			}else{
				System.out.println("You lose. ");
				return (p - r);
			}
		}else{
			if(num >= 8){
				System.out.println("You win. ");
				return(p + r);
			}else{
				System.out.println("You lose. ");
				return(p - r);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in2 = new Scanner(System.in);
		int points = 1000, risk, choice, counter = 0;
		String again = "y";
		
		System.out.println("High Low Game \n");
		System.out.println("RULES: ");
		System.out.println("Numbers 1 through 6 are low");
		System.out.println("Numbers 8 through 13 are high");
		System.out.println("Number 7 is neither high nor low \n");
		
		System.out.println("You have 1000 points \n");
		
		while(again.equalsIgnoreCase("y") && points > 0){
			points = hiLo(points);
			System.out.println("You have " + points + " points");
			if(points != 0){
				System.out.println("Play again? (y/n)");
				again = in2.nextLine();
			}
			counter++;
		}
		if(points == 0){
			System.out.println("It took you " + counter + " guesses before you ran out of points.");
		}else if(again.equals("n") && counter == 1){
			System.out.println("You quit after 1 guess.");
		}else if(again.equals("n") && counter > 1){
			System.out.println("You quit after " + counter + " guesses");
		}
		

	}

}
