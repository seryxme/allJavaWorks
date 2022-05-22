package chapter2;

import java.util.Scanner;

public class Question32 {
    public static void main(String[] args) {

        Scanner values = new Scanner(System.in);

        int zeros = 0;
        int positiveNumbers = 0;
        int negativeNumbers = 0;

        System.out.println("Enter the first number: ");
        int firstNumber = values.nextInt();
        if (firstNumber < 0) {
            negativeNumbers = negativeNumbers + 1;
        }
        if (firstNumber == 0) {
            zeros = zeros + 1;
        }
        if (firstNumber > 0) {
            positiveNumbers = positiveNumbers + 1;
        }

        System.out.println("Enter the second number: ");
        int secondNumber = values.nextInt();
        if (secondNumber < 0) {
            negativeNumbers = negativeNumbers + 1;
        }
        if (secondNumber == 0) {
            zeros = zeros + 1;
        }
        if (secondNumber > 0) {
            positiveNumbers = positiveNumbers + 1;
        }

        System.out.println("Enter the third number: ");
        int thirdNumber = values.nextInt();
        if (thirdNumber < 0) {
            negativeNumbers = negativeNumbers + 1;
        }
        if (thirdNumber == 0) {
            zeros = zeros + 1;
        }
        if (thirdNumber > 0) {
            positiveNumbers = positiveNumbers + 1;
        }

        System.out.println("Enter the fourth number: ");
        int fourthNumber = values.nextInt();
        if (fourthNumber < 0) {
            negativeNumbers = negativeNumbers + 1;
        }
        if (fourthNumber == 0) {
            zeros = zeros + 1;
        }
        if (fourthNumber > 0) {
            positiveNumbers = positiveNumbers + 1;
        }

        System.out.println("Enter the fifth number: ");
        int fifthNumber = values.nextInt();
        if (fifthNumber < 0) {
            negativeNumbers = negativeNumbers + 1;
        }
        if (fifthNumber == 0) {
            zeros = zeros + 1;
        }
        if (fifthNumber > 0) {
            positiveNumbers = positiveNumbers + 1;
        }

        System.out.printf("The number of zeros is %d, the number of negatives is %d, the number of positives is %d%n", zeros, negativeNumbers, positiveNumbers);




    }
}
