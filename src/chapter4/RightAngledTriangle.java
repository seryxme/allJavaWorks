package chapter4;//Exercise 4.30

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {

        Scanner measurementReader = new Scanner(System.in);

        System.out.println("Enter length of base of triangle (between 1 and 10): ");
        int baseLength = measurementReader.nextInt();

        if (baseLength > 0 && baseLength <= 10) {
            int c = 1;

            while(c <= baseLength) {
                int i = 0;
                while (i < c) {
                    i++;
                    System.out.print("* ");
                }
                System.out.println();
                c++;
            }
            System.out.println();
        }
        else System.out.println("The value entered is not allowed.");



    }
}