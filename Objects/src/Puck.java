
public class Puck extends Disk {
	
	private double weight;
	private boolean standard, youth;
	
	/*
	 * Constructor
	 * PRE: None
	 * POST: A puck object has been created with radius r, thickness t, and weight w
	 */
	public Puck(double r, double t, double w){
		super(r, t);
		weight = w;
	}
	
	/*
	 * returns the weight of the puck
	 * PRE: None
	 * POST: weight has been returned
	 */
	public double getWeight(){
		return weight;
	}
	
	/*
	 * Determines the division of the puck
	 * PRE: None
	 * POST: returns a string
	 */
	public String getDivision(){
		if(weight >= 5 && weight <= 5.5){
			standard = true;
			youth = false;
		}else{
			standard = false;
			youth = true;
		}
		if(standard == true){
			return ("Standard");
		}else{
			return ("Youth");
		}
	}
	
	/*
	 * Determines if the object is equal to another
	 * Disk object
	 * PRE: d is a Disk object
	 * POST: true has been returned if objects have the same radii and thickness. False has been returned otherwise.
	 */
	public boolean equals(Object p){
		Puck testObj = (Puck)p;
		
		if(testObj.getRadius() == super.getRadius() && testObj.getThickness() == super.getThickness() && testObj.getWeight() == weight){
			return true;
		}else{
			return false;
		}
	}
	
	/*
	 * Returns a String that represents the Puck object
	 * PRE: NONE
	 * POST: A String representing the Puck object has been returned
	 */
	public String toString(){
		return ("The puck has radius " + super.getRadius() + " and thickness " + super.getThickness() + " and in the " + getDivision() + " division.");
	}


}
