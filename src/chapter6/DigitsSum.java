package chapter6;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner numberReader = new Scanner(System.in);

        System.out.println("Enter a four digit number: ");
        int number = numberReader.nextInt();

        int sum = sumOfDigits(number);

        System.out.printf("The sum of the digits of %d is = %d", number, sum);
    }


    public static int sumOfDigits(int fourDigitNumber) {
        int lastDigit = fourDigitNumber % 10;
        int thirdDigit = ((fourDigitNumber % 100) - lastDigit)/10;
        int secondDigit = ((((fourDigitNumber % 1000) - lastDigit)/10) - thirdDigit)/10;
        int firstDigit = ((((((fourDigitNumber % 10000) - lastDigit)/10) - thirdDigit)/10) - secondDigit)/10;

        return (firstDigit + secondDigit + thirdDigit + lastDigit);
    }

}
