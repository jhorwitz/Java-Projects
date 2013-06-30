import java.util.Scanner;

public class MankalaGame {
	Scanner in = new Scanner(System.in);
	private int[] player1 = new int[6], player2 = new int[6], pits = new int[6], temp1 = new int[6], temp2 = new int[6];
	private int choice; //index corresponding to the letter of each pit
	public int stones1 = 0, stones2 = 0; //each player's pit of stones
	public int pickup; //number of stones a player picks up to move
	private boolean another_turn = false;
	private int counter;
	
	
	/*
	 * Constructor
	 * Sets values in Player1 and player2 arrays to 3 and gives a number to each pit
	 */
	public MankalaGame(){
		for(int i = 0; i < 6; i++){
			player1[i] = 3;
			player2[i] = 3;
		}
		pits[0] = 1;
		pits[1] = 2;
		pits[2] = 3;
		pits[3] = 4;
		pits[4] = 5;
		pits[5] = 6;
	}
	
	/*
	 * displays the game board
	 * PRE: NONE
	 * POST: NONE
	 */
	public void display(){
		System.out.print("      ");
		for(int i = 0; i < 6; i++){
			System.out.print(player2[i] + " ");
		}
		System.out.println();
		System.out.println(stones2 + "                     " + stones1);
		System.out.print("      ");
		for(int i = 0; i < 6; i++){
			System.out.print(player1[i] + " ");
		}
		System.out.print("\nPILE: ");
		for(int i = 0; i < 6; i++){
			System.out.print(pits[i] + " ");
		}
		System.out.println("\n");
	}

	/*
	 * Prompts player1 for a pile to move and then decides which pile the user chose
	 * PRE: NONE
	 * POST: NONE
	 */
	public void player1Turn(){
		System.out.println("PLAYER 1: ");
		System.out.println("Choose which pile to move: ");
		choice = in.nextInt();
		move1(choice - 1);
	}
	
	 /* Prompts player2 for a pile to move and then decides which pile the user chose
	 * PRE: NONE
	 * POST: NONE
	 */
	public void player2Turn(){
		System.out.println("PLAYER 2: ");
		System.out.println("Choose which pile to move: ");
		choice = in.nextInt();
		move2(choice - 1);
	}
	
	/*
	 * Moves stones from the pile at player1[x]
	 * PRE: x is an index of player1[]
	 * POST: NONE
	 */
	public void move1(int x){
		another_turn = false;
		pickup = player1[x];
		counter = pickup;
		player1[x] = 0;
		
		for(int i = 0; i < 6; i++){
			temp1[i] = player1[i];
		}
		
		for(int i = (x + 1); i < 6 && pickup > 0; i++){
			player1[i]++;
			pickup--;
		}
		if(pickup > 0){
			stones1++;
			pickup--;
			if(pickup == 0){
				another_turn = true;
			}
		}
		if(pickup > 0){
			for(int i = 5; i >= 0 && pickup > 0; i--){
				player2[i]++;
				pickup--;
			}
		}
		if(pickup > 0){
			stones2++;
			pickup--;
			if(pickup == 0){
				another_turn = true;
			}
		}
		if(pickup > 0){
			for(int i = 0; i < 6 && pickup > 0; i++){
				player1[i]++;
				pickup--;
			}
		}
		if(pickup > 0){
			stones1++;
			pickup--;
			if(pickup == 0){
				another_turn = true;
			}
		}
		if(pickup > 0){
			for(int i = 5; i >= 0 && pickup > 0; i--){
				player2[i]++;
				pickup--;
			}
		}
		if(pickup > 0){
			stones2++;
			pickup--;
			if(pickup == 0){
				another_turn = true;
			}
		}
		if(pickup > 0){
			for(int i = 0; i < 6 && pickup > 0; i++){
				player1[i]++;
				pickup--;
			}
		}
		if(pickup > 0){
			stones1++;
			pickup--;
			if(pickup == 0){
				another_turn = true;
			}
		}
		if(pickup > 0){
			for(int i = 5; i >= 0 && pickup > 0; i--){
				player2[i]++;
				pickup--;
			}
		} //This series of for loops and if statements simulates the movement of the stones. It is long enough to account for the largest case scenario (when every single stone is in one pit)
		
		for(int i = 0; i < 6; i++){
			if(temp1[i] == 0 && counter == (5 - i)){
				stones1 += player2[i];
				player2[i + counter] = 0;
			}
		} //This loop accounts for the rule that if the last stone lands in an empty pit, the player gets all of the stones in the pit accross from where the last stone landed
		
	}

	/*
	 * Moves stones from the pile at player2[x]
	 * PRE: x is an index of player2[]
	 * POST: NONE
	 */
	public void move2(int x){
		another_turn = false;
		pickup = player2[x];
		counter = pickup;
		player2[x] = 0;
		
		for(int i = 0; i < 6; i++){
			temp2[i] = player2[i];
		}
		
		for(int i = (x - 1); i >= 0 && pickup > 0; i--){
			player2[i]++;
			pickup--;
		}
		if(pickup > 0){
			stones2++;
			pickup--;
			if(pickup == 0){
				another_turn = true;
			}
		}
		if(pickup > 0){
			for(int i = 0; i < 6 && pickup > 0; i++){
				player1[i]++;
				pickup--;
			}
		}
		if(pickup > 0){
			stones1++;
			pickup--;
			if(pickup == 0){
				another_turn = true;
			}
		}
		if(pickup > 0){
			for(int i = 5; i >= 0 && pickup > 0; i--){
				player2[i]++;
				pickup--;
			}
		}
		if(pickup > 0){
			stones2++;
			pickup--;
			if(pickup == 0){
				another_turn = true;
			}
		}
		if(pickup > 0){
			for(int i = 0; i < 6 && pickup > 0; i++){
				player1[i]++;
				pickup--;
			}
		}
		if(pickup > 0){
			stones1++;
			pickup--;
			if(pickup == 0){
				another_turn = true;
			}
		}
		if(pickup > 0){
			for(int i = 5; i >= 0 && pickup > 0; i--){
				player2[i]++;
				pickup--;
			}
		}
		if(pickup > 0){
			stones2++;
			pickup--;
			if(pickup == 0){
				another_turn = true;
			}
		}
		if(pickup > 0){
			for(int i = 0; i < 6 && pickup > 0; i++){
				player1[i]++;
				pickup--;
			}
		}
		if(pickup > 0){
			stones1++;
			pickup--;
			if(pickup == 0){
				another_turn = true;
			}
		} //This series of for loops and if statements simulates the movement of the stones. It is long enough to account for the largest case scenario (when every single stone is in one pit)
		
		for(int i = 5; i >= 0; i--){
			if(temp2[i] == 0 && counter == (x - i)){
				stones2 += player1[i];
				player1[i] = 0;
			}
		} //This loop accounts for the rule that if the last stone lands in an empty pit, the player gets all of the stones in the pit accross from where the last stone landed
		
	}
	
	/*
	 * checks to see if the game is over. True means the game goes on. False means the game is over.
	 * PRE: NONE
	 * POST: returns a boolean value
	 */
	public boolean keepPlaying(){
		int sum1 = 0, sum2 = 0;
		for(int i = 0; i < 6; i++){
			sum1 += player1[i];
			sum2 += player2[i];
		}
		if(sum1 == 0 || sum2 == 0){
			return false;
		}else{
			return true;
		}
	}
	
	/*
	 * tells if the player gets another turn or not
	 * PRE: NONE
	 * POST: returns a boolean expression
	 */
	public boolean anotherTurn(){
		return another_turn;
		
	}
	
}