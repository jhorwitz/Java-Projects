
import java.util.Scanner;

public class IsoTriangle {

	/*
	 * This method draws a bar of length size
	 * PRE: size must be a positive integer
	 * POST: NONE
	 */
	public static void drawBar(int size){
		for(int i = 1; i <= size; i++){
			System.out.print("*");
		}
	}
	
	/*
	 * This method adds the spaces needed to make an isosceles triangle
	 * PRE: size must be a positive integer
	 * POST: NONE
	 */
	public static void addSpaces(int size){
		for(int i = 1; i <= size; i++){
			System.out.print(" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size;
		
		System.out.println("Enter the size: ");
		size = in.nextInt();
		
		for(int i = 1; i <= size; i++){
			addSpaces(size - i);
			drawBar(2*i - 1);
			System.out.println();
		}
	}

}
