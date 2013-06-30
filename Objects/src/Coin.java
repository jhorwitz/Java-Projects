
public class Coin {

	private int faceUp; //instance variable
	
	/*This method returns the value of faceUp
	 * PRE: NONE
	 * POST: returns an integer from 0 to 1, inclusive
	 */
	public int showFace(){
		return faceUp;
	}
	
	/*This method assigns a random from 0 to 1, inclusive to faceUp
	 * PRE: NONE
	 * POST: NONE
	 */
	public void flipCoin(){
		faceUp = (int)(2*Math.random());
	}
	
	/*Returns a String that represents the coin flip
	 * PRE: NONE
	 * POST: A string representing the coin flip is returned
	 */
	public String toString(Coin c) {
		if(showFace() == 0){
			return("The coin is heads up");
		}else{
			return("The coin is tails up");
		}
	}
}
