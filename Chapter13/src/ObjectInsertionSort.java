import java.util.Scanner;

public class ObjectInsertionSort {

	public static void displayArray(String[] array){
		for(int i = 1; i < array.length; i++){
			System.out.println(i + ": " + array[i] + " ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num_items;
		String[] test;
		
		System.out.println("Enter the number of elements: ");
		num_items = in.nextInt();
		
		System.out.println("Enter the list of strings: ");
		test = new String[num_items + 1];
		for(int i = 0; i < test.length; i++){
			test[i] = (in.nextLine()).toLowerCase();
		}
		System.out.println("Unsorted: ");
		displayArray(test);
		
		Sorts.insertionSort(test);
		
		System.out.println("Sorted: ");
		displayArray(test);

	}

}
