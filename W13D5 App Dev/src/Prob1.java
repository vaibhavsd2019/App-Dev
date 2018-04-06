//@author Vaibhav Mehandiratta
// 06/04/2018  v1.0
public class Prob1 {


	static int min;
	
	public static void main(String[] args) {
		int container[] = {0,6,6,3,1,5,-8,-9,-2,6,};	
		
		
		System.out.println("Smallest are: = " + small(container, container.length));
		
	}

	private static int small(int numbers[], int size) {
			
			if(size-1<=0) return min;
			
			if (numbers[size-1] < min)   
				min = numbers[size-1];   
		
		return small(numbers, --size);
		
				
	}
}