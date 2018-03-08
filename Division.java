//Error Term computation for Multiplication and Division

//@author Vaibhav Mehandiratta

// version 1.2     08-03-2018        
package Divison;
import java.util.Scanner;
public class Division {
		public static void main(String[] args) {
			// Variables to be used in this program
			double  product, quotient,errorTerm1,errorTerm2, upperbound1, lowerbound1,upperbound2,lowerbound2,Range,Mean,product1,quotient1;
			double measureValue1,measureValue2,a,b,productvalue1_errorfraction, productvalue2_errorfraction, quotientvalue1_errorfraction, quotientvalue2_errorfraction;
			String operator;
			Scanner keyboard = new Scanner(System.in);    //Scanner class for reading the input    
			System.out.println("Input measured value1: ");  // Input the first Operand
			measureValue1= keyboard.nextDouble();
			System.out.println();                    
			System.out.println("Input error value1: ");      //Input the error term for first operand
			errorTerm1= keyboard.nextDouble();
			System.out.println();
			System.out.println("Value 1:   "+measureValue1+ "\u00B1 "+errorTerm1);   
			System.out.println();
			System.out.println("Input measured value 2: ");  //Input the second operand
			measureValue2= keyboard.nextDouble();
			System.out.println();
			System.out.println("Input error value 2: ");  //Input the error term for second operand
			errorTerm2= keyboard.nextDouble();
			System.out.println();
			System.out.println("Value 2:   "+measureValue2+ "\u00B1 "+errorTerm2);
			System.out.println();
			System.out.println("Input the operator for performing operation: +,-,*,/");      //Input the operator on which you would like to perform operation             
	        operator=keyboard.next();
	         if(operator.equals("+"))                     // Addition operation for the given input
	         {
			upperbound1= measureValue1+errorTerm1;
			lowerbound1= measureValue1-errorTerm1;
		    upperbound2= measureValue2+errorTerm2;
			lowerbound2= measureValue2-errorTerm2;
			a=upperbound1+upperbound2;
			b= lowerbound1+lowerbound2;
			Range=(a+b)/2;
			Mean=(a-b)/2;
			System.out.println("The result addition is "+Range+" \u00B1 "+Mean);
	         }
	         else   if(operator.equals("-"))           //Subtraction operation for the given input           
	         {
			upperbound1= measureValue1+errorTerm1;
			lowerbound1= measureValue1-errorTerm1;
			upperbound2= measureValue2+errorTerm2;
			lowerbound2= measureValue2-errorTerm2;
			a=upperbound1-upperbound2;
			b= lowerbound1-lowerbound2;
			Range=(a+b)/2;
			Mean=(a-b)/2;
			System.out.println("The result subtraction is "+Range+" \u00B1 "+Mean);
	         }
	         else   if(operator.equals("*"))         //Multiplication operation for the given input 
	         {
	        productvalue1_errorfraction = errorTerm1/measureValue1;
	        productvalue2_errorfraction = errorTerm2/measureValue2;
	        product1=measureValue1*measureValue2 ;
	        product= Math.abs(((productvalue1_errorfraction + productvalue2_errorfraction)*(product1)));
	        System.out.println("The product of the the value are "+product1+" \u00B1 "+product);	 
			
	         }
	         else   if(operator.equals("/"))        //Division operation for the given input
	         {
	        quotientvalue1_errorfraction = errorTerm1/measureValue1;
	        quotientvalue2_errorfraction = errorTerm2/measureValue2;
	        quotient1=measureValue1/measureValue2 ;
	        quotient= Math.abs(((quotientvalue1_errorfraction + quotientvalue2_errorfraction)*(quotient1)));
	        System.out.println("The quotient of the the value are "+quotient1+" \u00B1 "+ quotient);	
	         }
	         else {
	        	 System.out.println("You have typed wrong input");
	         }
		keyboard.close();
		}		
	}