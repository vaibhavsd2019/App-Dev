//Error Term computation for Square, Square Root & Cube

//@author Vaibhav Mehandiratta

// version 1.3     09-03-2018 

import java.text.DecimalFormat;
import java.util.Scanner;

public class Square {
	public static boolean abc(double n) {
		if (n==0.5) {
			boolean answer = true;
			return answer;
		}
		if (n==2) {
			boolean answer = true;
			return answer;
		}
		if (n==3) {
			boolean answer = true;
			return answer;
		}
		else {
			boolean answer = false;
			return answer;
		}
		

}
	public static String exponentiation(double n, double measuredValue, double errorTerm) {
		if (abc(n)==true) {
		double errorFraction = errorTerm / measuredValue;
		double p = Math.pow(measuredValue, n);
		double powET = Math.abs(p * errorFraction);
		DecimalFormat q = new DecimalFormat("####.##");
		String roundoffed = q.format(powET);
		String roundoffed1 = q.format(p);
		String result = roundoffed1 +" \u00B1 " + roundoffed;
		return result;
		}
		else return "Only 0.5, 2 and 3 is Recognized";
	}

public static void main(String[] args) {		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the Value");
		double value1 = keyboard.nextDouble();
		
		System.out.println("Enter the Error Term");
		double errorTerm1 = keyboard.nextDouble();
			
		System.out.println("Enter 0.5 for Squareroot, 2 for Square and 3 for Cube");

		double n = keyboard.nextDouble();
		String result =exponentiation(n, value1, errorTerm1);	
				System.out.println(result);
			
		keyboard.close();
	}
}
