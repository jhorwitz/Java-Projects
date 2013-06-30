import java.util.Scanner;
public class CountConsonants {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter text: ");
		String input, text;
		input = in.nextLine();
		text = input.toLowerCase();
		char[] text_array = new char[text.length()];
		int consonants = 0;
		
		text_array = text.toCharArray();
		
		for(int i = 0; i < text.length(); i++){
			if((text_array[i] > 97) && (text_array[i] <= 122) && (text_array[i] != 101) && (text_array[i] != 105) && (text_array[i] != 111) && (text_array[i] != 117))
				consonants++;
		}
		
		System.out.println("The number of consonants in " + input + " is " + consonants);
		
	}

}
