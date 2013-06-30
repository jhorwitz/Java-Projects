import java.util.Scanner;
public class SortedArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] my_nums;
		System.out.println("Enter the number of values in the array: ");
		int values = in.nextInt();
		
		my_nums = new int[values];
		
		for(int i = 0; i < values; i++){
			my_nums[i] = (int)(100*Math.random() + 1);
		}
		
		System.out.println("Original Array: ");
		for(int i = 0; i < values; i++){
			System.out.print(my_nums[i] + " ");
		}
		
		System.out.println("\n");
		SelectionSort sorted_array = new SelectionSort(my_nums, values);
		System.out.println("Sorted Array: ");
		sorted_array.display();

	}

}
