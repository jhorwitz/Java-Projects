
import java.util.Scanner;

public class FunWithMethods2 {
	
	/*
	 * This method displays a row of 5 stars
	 * PRE: NONE
	 * POST: NONE
	 */
	public static void drawBar(int num){
		for(int i = 0; i <= num; i++){
			System.out.print("*");
		}
		System.out.println();
	}
	
	/*
	 * The method Draws a bar of stars of length num
	 * PRE: int num >= 0
	 * POST: NONE
	 */
	public static void drawBar(int num, String str){
		for(int i = 0; i <= num; i++){
			System.out.print(str);
		}
		System.out.println();
	}
	
	/*
	 * Displays a bar of String str of length num
	 * PRE: num >= 0 and str is non-empty
	 * POST: NONE
	 */
	public static void main(String[] args) {
		Scanner in1 = new Scanner(System.in); // Scanner to get numerical input
		Scanner in2 = new Scanner(System.in); // Scanner to get String input
		int bar_length;
		String sym;
		System.out.println("How long of a bar do you wish to draw?");
		bar_length = in1.nextInt();
		System.out.println("What symbol would you like to display?");
		sym = in2.nextLine();
		
		for(int i = 0; i <= bar_length; i++){
			drawBar(i, sym);
		}

	}

}
