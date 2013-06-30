
public class Rectangle {

	//Variables
	private int length, width; //instance variables
	
	/*Constructor
	 * sets the initial value of length to 5 and width to 3
	 */
	public Rectangle(){
		length = 5;
		width = 3;
	}
	
	/*Constructor
	 * Sets the initial value of length to l and width to w
	 */
	public Rectangle(int l, int w){
		length = l;
		width = w;
	}
	
	/*This method will change the length of the rectangle
	 * PRE: Int >= 0
	 * POST: NONE
	 */
	public void setLength(int l){
		length = l;
	}
	
	/*This method will change the width of the rectangle
	 * PRE: Int >= 0
	 * POST: NONE
	 */
	public void setWidth(int w){
		width = w;
	}
	
	/*This method will return the length
	 * PRE: NONE
	 * POST: return the length as an int
	 */
	public int getLength() {
		return length;
	}
	
	/*This method will return the width
	 * PRE: NONE
	 * POST: return the width as an int
	 */
	public int getWidth() {
		return width;
	}
	
	/*area computes the area of a rectangle of length length and width width
	 * PRE: length >= 0 and width >= 0
	 * POST: returns the area
	 */
	public int area(){
		return length * width;
	}
	
	/*Computes the perimeter of a rectangle of length length and width width
	 * PRE: length >= 0 and width >= 0
	 * POST: returns the perimeter
	 */
	public int perimeter(){
		return ((2 * length) + (2 * width));
	}
	
	/* Compares two rectangles and determines if they are the same
	 * PRE: 2 rectangles with length >= 0 and width >= 0
	 * POST: true if same length and width, false if different
	 */
	public boolean equals(Rectangle r) {
		if(length == r.getLength() && width == r.getWidth()){
			return true;
		}else{
			return false;
		}
	}
	
	/*Returns a String that represents the Rectangle
	 * PRE: NONE
	 * POST: A string representing the rectangle is returned
	 */
	public String toString() {
		String rectangleString;
		rectangleString = "Rectangle has length " + length + " and width " + width;
		return (rectangleString);
	}
	
}
