import java.util.Scanner;
public class GridOfLife {
	Scanner in = new Scanner(System.in);
	
	public int cells = 0;
	private int row, column;
	private static int neighbors;
	private static String[][] grid = new String[20][20], temp = new String[20][20];

	/*
	 * Constructor
	 * Prompts user for coordinates of life and sets them to position in array
	 */
	public GridOfLife(){
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 20; j++){
				grid[i][j] = "O";
				temp[i][j] = "O";
			}
		}
		//This loop sets every square in grid and temp = "o"
		do{
			System.out.println("Enter the row of a cell to create life (-1 to quit): ");
			row = in.nextInt();
			if(row >= 0 && row < 20){
				System.out.println("Enter the column of a cell:");
				column = in.nextInt();
				grid[row][column] = "X";
				temp[row][column] = "X";
				cells++;
			}
		}while(row >= 0 && row < 20);
		//This loop prompts the user for the coordinates of living cells in the grid
		
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 20; j++){
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	/*
	 * Tells how many neighbors the cell at [r][c] has
	 * PRE: r and c are integers within the bounds of grid[][]
	 * POST: returns an integer
	 */
	public static int determineNeighbors(int r, int c){
		neighbors = 0;
		if(r > 0 && r < 19 && c > 0 && c < 19){ //This if statement adds the neighbors for a cell that is not located on the edge of the grid
			if(grid[r][c + 1] == "X"){
				neighbors++;
			}
			if(grid[r + 1][c + 1] == "X"){
				neighbors++;
			}
			if(grid[r - 1][c + 1] == "X"){
				neighbors++;
			}
			if(grid[r][c - 1] == "X"){
				neighbors++;
			}
			if(grid[r + 1][c - 1] == "X"){
				neighbors++;
			}
			if(grid[r - 1][c - 1] == "X"){
				neighbors++;
			}
			if(grid[r + 1][c] == "X"){
				neighbors++;
			}
			if(grid[r - 1][c] == "X"){
				neighbors++;
			}
		}else if(r == 0 && c > 0 && c < 19){ //This if statement adds the neighbors around a cell that is located on the bottom edge of the grid
			if(grid[r][c + 1] == "X"){
				neighbors++;
			}
			if(grid[r + 1][c + 1] == "X"){
				neighbors++;
			}
			if(grid[r][c - 1] == "X"){
				neighbors++;
			}
			if(grid[r + 1][c - 1] == "X"){
				neighbors++;
			}
			if(grid[r + 1][c] == "X"){
				neighbors++;
			}
		}else if(r == 19 && c > 0 && c < 19){ //This if statement adds the neighbors around a cell that is located on the top edge of the grid
			if(grid[r][c + 1] == "X"){
				neighbors++;
			}
			if(grid[r - 1][c + 1] == "X"){
				neighbors++;
			}
			if(grid[r][c - 1] == "X"){
				neighbors++;
			}
			if(grid[r - 1][c - 1] == "X"){
				neighbors++;
			}
			if(grid[r - 1][c] == "X"){
				neighbors++;
			}
		}else if(c == 0 && r > 0 && r < 19){ //This if statement adds the neighbors around a cell that is located on the left edge of the grid
			if(grid[r][c + 1] == "X"){
				neighbors++;
			}
			if(grid[r + 1][c + 1] == "X"){
				neighbors++;
			}
			if(grid[r - 1][c + 1] == "X"){
				neighbors++;
			}
			if(grid[r + 1][c] == "X"){
				neighbors++;
			}
			if(grid[r - 1][c] == "X"){
				neighbors++;
			}
		}else if(c == 19 && r > 0 && r < 19){ //This if statement adds the neighbors around a cell that is located on the right edge of the grid
			if(grid[r][c - 1] == "X"){
				neighbors++;
			}
			if(grid[r + 1][c - 1] == "X"){
				neighbors++;
			}
			if(grid[r - 1][c - 1] == "X"){
				neighbors++;
			}
			if(grid[r + 1][c] == "X"){
				neighbors++;
			}
			if(grid[r - 1][c] == "X"){
				neighbors++;
			}
		}else if(r == 0 && c == 0){ //This if statement adds the neighbors around a cell that is located on top left corner of the grid
			if(grid[r][c + 1] == "X"){
				neighbors++;
			}
			if(grid[r + 1][c + 1] == "X"){
				neighbors++;
			}
			if(grid[r + 1][c] == "X"){
				neighbors++;
			}
		}else if(r == 19 && c == 19){ //This if statement adds the neighbors around a cell that is located on bottom right corner of the grid
			if(grid[r][c - 1] == "X"){
				neighbors++;
			}
			if(grid[r - 1][c - 1] == "X"){
				neighbors++;
			}
			if(grid[r - 1][c] == "X"){
				neighbors++;
			}
		}else if(r == 19 && c == 0){ //This if statement adds the neighbors around a cell that is located on bottom left corner of the grid
			if(grid[r][c + 1] == "X"){
				neighbors++;
			}
			if(grid[r - 1][c + 1] == "X"){
				neighbors++;
			}
			if(grid[r - 1][c] == "X"){
				neighbors++;
			}
		}else if(r == 0 && c == 19){ //This if statement adds the neighbors around a cell that is located on top right corner of the grid
			if(grid[r][c - 1] == "X"){
				neighbors++;
			}
			if(grid[r + 1][c - 1] == "X"){
				neighbors++;
			}
			if(grid[r + 1][c] == "X"){
				neighbors++;
			}
		}
		return neighbors;
	}

	/*
	 * Goes through a day on the grid
	 * PRE: NONE
	 * POST: NONE
	 */
	public void nextDay(){
		cells = 0;
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 20; j++){
				if(grid[i][j] == "X"){
					if(determineNeighbors(i, j) == 2 || determineNeighbors(i, j) == 3){
						temp[i][j] = "X";
					}else
						temp[i][j] = "O";
				}else{
					if(determineNeighbors(i, j) == 3){
						temp[i][j] = "X";
					}else
						temp[i][j] = "O";
				}
			}
		}
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 20; j++){
				grid[i][j] = temp[i][j];
				if(temp[i][j] == "X"){
					cells++;
				}
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
