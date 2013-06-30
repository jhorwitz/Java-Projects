import java.util.Scanner;
public class CountLetters {

	public static void main(String[] args) {
		final int LOW = 'A';
		final int HIGH = 'Z';
		int[] letterCounts = new int[HIGH - LOW + 2];
		Scanner input = new Scanner(System.in);
		String phrase;
		char[] phraseLetters;
		int offset;
		
		System.out.print("Enter a phrase: ");
		phrase = input.nextLine();
		phrase = phrase.toUpperCase();
		
		phraseLetters = phrase.toCharArray();
		for(int letter = 0; letter < phraseLetters.length; letter++){
			if(phraseLetters[letter] == 32){
				letterCounts[26]++;
			}else{
				offset = phraseLetters[letter] - LOW;
				letterCounts[offset]++;
			}
		}
		
		for(int i = LOW; i <= HIGH + 1; i++){
			if(i == 91){
				System.out.println("Spaces: " + letterCounts[i - LOW]);
			}else{
				System.out.println((char)i + ": " + letterCounts[i - LOW]);
			}
		}
	}
}
