import java.util.Scanner;
public class MastermindGame {
	Scanner in = new Scanner(System.in);
	private int pegs, colors;
	private static int count = 0;
	private static int[] code, guess_code;
	
	/*
	 * Constructor
	 * creates a MastermindGame object with a code and set number of pegs and colors
	 */
	public MastermindGame(int p, int c){
		pegs = p;
		colors = c;
		code = new int[pegs];
		guess_code = new int[pegs];
		
		for(int i = 0; i < pegs; i++){
			code[i] = (int)((colors)*Math.random() + 1);
		}
	}
	
	/*
	 * prompts the user for guesses and returns a string with the number of correct colors and correct positions
	 * PRE: NONE
	 * POST: returns a string
	 */
	public String guess(){
		int position = 0, correct_color = 0;
		int[] temp = new int[pegs];
		
		for(int i = 0; i < pegs; i++){
			temp[i] = code[i];
		}
		
		for(int i = 0; i < pegs; i++){
			System.out.println("Color for peg " + (i + 1));
			guess_code[i] = in.nextInt();
		}
		count++;
		
		for(int i = 0; i < pegs; i++){
			if(guess_code[i] == temp[i]){
				position++;
				correct_color++;
				temp[i] = 0;
			}
		}
		for(int i = 0; i < pegs; i++){
				for(int j = 0; j < pegs; j++){
					if(guess_code[i] == temp[j]){
						correct_color++;
						temp[j] = 0;
					}
				}
		}
		
		return "You have " + correct_color + " color(s) correct and " + position + " of them are in the correct position.";
			
	}
	
	/*
	 * returns the original code
	 * PRE: NONE
	 * POST: returns the code as an int[]
	 */
	public int[] getCode(){
		return code;
	}
	
	/*
	 * returns a member of the original code
	 * PRE: i is an int within the bounds of the array code
	 * POST: returns the value at index i in code
	 */
	public int getCode(int i){
		return code[i];
	}
	
	/*
	 * return the guess code
	 * PRE: NONE
	 * POST: returns the guess code as an int[]
	 */
	public int[] getGuessCode(){
		return guess_code;
	}
	
	/*
	 * returns the number of guesses the user took
	 * PRE: NONE
	 * POST: Returns an integer
	 */
	public int getCount(){
		return count;
	}
	
	/*
	 * tells if one array is equal to another
	 * PRE: NONE
	 * POST: Returns true or false
	 */
	public boolean equals(){
		int count2 = 0;
		for(int i = 0; i < code.length; i++){
			if(code[i] != guess_code[i]){				
				count2++;
			}
		}
		
		if(count2 == 0){
			return true;
		}else{
			return false;
		}
	}
}