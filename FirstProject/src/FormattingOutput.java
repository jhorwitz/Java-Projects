
import java.text.NumberFormat;

public class FormattingOutput {

	public static void main(String[] args) {
		
		double dollars = 21.5;
		int num = 1234;
		double num_with_decimal = 2.0/3.0;
		double sale = .15;
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat number = NumberFormat.getIntegerInstance();
		NumberFormat decimal = NumberFormat.getNumberInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		decimal.setMaximumFractionDigits(2);
		
		System.out.println(money.format(dollars));
		System.out.println(number.format(num));
		System.out.println(decimal.format(num_with_decimal));
		System.out.println(percent.format(sale));
		
	}
}
