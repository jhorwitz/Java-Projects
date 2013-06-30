
public class Life {

	public static void main(String[] args) {
		GridOfLife grid = new GridOfLife();
		
		do{
			grid.nextDay();
		}while(grid.cells > 0);
		
	}
}