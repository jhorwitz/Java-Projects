import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSort {

	/*
	 * Displays the elements in array
	 * PRE: array is an object of type ArrayList
	 * POST: NONE
	 */
	public static void displayArray(ArrayList<Double> array){
		for(int i = 0; i < array.size(); i++){
			System.out.print(array.get(i) + " ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double input;
		ArrayList<Double> test = new ArrayList<Double>();
		
		System.out.println("Enter a list of numbers (-1 to quit): ");
		do{
			input = in.nextDouble();
			if(input != -1){
				test.add(input);
			}
		}while(input != -1);
		
		System.out.println("Unsorted: ");
		displayArray(test);
		
		Sorts.selectionSort(test);
		
		System.out.println("Sorted: ");
		displayArray(test);

	}

}
