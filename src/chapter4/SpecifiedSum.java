package chapter4;//Exercise 4.34

import java.util.Scanner;

public class SpecifiedSum {
    public static void main(String[] args) {

        Scanner integerReader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userSum = integerReader.nextInt();

        System.out.println("Enter a lesser number than your first number: ");
        int userNumber = integerReader.nextInt();

        int currentSum = 0;
        while (currentSum < userSum) {
            System.out.println("Enter a lesser number than your first number: ");
            userNumber = integerReader.nextInt();

            currentSum += userNumber;
        }
        System.out.println("Total now equal to or higher than initial number.");
    }

}
