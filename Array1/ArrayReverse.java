package Array1;

public class ArrayReverse {
	
	public static void main(String[] args) {
		
		int[] arr = {20,30,80,100,50,10,60,01,40,90};
		
		ArrayReverse obj = new ArrayReverse();
		obj.findMaxAndMinElement(arr);
		
		
	} 
	
	void findMaxAndMinElement(int[] arr) {
		
		int minVal=arr[0];
		int maxVal=arr[0];
		
		for(int i=0; i<arr.length; i++) {

			int val = arr[i];
			if(val < minVal) {
				
				minVal = val;
			}
			if(val > maxVal) {
				
				maxVal = val;
			}
			System.out.println(arr[i]);
		}
		
		System.out.println("Minimum Number is:"+minVal);
		System.out.println("Maximum Number is:"+maxVal);
		
	}

	
	void ArrayAlt(int[] arr) {
		
    for(int i=arr.length-1; i >= 0; i--) {
			
			System.out.println(arr[i]);
		}
		
		System.out.println("Alternat Numbers");
		
		for(int i=0; i < arr.length; i=i+2) {
			
			System.out.println(arr[i]);
			
		}
	}
}
