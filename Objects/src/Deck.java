import java.util.Scanner;

public class Deck {
	
	private static int card_value;

	public static int deal() {
		card_value = ((int) ((52)*Math.random() + 1));
		int deal = card_value % 13;
		if(deal <= 10 && deal >= 1){
			return deal;
		}else{
			return 10;
		}
	}
	
	public static int getCardValue(){
		return card_value;
	}
	
	/*getValue will convert the number 1-52 into the card
	 * 1-13 Spades, 1 = Ace, 11 = jack, 12 = queen, 13 = king
	 * 14-26 Clubs, 14 = Ace, 24 = jack, 25 = queen, 26 = king
	 * 27-39 Diamonds, 27 = Ace, 37 = jack, 38 = queen, 39 = king
	 * 40-52 Hearts, 40 = Ace, 50 = jack, 51 = queen, 52 = king
	 */
	public static String getValue(int i) {
		String temp = "";
		if(i % 13 == 1){
			temp += "A";
		}else if(i % 13 > 1 && i % 13 < 11){
			temp += (i % 13);
		}else if (i % 13 == 11){
			temp += "Jack";
		}else if (i % 13 == 12){
			temp += "Queen";
		}else if (i % 13 == 0){
			temp += "King";
		}
			
		if(i / 13 == 0){
			temp += " of Spades";
		}else if(i / 13 == 1){
			temp += " of Clubs";
		}else if(i / 13 == 2){
			temp += " of Diamonds";
		}else{
			temp += " of Hearts";
		}
		
		return temp;
	}
	
	public static int checkAceValue(int c){
		Scanner in = new Scanner(System.in);
		if(c == 1){
			System.out.println("Would you like your ace to count as 1 or 11?");
			return in.nextInt();
		}else
			return c;
	
	}
}
