import java.util.Scanner;
import java.lang.Math;

public class SearchLocations {
	
	public static void search(int[] array, int search, int location){
		System.out.println("Examining " + location);
		if(search == array[location]){
			System.out.println("Number at position " + location);
		}else if(search > array[location]){
			search(array, search, location + location/2);
		}else if(search < array[location]){
			search(array, search, location/2);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int search, size = in.nextInt(), in_array = 0;
		int[] nums = new int[size];
		
		for(int i = 0; i < nums.length; i++){
			nums[i] = (int)(100 * Math.random());
		}
		
		Sorts.selectionSort(nums);
		
		for(int i = 0; i < nums.length; i++){
			System.out.print(nums[i] + " ");
		}

		System.out.println("\nEnter a number to search for: ");
		search = in.nextInt();
		
		for(int i = 0; i < nums.length; i++){
			if(search == nums[i]){
				in_array++;
			}
		}
		
		if(in_array == 0){
			System.out.println("Number is not in the array.");
		}else{
			search(nums, search, nums.length/2);
		}
		
	}
		
}


