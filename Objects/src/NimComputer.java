
public class NimComputer {

	/*
	 * Gets a random number from 1 to 3 for the computer's turn
	 * PRE: stones is > 0
	 * POST: Returns an integer from 1 to 3
	 */
	public int drawStones(int stones){
		if(stones >= 3){
			return (int)((3)*Math.random() + 1);
		}else if(stones == 2){
			return (int)((2)*Math.random() + 1);
		}else{
			return 1;
		}
	}
	
}
