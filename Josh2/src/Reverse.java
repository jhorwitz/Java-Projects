
public class Reverse {

	public static void main(String[] args) {
		int[] num = new int[10];
		
		for(int i = 1; i <= 10; i++){
			num[i - 1] = (i - 1);
		}
		
		System.out.println("Countdown");
		
		for(int i = 9; i >= 0; i--){
			System.out.println(num[i]);
		}
	}

}
