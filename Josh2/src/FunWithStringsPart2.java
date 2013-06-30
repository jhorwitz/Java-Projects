
public class FunWithStringsPart2 {

	public static void main(String[] args) {
		String test = "a";
		String test2, test3;
		
		test2 = "a";
		test3 = test;
		
		if(test2.equals(test3)){
			System.out.println("These are not the same");
			System.out.println("test 2 = " + test2 + " and test 3 = " + test3);
		}
		if(test.equals(test2)){
			System.out.println("These are really different!");
			System.out.println("test 2 = " + test2 + " and test 1 = " + test);
		}
		if(test.equals(test3)){
			System.out.println("Silly - these are not the same!");
			System.out.println("Test 1 = " + test + " and test 3 = " + test3);
		}

	}

}
