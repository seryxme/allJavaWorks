package chapter4;//Exercise 4.38c

import java.util.Scanner;

public class FactorialC {
    public static void main(String[] args) {

        Scanner integerReader = new Scanner(System.in);

        System.out.println("Enter number of terms: ");
        int numberOfTerms = integerReader.nextInt();

        System.out.println("Enter value for x: ");
        int x = integerReader.nextInt();

        double e = 1;
        double factorial = 1;
        int c = 1;

        while(c <= numberOfTerms) {
            factorial = factorial * c;
            double y = Math.pow(x, c);
            e = e + (y/factorial);
            c++;
        }
        System.out.printf("The value of e^%d is %f.", x, e);
    }
}
