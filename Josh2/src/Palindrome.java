import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word;
		System.out.println("Enter a word or phrase:");
		word = in.nextLine();
		char[] backwards = new char[word.length()];
		int count = 0, k = 0;
		
		word = word.replaceAll(" ","");
		
		backwards = word.toCharArray();
		
		
		for(int i = (word.length() - 1); i >= 0; i--){
			backwards[k] = word.charAt(i);
			k++;
		}
		
		for(int i = 0; i < word.length(); i++){
			if(!(word.charAt(i) == backwards[i])){
				count++;
			}
		}
		
		if(count == 0)
			System.out.println("This is a palindrome.");
		else
			System.out.println("This is not a palindrome.");
		

	}

}
