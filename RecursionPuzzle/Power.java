// Recursion Puzzle Solution 3
//@author Vaibhav Mehandiratta
// 04/04/2018  v1.0

package RecursionPuzzle;

public class Power {
	public static int recursiveFunction (int a, int n)
	{
	if (n == 0) return 1;
	 // Logic for power of 3
	return (a*recursiveFunction(a,n-1));  
	}

	public static void main(String [] args) {
		
	int actualres;
	int expectedres;
	
	// Test Number 1
	actualres = recursiveFunction(0,0); 
	expectedres = 1; 
	if (actualres == expectedres)
	System.out.println("Test 1 =  Pass; Result = " + actualres);
	else
	System.out.println("Test 1 =  Fail; Result = " + actualres + "; Expected: " + expectedres);

	// Test Number 2
	actualres = recursiveFunction(3,3); 
	expectedres = 27; 
	if (actualres == expectedres)
	System.out.println("Test 2 = Pass; Result = " + actualres);
	else
	System.out.println("Test 2 = Fail; Result = " + actualres + "; Expected: " + expectedres);

	// Test Number 3
	actualres = recursiveFunction(2,3); 
	expectedres = 8; 
	if (actualres == expectedres)
	System.out.println("Test 3 = Pass; Result =  " + actualres);
	else
	System.out.println("Test 3 = Fail; Result = " + actualres + "; Expected: " + expectedres);
	}
}
