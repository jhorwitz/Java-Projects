
public class NimPile {

	private int stones = (int)((30 - 15 + 1)*Math.random() + 15);
	
	/*returns the value of stones
	 * PRE: none
	 * POSt: returns an integer
	 */
	public int getStones(){
		return stones;
	}
	
	/*subtracts num from the value for stones
	 * PRE: num is an integer
	 * POST: none
	 */
	public void takeStones(int num){
		stones -= num;
	}
	
}
