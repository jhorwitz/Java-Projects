
import java.util.Scanner;
import java.text.NumberFormat;

public class PercentPassing extends NumbersSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double score, passing = 0, count = -1, percent;
		NumberFormat decimal = NumberFormat.getNumberInstance();
		
		decimal.setMaximumFractionDigits(2);
		decimal.setMinimumFractionDigits(2);
		
		System.out.println("Enter a set of scores as percentages (Enter -1 to quit): ");
		
		do{
			score = in.nextDouble();
			count++;
			if(score > 70)
				passing++;
			
			
		}while(score >= 0);
		
		percent = 100*(passing/count);
		System.out.println("The percent of passing scores that were passing was: " + decimal.format(percent) + "%");
		

	}

}
