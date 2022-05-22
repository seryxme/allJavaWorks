package classwork;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner numScan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = numScan.nextInt();

        if (number % 2 == 0) {
            System.out.printf("%d is an even number.%n", number);
        }
        if (number % 2 == 1) {
            System.out.printf("%d is an odd number.%n", number);
        }
        //System.out.printf(number % 2 == 0 ? "%d is an even number." : "%d is an odd number.", number, number);
    }
}
