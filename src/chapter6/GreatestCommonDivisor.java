package chapter6;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        Scanner numberReader = new Scanner(System.in);
        System.out.println("Enter two numbers to find their greatest common divisor: ");
        int number1 = numberReader.nextInt();
        int number2 = numberReader.nextInt();

        int gcd = gcd(number1, number2);

        System.out.printf("The greatest common divisor for %d and %d is %d.", number1, number2, gcd);

    }

    public static int gcd(int number1, int number2) {
        int factor = 1;
        int gcd = 0;
        while(factor <= number1) {
            if(number1 % factor == 0) {
                if(number2 % factor == 0) {
                    if (factor > gcd) {
                        gcd = factor;
                    }
                }
            }
            factor++;
        }
        return gcd;
    }
}
