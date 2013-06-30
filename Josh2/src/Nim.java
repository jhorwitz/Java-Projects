import java.util.Scanner;

public class Nim {
	
	/*
	 * tells if the user's entry is valid or not
	 * PRE: num and stones are positive
	 * POST: Returns a boolean value
	 */
	public static boolean isValidEntry(int num, int stones){
		if(num >= 1 && num <= 3 && num <= stones){
			return true;
		}else{
			return false;
		}
	}
	
	/*
	 * takes the user's input and calls on isValidEntry() to see if it is valid
	 * PRE: stones > 0
	 * POST: returns a valid entry for the user's turn
	 */
	public static int userTurn(int stones){
		Scanner in = new Scanner(System.in);
		int user;
		user = in.nextInt();
		do{
			if(!(isValidEntry(user, stones))){
				System.out.println("You must take either 1, 2, or 3 and you cannot take more than the number that is there.");
				user = in.nextInt();
			}
		}while(!(isValidEntry(user, stones)));
		return user;
	}

	/*
	 * Gets a random number from 1 to 3 for the computer's turn
	 * PRE: stones is > 0
	 * POST: Returns an integer from 1 to 3
	 */
	public static int drawStones(int stones){
		if(stones >= 3){
			return (int)((3)*Math.random() + 1);
		}else if(stones == 2){
			return (int)((2)*Math.random() + 1);
		}else{
			return 1;
		}
	}
	
	public static void main(String[] args) {
		int user, computer, stones = (int)((30 - 15 + 1)*Math.random() + 15);
		
		while(stones >= 1){
			System.out.println("There are " + stones + " stones. How many would you like? ");
			user = userTurn(stones);
			stones -= user;
			if(stones > 0){
				computer = drawStones(stones);
				System.out.println("There are " + stones + " stones. The computer takes " + computer + ".");
				stones -= computer;
				if(stones == 0){
					System.out.println("The player beats the computer!");
				}
			}else{
				System.out.println("The computer wins!");
			}
		}
	}

}
