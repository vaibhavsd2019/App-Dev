//@author Vaibhav Copyright
import java.text.NumberFormat;

	public class NumberFormat {
		
		public static void main(String[] args) {
			NumberFormat money = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			
			double initialValue, total, interestRate;
			
			initialValue = 1500;
			interestRate = .20;
			
			total = initialValue + initialValue*interestRate;
			
			System.out.println(money.format(total));
		}
	}
