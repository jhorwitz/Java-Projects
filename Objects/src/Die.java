
public class Die {

	private int die;
	
	/*Constructor
	 * creates a die with a random value from 1 to 6
	 */
	public Die(){
		die = (int)((6)*Math.random()+1);
	}
	
	/*returns the value of the die
	 * PRE: NONE
	 * POST: Returns and integer
	 */
	public int roll(){
		return die;
	}
	
}