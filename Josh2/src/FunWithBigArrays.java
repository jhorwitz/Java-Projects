import java.util.ArrayList;
import java.util.Scanner;

public class FunWithBigArrays {
	
	public static void main(String[] args) {
		
		// int[][] arr = new int[4][5];  double array to type int. creates an array with 4 rows, 5 columns
		
		ArrayList<String> my_string = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		int entry, remove;
		String name;
		
		do{
			System.out.println("Enter 1 to add a name to the list.");
			System.out.println("Enter 2 to take away at a particular location.");
			System.out.println("Enter 3 to print the list.");
			System.out.println("Enter -1 to quit.");
			entry = in.nextInt();
			
			if(entry == 1){
				System.out.println("Enter the name to add: ");
				name = in2.nextLine();
				my_string.add(name);
			}else if(entry == 2){
				System.out.println("Enter the location you wish to remove.");
				remove = in.nextInt();
				my_string.remove(remove); // Doesn't account for the user trying to remove from an index that does not exist (i.e out of bounds)
			}else if(entry == 3){
				for(String x : my_string){ // Everyone who is a string gets temporarily stored as x and then does what's inside the for loop, then resets the variable x to the next string
					int i = 1;
					System.out.println(i + ": " + x);
					i++;
				}
				System.out.println();
			}
			
		}while(entry != -1);
		
		
	}

}
