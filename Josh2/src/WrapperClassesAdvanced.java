import java.util.ArrayList;


public class WrapperClassesAdvanced {

	public static void main(String[] args) {
		System.out.println("This is WrapperClasses");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int element, element1, element2, sum = 0;
		
		numbers.add(4);
		numbers.add(8);
		
		element1 = numbers.get(0);
		element2 = numbers.get(1);
		
		if(element1 == element2){
			System.out.println("The elements have the same value.");
		}else if(element1 < element2){
			System.out.println("element1 is less than element2.");
		}else{
			System.out.println("element2 is less than element1.");
		}
		
		for(Integer num: numbers){
			element = num;
			sum += element;
		}
		System.out.println("The sum is: " + sum);
		

	}

}