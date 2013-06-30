
public class RectangleRunner {

	public static void main(String[] args) {
		Rectangle one = new Rectangle();
		Rectangle two = new Rectangle(8, 4);
		
		System.out.println("The area of rectangle one is: " + one.area());
		System.out.println("The area of rectangle two is: " + two.area());
		System.out.println("The perimeter of rectangle one is: " + one.perimeter());
		System.out.println("The perimeter of rectangle two is: " + two.perimeter());
		
		one.setLength(2);
		one.setWidth(3);
		
		System.out.println("The new length of rectangle one is: " + one.getLength());
		System.out.println("The new width of rectangle one is: " + one.getWidth());
		
		System.out.println(one.toString());
		System.out.println(two.toString());
		

	}

}
