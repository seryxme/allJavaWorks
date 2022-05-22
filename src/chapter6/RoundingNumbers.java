package chapter6;

import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String... args) {

        Scanner numberReader = new Scanner(System.in);

        System.out.println("Enter a floating point number or 0 to exit: ");
        double x = numberReader.nextDouble();

        System.out.println("Original Number\t\tRoundedNumber");

        while (x != 0) {
            double y = Math.floor(x + 0.5);
            System.out.printf("%.3f\t\t\t\t%.1f%n", x, y);

            x = numberReader.nextDouble();
        }

    }
}
