
public class FunWithMath {

	public static void main(String[] args) {
		
		int x = 5, y = 7, sum;
		
		System.out.println("X = " + x);
		System.out.println("y / x = " + (y/x));
		System.out.println("y % x = " + (y%x));
		
		x%=y;
		
		System.out.println("x+=y " + x);

	}

}
