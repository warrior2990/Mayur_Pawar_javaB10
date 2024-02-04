package Array4;

public class ReverseArray {
    public static void main(String[] args) {
    	
    	int [] arr = {1,2,3,4,5};
    	
    	ReverseArray obj = new ReverseArray();
    	obj.reverseArray(arr);

}
    
    
    void reverseArray(int [] arr) {
    	
    	int[] arr2 = new int [arr.length];
    	int j=0;
    	
    	for(int i = arr.length-1; i>=0; i--) {
    		int val = arr[i];
    		arr2[j] = val;
    		j++;
    	}
    	
    	for (int i : arr2) {
    		
    		System.out.println(i);
			
		}
    	}
     
}