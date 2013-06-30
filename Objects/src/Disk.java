/**
 *Disk Class
 */
public class Disk extends Circle {
	private double thickness;
	
	/*
	 * Constructor
	 * PRE: NONE
	 * POST: A disk object has been created with radius r and thickness t
	 */
	public Disk(double r, double t){
		super(r);
		thickness = t;
	}
	
	/*
	 * Changes the thickness of the disk
	 * PRE: NONE
	 * POST: Thickness has been changed
	 */
	public void setThickness(double newThickness){
		thickness = newThickness;
	}
	
	/*
	 * Returns the thickness of the disk
	 * PRE: NONE
	 * POST: The thickness of the disk is returned
	 */
	public double getThickness(){
		return thickness;
	}
	
	/*
	 * Returns the volume of the disk
	 * PRE: NONE
	 * POST: The volume of the disk has been returned
	 */
	public double volume(){
		return (super.area() * thickness);
	}
	
	/*
	 * Determines if the object is equal to another
	 * Disk object
	 * PRE: d is a Disk object
	 * POST: true has been returned if objects have the same radii and thickness. False has been returned otherwise.
	 */
	public boolean equals(Object d){
		Disk testObj = (Disk)d;
		
		if(testObj.getRadius() == super.getRadius() && testObj.getThickness() == thickness){
			return true;
		}else{
			return false;
		}
	}
	
	/*
	 * Returns a String that represents the Disk object
	 * PRE: NONE
	 * POST: A String representing the Disk object has been returned
	 */
	public String toString(){
		return ("The disk has radius " + super.getRadius() + " and thickness " + thickness + ".");
	}

}
