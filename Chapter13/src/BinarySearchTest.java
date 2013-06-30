import java.util.Scanner;

public class BinarySearchTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int size = in.nextInt(), in_array = 0;
		String search;
		String[] test = new String[size];
		
		System.out.println("Enter a list of " + size + " words, names, or phrases.");
		for(int i = 0; i < size; i++){
			test[i] = (in2.nextLine()).toLowerCase();
		}
		
		Sorts.insertionSort(test);
		System.out.println("Sorted: ");
		for(int i = 0; i < size; i++){
			System.out.print(test[i] + " ");
		}
		
		System.out.println("\nEnter a word or phrase to search for.");
		search = (in2.nextLine()).toLowerCase();
		
		for(int i = 0; i < size; i++){
			if(search.equals(test[i])){
				in_array++;
			}
		}
		
		if(in_array == 0){
			System.out.println("Entry is not in the list. ");
		}else{
			System.out.println("Number at postition: " + ObjectBinarySearch.search(test, search, size/2));
		}
		

	}

}
