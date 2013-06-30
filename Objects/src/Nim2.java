
public class Nim2 {

	public static void main(String[] args) {
		NimPlayer player = new NimPlayer();
		NimComputer computer = new NimComputer();
		NimPile pile = new NimPile();
		int computerNum, playerNum;
		
		while(pile.getStones() >= 1){
			System.out.println("There are " + pile.getStones() + " stones. How many would you like? ");
			playerNum = player.playerTurn(pile.getStones());
			pile.takeStones(playerNum);
			
			if(pile.getStones() > 0){
				computerNum = computer.drawStones(pile.getStones());
				System.out.println("There are " + pile.getStones() + " stones. The computer takes " + computerNum + ".");
				pile.takeStones(computerNum);
				if(pile.getStones() == 0){
					System.out.println("The player beats the computer!");
				}
			}else{
				System.out.println("The computer wins!");
			}
		}
	}

}
