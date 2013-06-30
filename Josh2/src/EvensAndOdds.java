import java.util.ArrayList;
public class EvensAndOdds {

	public static void main(String[] args) {
		ArrayList<Integer> odds = new ArrayList<Integer>();
		ArrayList<Integer> evens = new ArrayList<Integer>();
		int num;
		
		for(int i = 0; i < 25; i++){
			num = (int)(100*Math.random());
			if(num % 2 == 0){
				evens.add(num);
			}else{
				odds.add(num);
			}
		}
		
		System.out.println("ODD:");
		for(int i = 0; i < odds.size(); i++){
			System.out.print(odds.get(i) + " ");
		}
		System.out.println("\nEVEN:");
		for(int i = 0; i < evens.size(); i++){
			System.out.print(evens.get(i) + " ");
		}
		
		

	}

}
