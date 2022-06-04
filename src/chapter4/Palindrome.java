package chapter4;//Exercise 4.31

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner digitReader = new Scanner(System.in);

        System.out.println("Enter a 5 digit number: ");
        int firstNumber = digitReader.nextInt();

        while (firstNumber < 10000 || firstNumber > 99999) {
            System.out.println("This is not a 5 digit number.");
            System.out.println("Enter a 5 digit number: ");
            firstNumber = digitReader.nextInt();
        }

        int lastDigit = firstNumber % 10;
        int fourthDigit = ((firstNumber % 100) - lastDigit) / 10;
        int thirdDigit = (((firstNumber % 1000) - fourthDigit * 10) - lastDigit)/100;
        int secondDigit = ((((firstNumber % 10000) - thirdDigit * 100) - fourthDigit * 10) - lastDigit)/1000;
        int firstDigit = (((((firstNumber % 100000) - secondDigit * 1000) - thirdDigit * 100) - fourthDigit * 10) - lastDigit)/10000;

        int secondNumber = lastDigit * 10000 + fourthDigit * 1000 + thirdDigit * 100 + secondDigit * 10 + firstDigit;

        if (secondNumber == firstNumber) {
            System.out.println(firstNumber + " is a palindrome.");
        }
        else System.out.println(firstNumber + " is not a palindrome.");
    }

}
