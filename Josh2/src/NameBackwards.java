import java.util.Scanner;
public class NameBackwards {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		char[] nameBackwards;
		
		System.out.println("Enter your name: ");
		name = in.nextLine();
		
		nameBackwards = name.toCharArray();
		System.out.print("Your name backwards is: ");
		
		for(int i = name.length() - 1; i >= 0; i--){
			System.out.print(nameBackwards[i]);
		}

	}

}
