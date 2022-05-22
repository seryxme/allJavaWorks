package classwork;

public class ArraySum {
    public static void main(String[] args) {

        int[] newArray = {10, 20, 33, 6, 7};
        int sum = 0;
        double average;
        int maximum = newArray[0];
        int minimum = newArray[0];

        for (int j : newArray) {
            sum += j;
        }
        System.out.println("Sum of items in the array is: "+ sum);

        average = (double) sum / newArray.length;
        System.out.println("Average of items in the array is: "+ average);

        for (int j : newArray) {
            if (j > maximum) {
                maximum = j;
            }
            if (j < minimum) {
                minimum = j;
            }
        }
        System.out.printf("Minimum of items in the array is: %d%nMaximum of items in the array is: %d%n", minimum, maximum);
        int[] nextArray = {100, 23, 54, 88, 27, 19, 45, 48};

        for (int i = 0; i < nextArray.length; i++) {
            int randomIndex = (int) (Math.random() * 10);
            try {
                System.out.printf("The index at %d is %d.%n", randomIndex, nextArray[randomIndex]);
            } catch (ArrayIndexOutOfBoundsException newError) {
                System.out.println("\tInvalid index.");
            }
        }
    }
}