import java.util.Scanner;
public class FindName {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		System.out.println("How many names would you like to enter?");
		int length = in.nextInt();
		String[] name_array = new String[length];
		String name;
		int location;
		
		System.out.println("Enter the set of names: ");
		for(int i = 0; i < name_array.length; i++){
			name_array[i] = in2.nextLine();
		}
		
		System.out.print("Enter a name to search for: ");
		name = in2.nextLine();
		
		location = Search.linear(name_array, name);
		
		if(location == -1){
			System.out.println("Sorry, that name was not found in the array.");
		}else{
			System.out.println("First occurance is element " + location);
		}
		
	}
}
