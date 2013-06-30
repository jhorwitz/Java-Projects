
public class Num {

	private String num;
	
	/*Constructor
	 * Sets the initial value of num to str
	 */
	public Num(String str){
		num = str;
	}
	
	/*returns the whole value of num
	 * PRE: NONE
	 * POST: returns a string
	 */
	public String wholeNumber(){
		return num;
	}
	
	/*returns the ones place of num
	 * PRE: NONE
	 * POST: returns a string
	 */
	public String onesPlace(){
		return num.substring(num.length()-1, num.length());
	}
	
	/*returns the tens place of num
	 * PRE: NONE
	 * POST: returns a string
	 */
	public String tensPlace(){
		return num.substring(num.length()-2, num.length()-1);
	}
	
	/*returns the hundreds place of num
	 * PRE: NONE
	 * POST: returns a string
	 */
	public String hundredsPlace(){
		return num.substring(num.length()-3, num.length()-2);
	}
	
}
