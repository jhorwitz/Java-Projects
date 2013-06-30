import java.util.Scanner;

public class DiceRollGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DRPlayer player = new DRPlayer();
		int call, risk;
		
		System.out.println("You have " + player.showPoints() + " points.");
		
		do{
			System.out.println("How many points do you want to risk? (-1 to quit): ");
			risk = in.nextInt();
			
			while(risk > player.showPoints()){
				System.out.println("You cannot risk more points than you have.");
				risk = in.nextInt();
			}
			
			if(risk != -1){
				player.getRisk(risk);
				System.out.println("Make a call (0 for low, 1 for high): ");
				call = in.nextInt();
				System.out.println("You rolled: " + player.showRoll());
				
				if(player.showRoll() >= 2 && player.showRoll() <= 6 && call == 0){
					player.addPoints();
					System.out.println("You have " + player.showPoints() + " points.");
				}else if(player.showRoll() >= 8 && player.showRoll() <= 12 && call == 1){
					player.addPoints();
					System.out.println("You have " + player.showPoints() + " points.");
				}else{
					player.losePoints();
					System.out.println("You have " + player.showPoints() + " points.");
				}
			}
		}while(risk != -1 && player.showPoints() > 0);
	}
}