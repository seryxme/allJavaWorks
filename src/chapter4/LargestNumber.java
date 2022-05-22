package chapter4;//Exercise 4.21
/*
Initialize the counter.
Initialize the largest number.
While counter is less than 10.
    Enter number.
    If number is greater than the largest number,
        save it as the largest number,
    Increment counter.
Print the largest number.
 */

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner numberReader = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int number = numberReader.nextInt();

        int counter = 0;
        int largestNum = number;

        while (counter < 10) {
            System.out.println("Enter any number: ");
            number = numberReader.nextInt();

            if (number > largestNum) largestNum = number;

            counter += 1;
        }
        System.out.println("The largest number is "+ largestNum);
    }
}
