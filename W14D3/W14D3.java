package W14D3;

public class W14D3 {

	public static void main(String[] args) {

		int units = 30;
		int billpay;
		int runits = units - 400;
		int metercost = 5;
		if(units <= 400) {
			billpay = units*metercost;
			System.out.println(billpay);
		}
		else if (units > 400) {
			int rt = runits * 7; 
			billpay = rt + 2000;
			System.out.println(billpay);
		}
		else {
			System.out.println("Bill cannot be displayed");
		}
	}
}
