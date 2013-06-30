
public class House {

	/*
	 * Draws a roof for the house
	 * PRE: NONE
	 * POST: NONE
	 */
	public static void addRoof(){
		System.out.println("   /\\");
		System.out.println("  /  \\");
		System.out.println(" /    \\");
		System.out.println("/______\\");
	}
	
	/*
	 * Draws a base for the house
	 * PRE: NONE
	 * POST: NONE
	 */
	public static void addBase(){
		System.out.println(":      :");
		System.out.println(":      :");
		System.out.println(":      :");
		System.out.println(":______:");
	}
	
	/*
	 * Draws a walk for the house
	 * PRE: NONE
	 * POST: NONE
	 */
	public static void addWalk(){
		System.out.println("   ** ");
		System.out.println("   **********");
	}
	public static void main(String[] args) {
		addRoof();
		addBase();
		addWalk();
	}

}
