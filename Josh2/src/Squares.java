
public class Squares {

	public static void main(String[] args) {
		int[] square = new int[5];
		
		for(int i = 1; i <= 5; i++){
			square[i - 1] = (i - 1)*(i - 1);
		}
		
		System.out.print("The elements in the array are: ");
		
		for(int i = 0; i <= 4; i++){
			System.out.print(square[i] + " ");
		}
		
	}

}
