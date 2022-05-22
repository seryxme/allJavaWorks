package chapter4;//Exercise 4.38a

import java.util.Scanner;

public class FactorialA {
    public static void main(String[] args) {

        Scanner integerReader = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = integerReader.nextInt();

        int num = number;
        int factorial = 1;

        while(number > 0) {
            factorial = factorial * number;
            number--;
        }
        System.out.printf("The value of %d! is %d", num, factorial);
    }
}
