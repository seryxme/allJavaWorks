package chapter2;

import java.util.Scanner;

public class Question30 {

    public static void main(String[] args) {

        Scanner digit = new Scanner(System.in);

        System.out.println("Enter a 5 digit number: ");
        int fullNumber = digit.nextInt();

        int lastDigit = fullNumber % 10;
        int fourthDigit = ((fullNumber % 100) - lastDigit) / 10;
        int thirdDigit = (((fullNumber % 1000) - fourthDigit * 10) - lastDigit)/100;
        int secondDigit = ((((fullNumber % 10000) - thirdDigit * 100) - fourthDigit * 10) - lastDigit)/1000;
        int firstDigit = (((((fullNumber % 100000) - secondDigit * 1000) - thirdDigit * 100) - fourthDigit * 10) - lastDigit)/10000;

        System.out.printf("%d\t%d\t%d\t%d\t%d", firstDigit, secondDigit, thirdDigit, fourthDigit, lastDigit);
    }

}
