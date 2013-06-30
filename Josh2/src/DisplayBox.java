
import java.util.Scanner;

public class DisplayBox {
	
	/*
	* Draws a bar of *'s
	* PRE: w > 0 and h > 0
	* POST: NONE
	*/
	public static void drawSide(int w, int h){
		for(int i = 2; i < h; i++){
			System.out.print("*");
			for(int j = 2; j < w; j++){
				System.out.print(" ");
			}
			System.out.println("*");
		}	
	}
	
	/*
	* Draws the sides of the box of symbols
	* PRE: h > 0, w > 0 and the length of str is 1
	* POST: NONE
	*/
	public static void drawSide(int w, int h, String str){
		for(int i = 2; i < h; i++){
			System.out.print(str);
			for(int j = 2; j < w; j++){
				System.out.print(" ");
			}
			System.out.println(str);
		}	
	}
	
	/*
	* Draws a bar of symbols
	* PRE: length > 0
	* POST: NONE
	*/
	public static void drawBar(int length){
		for (int i = 1; i<=length; i++){
			System.out.print("*");
		}
		System.out.println();
	}
	
	/*
	* Draws a bar of symbols
	* PRE: length > 0 and the length of str is 1
	* POST: NONE
	*/
	public static void drawBar(int length, String str){
		for (int i = 1; i<=length; i++){
			System.out.print(str);
		}
		System.out.println();
	}
	
	/*
	 * Draws a box of *'s of width w and height h
	 * PRE: w > 0 and h > 0
	 * POST: NONE
	 */
	public static void drawBox(int w, int h){
		drawBar(w);
		drawSide(w,h);
		drawBar(w);
	}
	
	/*
	 * Draws a box of symbols input by the user of width w and height h
	 * PRE: w > 0 and h > 0
	 * POST: NONE
	 */
	public static void drawBox(int w, int h, String str){
		drawBar(w, str);
		drawSide(w,h,str);
		drawBar(w, str);
	}
		

	public static void main(String[] args) {
		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		int width, height;
		String choice, str;
		
		System.out.println("Enter a width");
		width = in1.nextInt();
		System.out.println("Enter a height");
		height = in1.nextInt();
		
		System.out.println("Do you want to use a character to use to display the box? (y/n)");
		choice = in2.nextLine();
		
		if(choice.equalsIgnoreCase("y")){
			System.out.println("Enter the character you wish to use: ");
			str = in2.nextLine();
			drawBox(width, height, str);
		}else{
			drawBox(width, height);
		}
		

	}

}
