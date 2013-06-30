import java.util.ArrayList;
public class Sorts {

	public Sorts(){
	}
	
	/*
	 * Sorts an Array of integers from low to high
	 * PRE: NONE
	 * POST: ints have been sorted from low to high
	 */
	public static void selectionSort(int[] items){
		for(int index = 0; index < items.length; index++){
			for(int sub_index = index; sub_index < items.length; sub_index++){
				if(items[sub_index] < items[index]){
					int temp = items[index];
					items[index] = items[sub_index];
					items[sub_index] = temp;
				}
			}
		}
	}
	
	/*
	 * Sorts an ArrayList of Double objects from low to high
	 * PRE: NONE
	 * POST: Doubles have been sorted from low to high
	 */
	public static void selectionSort(ArrayList<Double> items){
		for(int index = 0; index < items.size(); index++){
			for(int sub_index = index; sub_index < items.size(); sub_index++){
				if(items.get(sub_index).compareTo(items.get(index)) < 0){
					Double temp = items.get(index);
					items.set(index, items.get(sub_index));
					items.set(sub_index, temp);
				}
			}
		}
	}
	
	/*
	 * Sorts an array of strings from a to z
	 * PRE: NONE
	 * POST: Strings have been sorted alphabetically
	 */
	public static void insertionSort(String[] items){
		String temp;
		int previous_index;
		
		for(int index = 1; index < items.length; index++){
			temp = items[index];
			previous_index = index - 1;
			while((items[previous_index].compareTo(temp) > 0) && (previous_index > 0)){
				items[previous_index + 1] = items[previous_index];
				previous_index -= 1;
			}
			if(items[previous_index].compareTo(temp) > 0){
				items[previous_index + 1] = items[previous_index];
				items[previous_index] = temp;
			}else{
				items[previous_index + 1] = temp;
			}
		}
	}
	
	
}
