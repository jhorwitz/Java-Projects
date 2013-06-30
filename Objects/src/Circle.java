
public class Circle {
	
	//Variables
	private static final double PI = 3.14; //Class variable ("static" tells you it's a class variable. True for all circles)
	private double radius; //Instance variable

	/*Constructor
	 * Sets the initial value of radius = 1
	 */
	public Circle() {
		radius = 1;
	}
	
	/*Constructor
	 * Sets the initial value of radius = 1
	 */
	public Circle(double r) {
		radius = r;
	}
	
	/*area computes the area of a circle of radius radius
	 * PRE: radius >= 0
	 * POST: returns the area
	 */
	public double area() {
		return PI * radius * radius;
	}
	
	/*This method will change the radius of the circle
	 * PRE: Double >= 0
	 * POST: NONE
	 */
	public void setRadius(double r){
		radius = r;
	}
	
	/*This method will return the radius
	 * PRE: NONE
	 * POST: return the radius as a double
	 */
	public double getRadius() {
		return radius;
	}
	
	/*This method calculates the circumference of a circle
	 * PRE: radius >= 0
	 * POST: returns the circumference as a double
	 */
	public double circumference() {
		return (2*PI*radius);
	}
	
	/* Compares two circles and determines if they are the same
	 * PRE: 2 circles with radius >= 0
	 * POST: true if same radii, false if different
	 */
	public boolean equals(Circle c){
		
		if(radius == c.getRadius()){
			return true;
		}else{
			return false;
		}
	}
	
	/*Returns a String that represents the Circle
	 * PRE: NONE
	 * POST: A string representing the circle is returned
	 */
	public String toString() {
		String circleString;
		circleString = "Circle has radius " + radius;
		return (circleString);
	}
	
}
