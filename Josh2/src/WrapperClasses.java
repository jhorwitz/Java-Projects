import java.util.ArrayList;

public class WrapperClasses {

	public static void main(String[] args) {
		System.out.println("This is WrapperClasses");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Integer element, element1, element2;
		int sum = 0;
		
		numbers.add(new Integer(4));
		numbers.add(new Integer(8));
		
		element1 = numbers.get(0);
		element2 = numbers.get(1);
		
		if(element1.compareTo(element2) == 0){
			System.out.println("The elements have the same value.");
		}else if(element1.compareTo(element2) < 0){
			System.out.println("element1 is less than element2.");
		}else{
			System.out.println("element2 is less than element1.");
		}
		
		for(Integer num: numbers){
			element = num;
			sum += element.intValue();
		}
		System.out.println("The sum is: " + sum);
		

	}

}
