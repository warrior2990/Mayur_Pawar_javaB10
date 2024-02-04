package Array4;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] sourceArray = {1, 22, 32, 42, 52};
        int[] destinationArray = new int[sourceArray.length];

        // Copy elements using a for loop
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }

        // Display the arrays
        System.out.print("Source Array: ");
        displayArray(sourceArray);

        System.out.print("Copied Array: ");
        displayArray(destinationArray);
    }

    private static void displayArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

