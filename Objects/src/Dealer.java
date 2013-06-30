
public class Dealer {
private int hand_total, card1, card2, card3, card4, card5;
	
	public Dealer() {
		hand_total = card1 + card2 + card3 + card4 + card5;
		card1 = 0;
		card2 = 0;
		card3 = 0;
		card4 = 0;
		card5 = 0;
	}
	
	public void setCard(int i, int card){
		switch(i){
			case 1: card1 = card; hand_total += card;break;
			case 2: card2 = card; hand_total += card;break;
			case 3: card3 = card; hand_total += card;break;
			case 4: card4 = card; hand_total += card;break;
			case 5: card5 = card; hand_total += card;break;
		}
	}
	
	public int getCard(int i){
		int c = 0;
		switch(i){
			case 1: c = card1;break;
			case 2: c = card2;break;
			case 3: c = card3;break;
			case 4: c = card4;break;
			case 5: c = card5;break;
		}
		return c;
	}
	
	public int getTotal(){
		return hand_total;
	}
}
