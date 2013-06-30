import java.util.Scanner;
public class NumberCounts {

	public static void main(String[] args) {
		final int LOW = '0';
		final int HIGH = '9';
		int[] digitcounts = new int[HIGH - LOW + 1];
		Scanner in = new Scanner(System.in);
		String number;
		char[] numberdigits;
		int offset;
		
		System.out.print("Enter a number: ");
		number = in.nextLine();
		
		numberdigits = number.toCharArray();
		for(int num = 0; num < numberdigits.length; num++){
			offset = numberdigits[num] - LOW;
			digitcounts[offset] += 1;
		}
		
		for(int i = LOW; i <= HIGH; i++){
			System.out.println((char)i + ": " + digitcounts[i - LOW]);
		}
	}
}
