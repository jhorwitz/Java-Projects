
import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int category;
		
		System.out.println("Enter the category of a hurricane (1-5 inclusive): ");
		category = in.nextInt();
		
		switch(category){
			case 1:System.out.println("74-95 mph or 62-82 kt or 119-153 km/hr");break;
			case 2:System.out.println("95-110 mph or 83-95 kt or 154-177 km/hr");break;
			case 3:System.out.println("111-130 mph or 96-113 kt or 178-209 km/hr");break;
			case 4:System.out.println("131-155 mph or 114-135 kt or 210-249 km/hr");break;
			case 5:System.out.println("greater than 155 mph or 135 kt or 249 km/hr");break;
		}

	}

}
