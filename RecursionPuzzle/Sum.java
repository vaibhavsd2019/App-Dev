// Recursion Puzzle Solution 1
//@author Vaibhav Mehandiratta
// 04/04/2018  v1.0

package RecursionPuzzle;

import java.util.*;
public class Sum
{
	//For calculating sum of n natural numbers.
    public int sumNum(int n)
    {
        if(n==0)
            return 0;
        else
            return n+ sumNum(n-1);
    }

//Main Method
    public static void main(String args[])
    {
    	//Scanner class for reading the input
        Scanner keyboard =new Scanner(System.in);
        System.out.println("Input a value: - ");
        int num = keyboard.nextInt();
        Sum obj = new Sum();
        int sum = obj.sumNum(num);
        System.out.println("The sum of numbers is "+sum);
        keyboard.close(); 
    }
}
