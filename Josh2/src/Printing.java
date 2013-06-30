
import java.text.NumberFormat;
import java.util.Scanner;

public class Printing {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num_copies, price, total;
		
		
		System.out.println("Enter the number of copies to be printed: ");
		num_copies = in.nextInt();
		
		in.close();
		
		NumberFormat decimal = NumberFormat.getNumberInstance();
		decimal.setMinimumFractionDigits(2);
		decimal.setMaximumFractionDigits(2);
		
		if(num_copies >= 0 && num_copies <= 99){
			price = 0.30;
		}
		else if(num_copies >= 100 && num_copies <= 499){
			price = 0.28;
		}
		else if(num_copies >= 500 && num_copies <= 749){
			price = 0.27;
		}
		else if(num_copies >= 750 && num_copies <= 1000){
			price = 0.26;
		}
		else{
			price = 0.25;
		}

		System.out.println("The price per copy is: $" + decimal.format(price));
		total = num_copies*price;
		System.out.println("Total cost is: $" + decimal.format(total));

	}

}
