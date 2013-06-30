
public class PennyPitch {

	public static void main(String[] args) {
		int balls = 0, dolls = 0, posters = 0, puzzles = 0, games = 0, count = 0;
		String[][] board = new String[5][5];
		
		do{
			int row = (int)(5*Math.random()), column = (int)(5*Math.random());
			if(board[row][column] == null){
				board[row][column] = " BALL ";
				count++;
			}
		}while(count < 3);
		count = 0;
		//This loop fills three random empty squares in the array with " BALL "
		
		do{
			int row = (int)(5*Math.random()), column = (int)(5*Math.random());
			if(board[row][column] == null){
				board[row][column] = " GAME ";
				count++;
			}
		}while(count < 3);
		count = 0;
		//This loop fills three random empty squares in the array with " GAME "
		
		do{
			int row = (int)(5*Math.random()), column = (int)(5*Math.random());
			if(board[row][column] == null){
				board[row][column] = "POSTER";
				count++;
			}
		}while(count < 3);
		count = 0;
		//This loop fills three random empty squares in the array with "POSTER"
		
		do{
			int row = (int)(5*Math.random()), column = (int)(5*Math.random());
			if(board[row][column] == null){
				board[row][column] = "PUZZLE";
				count++;
			}
		}while(count < 3);
		count = 0;
		//This loop fills three random empty squares in the array with "PUZZLE"
		
		do{
			int row = (int)(5*Math.random()), column = (int)(5*Math.random());
			if(board[row][column] == null){
				board[row][column] = " DOLL ";
				count++;
			}
		}while(count < 3);
		count = 0;
		//This loop fills three random empty squares in the array with " DOLL "
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				if(board[i][j] == null){
					board[i][j] = " EMPTY";
				}
			}
		}
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				System.out.print("[" + board[i][j] + "] ");
			}
			System.out.println();
		}
		System.out.println();
		//This loop displays each element in the array in the format [element]
		
		for(int i = 0; i <= 10; i++){
			int row = (int)(5*Math.random()), column = (int)(5*Math.random());
			if(board[row][column] == " BALL "){
				balls++;
			}else if(board[row][column] == " DOLL "){
				dolls++;
			}else if(board[row][column] == "PUZZLE"){
				puzzles++;
			}else if(board[row][column] == "POSTER"){
				posters++;
			}else if(board[row][column] == " GAME "){
				games++;
			}
		}
		//This loop chooses ten random squares (they cannot be chosen multiple times) and adds the number of times each prize was chosen.
		
		if(dolls == 3 || balls == 3 || games == 3 || puzzles == 3 || posters == 3){
			System.out.print("The following prize(s) were won: ");
			if(dolls == 3)
				System.out.print("doll ");
			if(balls == 3)
				System.out.print("ball ");
			if(games == 3)
				System.out.print("game ");
			if(puzzles == 3)
				System.out.print("puzzle ");
			if(posters == 3)
				System.out.print("poster ");
		}else
			System.out.println("No prizes were won.");
		//This decision structure decides if any prizes were won. A prize was won if all three of any one prize were chosen.
		
		

	}

}
