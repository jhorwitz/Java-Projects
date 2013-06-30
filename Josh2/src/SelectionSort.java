
public class SelectionSort {
	private static int[] original_array, sorted_array;
	private final int HIGH = 9999;
	private int number, old, lowest;
	
	/*
	 * constructor
	 * Sets the original_array equal to my_nums
	 */
	public SelectionSort(int[] my_nums, int num){
		number = num;
		original_array = my_nums;
		sorted_array = new int[number];
	}
	
	/*
	 * displays contents of sorted
	 * PRE: NONE
	 * POST: NONE
	 */
	public void display(){
		sort();
		for(int i = 0; i < number; i++){
			System.out.print(sorted_array[i] + " ");
		}
	}
	
	/*
	 * Fills sorted_array with the values from the original array from lowest to highest
	 */
	private void sort(){
		for(int i = 0; i < number; i++){
			sorted_array[i] = findLowest();
		}
	}
	
	/*
	 * finds the lowest value in the original array and then sets the old lowest value equal to 9999
	 * PRE: NONE
	 * POST: Returns an integer
	 */
	private int findLowest(){
		lowest = HIGH;
    	for(int i = 0; i < number; i++){
    		if(original_array[i] < lowest){
    			lowest = original_array[i];
    			old = i;
    		}
    	}
    	original_array[old] = HIGH;
		return lowest;
	}
}
