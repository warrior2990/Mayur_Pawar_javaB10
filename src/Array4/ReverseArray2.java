package Array4;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] sourceArray = {1, 22, 32, 42, 52};
        int[] destinationArray = new int[sourceArray.length];
        int j = 0;

        // Copy elements using a for loop
        for (int i = sourceArray.length-1; i >= 0; i--) {
        	int val = sourceArray[i];
        	destinationArray[j] = val;
        	j++;
        	
            //destinationArray[i] = sourceArray[i];
        }

        // Display the arrays
        System.out.print("Source Array: ");
        displayArray(sourceArray);

        System.out.print("Reverse Array: ");
        displayArray(destinationArray);
    }

    private static void displayArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

