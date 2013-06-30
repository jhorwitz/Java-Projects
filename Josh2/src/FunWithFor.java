public class FunWithFor {

	public static void main(String[] args) {
		int fuck = 5;
		int you = 1;
		
		for(int i = fuck; i > 0; i--){
			System.out.println("fuck = " + fuck);
			for(int j = you; j < 4; j++){
				you += i;
				System.out.println("you = " + you);
			}
			you = 1;
			fuck--;
		}

	}

}
