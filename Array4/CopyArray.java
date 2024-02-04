package Array4;

public class CopyArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(arr.toString());
		CopyArray obj = new CopyArray();
		int[] arr2 = obj.copyArray(arr);
		
		for (int i : arr2) {
			System.out.println(i);
		}

	}
	
	int[] copyArray(int[] arr) {
		 
		int[] arr2 = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			int val = arr [i];
			arr2[i] = val;
		}
		
		return arr2;
	}

}
