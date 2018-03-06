//@author Vaibhav Mehandiratta
// v1.0 06-03-2018 Error Term Computation
// using Addition and Subtraction Method
package ErroTerm;

import java.util.Scanner;

public class Addition {																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.println("Enter the first Value");
double operandvalue1 = input.nextDouble();

System.out.println("Enter the first Error Term");
double operanderror1 =input.nextDouble();

System.out.println("Enter the second Value");
double operandvalue2 = input.nextDouble();

System.out.println("Enter the second Errot Term");
double operanderror2 = input.nextDouble();

double operandvaluefinal_add = operandvalue1 + operandvalue2;
double operanderrorfinal_add = operanderror1 + operanderror2;

double operandvaluefinal_sub = operandvalue1 - operandvalue2;
double operanderrorfinal_sub = operanderror1 + operanderror2;

System.out.println("Enter Add or Sub");

String a = input.next();

if(a.equals("Add"))
		{

	System.out.println("Result: " + operandvaluefinal_add + " ± " + operanderrorfinal_add );
		}
	else if(a.equals("Sub"))
	{

 
		System.out.println("Result: " + operandvaluefinal_sub + " ± " + operanderrorfinal_sub);	
	}
	else {
		System.out.println("Enter Add or Sub for the Result");
	}
input.close();

}
}

