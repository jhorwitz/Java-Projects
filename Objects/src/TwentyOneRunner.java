import java.util.Scanner;

public class TwentyOneRunner {

	public static void main(String[] args) {
		int hit_or_stay, counter = 3, counter2 = 3;
		System.out.println("Card Values: 1-10, Ace = 1 or 11, Jack Queen and King = 10.");
		System.out.println("Try to get as close to 21 without going over.");
		System.out.println("You win if you get closer to 21 than the dealer without going over. Dealer wins ties.");
		System.out.println("If you get five cards and are still under 21, you win.\n");
		
		Scanner in = new Scanner(System.in);
		Player player = new Player();
		Dealer dealer = new Dealer();
		
		player.setCard(1, Deck.checkAceValue(Deck.deal()));
		System.out.println("First Card: " + Deck.getValue(Deck.getCardValue()));
		
		do{
			dealer.setCard(1, Deck.deal());
		}while(Deck.getCardValue() == player.getCard(1));
		
		do{
			player.setCard(2, Deck.checkAceValue(Deck.deal()));
		}while(Deck.getCardValue() == player.getCard(1) || Deck.getCardValue() == dealer.getCard(1));
		System.out.println("Second Card: " + Deck.getValue(Deck.getCardValue()));
		
		do{
			dealer.setCard(2, Deck.deal());
		}while(Deck.getCardValue() == player.getCard(1) || Deck.getCardValue() == dealer.getCard(1) || Deck.getCardValue() == player.getCard(2));
		
		System.out.println("Your total is: " + player.getTotal());
		
		do{
			System.out.println("Would you like to hit (1) or stay (2)?");
			hit_or_stay = in.nextInt();
			if(hit_or_stay == 1){
				do{
					player.setCard(counter, Deck.checkAceValue(Deck.deal()));
				}while(Deck.getCardValue() == player.getCard(1) || Deck.getCardValue() == dealer.getCard(1) || Deck.getCardValue() == dealer.getCard(2) || Deck.getCardValue() == player.getCard(counter - 1));
				System.out.println("Card number " + counter + " is: " + Deck.getValue(Deck.getCardValue()));
				System.out.println("Your total is: " + player.getTotal());
				counter++;
			}
		}while(player.getTotal() < 21 && hit_or_stay == 1 && counter <= 5);
		
		while(dealer.getTotal() < 17 && counter2 < 5){
			do{
				dealer.setCard(counter2, Deck.deal());
			}while(Deck.getCardValue() == player.getCard(1) || Deck.getCardValue() == dealer.getCard(1) || Deck.getCardValue() == player.getCard(2) || Deck.getCardValue() == dealer.getCard(2) || Deck.getCardValue() == player.getCard(3) || Deck.getCardValue() == dealer.getCard(counter2 - 1) || Deck.getCardValue() == player.getCard(4) || Deck.getCardValue() == player.getCard(5));
			counter2++;
		}
		System.out.println("Dealer hit " + (counter2 - 3) + " times.");
		
		System.out.println("Your total is: " + player.getTotal());
		System.out.println("The dealer's total is: " + dealer.getTotal());
		
		if((player.getTotal() <= 21 && dealer.getTotal() < 21 && player.getTotal() > dealer.getTotal() && counter < 5 && counter2 < 5) || (player.getTotal() <= 21 && (counter == 5 & counter2 != 5)) || (player.getTotal() <= 21 && dealer.getTotal() > 21)){
			System.out.println("You win");
		}else if(player.getTotal() > 21 && dealer.getTotal() > 21 && player.getTotal() < dealer.getTotal()){
			System.out.println("You win");
		}else{
			System.out.println("The dealer wins");
		}
	}

}
