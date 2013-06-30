
import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		
	/*
	 * this algorithm requires a space at the end of the variable input
	 */
		
		Scanner in = new Scanner(System.in);
		String input, letter1, word;
		
		System.out.println("Enter a sentence:");
		input = in.nextLine() + " ";
		input = input.toLowerCase();
		System.out.println("Your sentence in pig latin is: ");
		
		letter1 = (input.substring(1, 2)).toUpperCase();
		System.out.print(letter1 + input.substring(2, input.indexOf(" ")) + "-" + input.substring(0, 1));
		
		if(input.substring(0, 1).equals("A") || input.substring(0, 1).equals("E") || input.substring(0, 1).equals("I") || input.substring(0, 1).equals("O") || input.substring(0, 1).equals("U")){
			System.out.print("hay ");
		}else if(input.startsWith("Qu")){
			System.out.print("uay ");
		}else{
			System.out.print("ay ");
		}
		
		input = input.substring(input.indexOf(" ") + 1);
		
		do{
			
			word = input.substring(0, (input.indexOf(" ") + 1));
			System.out.print(word.substring(1, word.indexOf(" ")) + "-");
			
			if(word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")){
				System.out.print(word.substring(0, 1) + "hay ");
			}else if(word.startsWith("qu")){
				System.out.print("quay ");
			}else{
				System.out.print(word.substring(0, 1) + "ay ");
			}
			
			input = input.substring(input.indexOf(" ") + 1);
			
		}while(input.length() > 0);

	}

}
