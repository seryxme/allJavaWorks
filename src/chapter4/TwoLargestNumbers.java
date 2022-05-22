package chapter4;//Exercise 4.23
/*
Initialize the counter.
Initialize the largest number.
Initialize the second-largest number.
While counter is less than 10.
    Enter a number but do not repeat numbers.
    If number is greater than the largest number,
        save the largest number as the second-largest number,
        save the new number as the largest number.
    If number is less than the largest number and larger than the second-largest number,
        save the new number as the second-largest number.
    Increment counter.
Print the largest number.
 */

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner numberReader = new Scanner(System.in);

        int counter = 0;
        int largestNum = 0;
        int secondLargestNum = 0;

        while (counter < 10) {
            System.out.println("Enter any number (do not repeat numbers): ");
            int number = numberReader.nextInt();

            if (number > largestNum) {
                secondLargestNum = largestNum;
                largestNum = number;
            }
            if (number < largestNum) {
                if(number > secondLargestNum) secondLargestNum = number;
            }

            counter += 1;
        }
        System.out.println("The largest number is "+ largestNum + " and the second largest number is "+ secondLargestNum);
    }

}
