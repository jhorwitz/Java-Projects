
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int test;
		System.out.println("Enter your grade on the last quiz (1-10)");
		test = input.nextInt();
		
		switch(test){
			case 1:System.out.println("Loser!");break;
			case 2:System.out.println("Slightly bether than a pre-schooler!");break;
			case 3:System.out.println("Ha Ha Ha Ha Ha Ha HA!");break;
			case 4:System.out.println("Almost as good as a monkey guessing!");break;
			case 5:System.out.println("WHOHOO - You are average!");break;
			case 6:System.out.println("Almost to Yogi Bear intellect!");break;
			case 7:System.out.println("Finally a passing grade!");break;
			case 8:System.out.println("Congrats on your B!");break;
			case 9:System.out.println("You are not the weakest link");break;
			case 10:System.out.println("NERD!");break;
		}

	}

}
