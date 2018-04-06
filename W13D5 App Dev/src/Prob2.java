//@author Vaibhav Mehandiratta
// 06/04/2018  v1.0
public class Prob2 {
	static int sum;
	public static void main(String[] args) {
		int data[] = {1,6,2,38,25,3,46,99,61,70};	
		
		System.out.println("Sum of the Given Array = " + sum(data, data.length));
		
	}
	private static int sum(int numbers[], int s) {

		if(s-1< 0) return sum; 
		
		sum+=numbers[s-1];
					
		return sum(numbers, --s);			
	}
}

