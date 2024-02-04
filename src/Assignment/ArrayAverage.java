package Assignment;

public class ArrayAverage {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};


        double average = calculateAverage(numbers);


        System.out.println("Average of the array elements: " + average);
    }


    private static double calculateAverage(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        double average = (double) sum / arr.length;

        return average;
    }
}

