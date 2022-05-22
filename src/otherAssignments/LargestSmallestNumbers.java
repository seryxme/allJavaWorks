package otherAssignments;

import java.util.Scanner;

public class LargestSmallestNumbers {
    public static void main(String... args) {

        Scanner numberReader = new Scanner(System.in);

        int largestNum = 0;
        int smallestNum = 1000000000;

        System.out.println("Enter any number or '0' to stop: ");
        int number = numberReader.nextInt();

        while (number != 0) {
            if (number > largestNum) {
                largestNum = number;
            }
            if (number < smallestNum) {
                smallestNum = number;
            }
            number = numberReader.nextInt();
        }
        System.out.printf("The largest number is %d.%n%nThe smallest number is %d.%n", largestNum, smallestNum);
    }
}
