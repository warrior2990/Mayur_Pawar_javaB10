package Array4;

public class ReverseInSameArray {
    public static void main(String[] args) {
    	
    	int [] arr = {1,2,3,4,5};
    	
    	ReverseInSameArray obj = new ReverseInSameArray();
    	obj.reverseArray(arr);

}

    void reverseArray(int [] arr) {
    	int val2 = arr.length-1;
    	
 	
    	for(int i = 0; i <= (arr.length-1)/2; i++) {
    		int val = arr[i];
    		arr[i] = arr[val2];
    		arr[val2] = val;
    		val2--;
    	}
    	
    	for (int i : arr) {
    		
    		System.out.println(i);
			
		}
    	}
     
}