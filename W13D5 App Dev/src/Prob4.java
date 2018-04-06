//@author Vaibhav Mehandiratta
// 06/04/2018  v1.0
public class Prob4 {

	static int search;
	
	public static void main(String[] args) {
		int data[] = {56,79,8,83,3,-5,-7,9,3,5};
		
		System.out.println("Number found at index: " + search(data,0, data.length-1, 9));
		
	}

	private static int search(int numbers[], int start, int end, int num) {
		
     int mid = (start+end)/2;   
     
     if (numbers[mid]> num)    
    	 end = mid;               
    	  
     else if(numbers[mid]<num)   
    	 start = mid;                
     
     else if(numbers[mid]==num)                          
    	 return mid;               
    	
     else
        return -1;
		return search(numbers, start, end, num);			
	}
}

