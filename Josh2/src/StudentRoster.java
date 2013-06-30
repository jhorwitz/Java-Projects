import java.util.Scanner;
public class StudentRoster {

	public static void main(String[] args) {
		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		
		System.out.println("How many students are in the class?");
		int num = in1.nextInt();
		String[] name = new String[num];
		
		for(int i = 1; i <= num; i++){
			System.out.println("Enter student " + i + ": ");
			name[i-1] = in2.nextLine();
		}
		
		System.out.println("\nStudent Roster\n");
		
		for(int i = 0; i <= (num - 1); i++){
			System.out.println((i + 1) + ": " + name[i]);
		}

	}

}
