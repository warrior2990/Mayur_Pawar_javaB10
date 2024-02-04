package Assignment;

public class SumArray {
	
	public static void main(String[] args) {
		
		int[] numbers = {1,1,2,3,4,5,6};
		
		 int sum1 = calculateSum(numbers);

	     System.out.println("Sum of the array elements: " + sum1);
	    }
		
    private static int calculateSum(int[] arr) {
        int sum1 = 0;

        for (int num : arr) {
            sum1 += num;
        }

        return sum1;
    }
}
