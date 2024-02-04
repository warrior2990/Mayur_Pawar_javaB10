package Array2;

public class ForEach {
	
	public static void main(String[] args) {
		 int [] arr = new int[3];
		 
		 arr[0] = 1;
		 arr[1] = 10;
		 arr[2] = 20;
		 
		 System.out.println("Array Iteration Using For Loop");
		 
		 for(int i=0; i<arr.length; i++) {
			 
			 System.out.println(arr[i]);
		 }
		 
		 System.out.println("Array Iteration Using ForEach Loop");
		 
		 for (int i : arr) {
			 System.out.println(i);	
		}
	}

}
