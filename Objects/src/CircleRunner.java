
public class CircleRunner {

	public static void main(String[] args) {
		Circle spot = new Circle();
		Circle bob = new Circle();
		
		spot.setRadius(5);
		
		System.out.println("The area of bob is " + bob.area());
		System.out.println("The radius of bob is " + bob.getRadius());
		System.out.println("The area of spot is " + spot.area());
		System.out.println("The circumference of spot is " + spot.circumference());
		
		if(spot.equals(bob)){
			System.out.println("They are the same");
		}else{
			System.out.println("They are different");
		}

	}

}
