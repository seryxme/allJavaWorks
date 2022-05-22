package chapter5;//Exercise 5.11

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {

        Scanner integerReader = new Scanner(System.in);

        System.out.println("Enter 10 different numbers: ");

        int maximumNumber = 0;
        int minimumNumber = 1000000;

        for(int c = 1;c <= 10; c++) {
            int number = integerReader.nextInt();
            if (number > maximumNumber) {
                maximumNumber = number;
            }
            else if (number < minimumNumber) {
                minimumNumber = number;
            }
        }
        int sumOfExtremes = maximumNumber + minimumNumber;
        System.out.println("The sum of the maximum and minimum numbers is "+sumOfExtremes);
    }
}
