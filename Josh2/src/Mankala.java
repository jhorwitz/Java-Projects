public class Mankala {

	public static void main(String[] args) {
		MankalaGame game = new MankalaGame();
		game.display();
		do{
			do{
				game.player1Turn();
				game.display();
			}while(game.anotherTurn());
			do{
				game.player2Turn();
				game.display();
			}while(game.anotherTurn());
		}while(game.keepPlaying());

		if(game.stones1 > game.stones2){
			System.out.println("Player 1 wins!");
		}else if(game.stones2 > game.stones1){
			System.out.println("Player 2 wins!");
		}else{
			System.out.println("It's a tie!");
		}
	}

}
