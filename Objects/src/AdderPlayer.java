
public class AdderPlayer {

	private int points;
	
	/*Constructor
	 * sets points to 0
	 */
	public AdderPlayer(){
		points = 0;
	}
	
	/*adds p to points
	 * PRE: p is an integer
	 * POST: NONE
	 */
	public void addPoints(int p){
		points += p;
	}
	
	/*Returns the value of points
	 * PRE: NONE
	 * POST: Returns an integer
	 */
	public int getPoints(){
		return points;
	}
}
