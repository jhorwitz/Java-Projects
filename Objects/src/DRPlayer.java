
public class DRPlayer {

	private int roll, die1, die2, points = 1000, risk, call;
	
	/*Constructor
	 * Sets the value of roll to the sum of 2 dice
	 */
	public DRPlayer(){
		Die die1 = new Die();
		Die die2 = new Die();
		roll = die1.roll() + die2.roll();
	}
	
	/*returns the value of points
	 * PRE: NONE
	 * POST: returns an integer
	 */
	public int showPoints(){
		return points;
	}
	
	/*Sets the value for risk
	 * PRE: r is an integer
	 * POST: NONE
	 */
	public void getRisk(int r){
		risk = r;
	}
	
	/*Returns the value of roll
	 * PRE: NONE
	 * POST: Returns an integer
	 */
	public int showRoll(){
		return roll;
	}
	
	/*adds risk to the value of points and returns points
	 * PRE: NONE
	 * POST: NONE
	 */
	public int addPoints(){
		return (points += risk);
	}
	
	/*Subtracts risk from the value of points and returns points
	 * PRE: NONE
	 * POST: returns an integer
	 */
	public int losePoints(){
		return (points -= risk);
	}
}
