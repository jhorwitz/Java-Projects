
public class AdderProblem {

	private int num1, num2, answer;
	private String problem;
	
	/*Constructor
	 * Creates random numbers for num1 and num2 and sets the answer equal to the sum and creates a string to represent the problem
	 */
	public AdderProblem(){
		num1 = (int)(21*Math.random());
		num2 = (int)(21*Math.random());
		answer = num1 + num2;
		problem = (num1 + " + " + num2 + " = ");
	}
	
	/*Creates a new problem
	 * PRE: NONE
	 * POST: NONE
	 */
	public void newProblem(){
		num1 = (int)(21*Math.random());
		num2 = (int)(21*Math.random());
		answer = num1 + num2;
		problem = (num1 + " + " + num2 + " = ");
	}
	
	/*Returns the problem
	 * PRE: NONE
	 * POST: Returns a string
	 */
	public String getProblem(){
		return problem;
	}
	
	/*checks the answer, n.
	 * PRE: n is an integer
	 * POST: returns a boolean value
	 */
	public boolean checkAnswer(int n){
		if(n == answer){
			return true;
		}else{
			return false;
		}
	}
}
