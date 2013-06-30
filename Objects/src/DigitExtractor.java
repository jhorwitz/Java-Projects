import java.util.Scanner;

public class DigitExtractor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str, choice;
		
		System.out.println("Enter a three digit integer: ");
		str = in.nextLine();
		Num num = new Num(str);
		
		do{
		System.out.println("Show (W)hole number.");
		System.out.println("Show (O)nes place.");
		System.out.println("Show (T)ens place.");
		System.out.println("Show (H)undreds place.");
		System.out.println("(Q)uit.");
		System.out.println("Enter your choice.");
		choice = in.nextLine();
		
		if(choice.equalsIgnoreCase("W")){
			System.out.println(num.wholeNumber());
		}else if(choice.equalsIgnoreCase("O")){
			System.out.println(num.onesPlace());
		}else if(choice.equalsIgnoreCase("T")){
			System.out.println(num.tensPlace());
		}else if(choice.equalsIgnoreCase("H")){
			System.out.println(num.hundredsPlace());
		}else{
			System.out.println("Entry is invalid.");
		}
		}while(!(choice.equalsIgnoreCase("Q")));

	}

}
