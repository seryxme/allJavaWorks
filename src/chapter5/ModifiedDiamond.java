package chapter5;//Exercise 5.25

import java.util.Scanner;

public class ModifiedDiamond {
    public static void main(String[] args) {

        Scanner oddNumberReader = new Scanner(System.in);

        System.out.println("Enter an odd number from 1 to 19: ");
        int n = oddNumberReader.nextInt();
        while (n < 1 || n > 19) {
            System.out.println("Number not within range. Try again.");
            System.out.println("Enter an odd number from 1 to 19: ");
            n = oddNumberReader.nextInt();
        }
        while (n % 2 == 0) {
            System.out.println("This is not an odd number. Try again.");
            System.out.println("Enter an odd number from 1 to 19: ");
            n = oddNumberReader.nextInt();
        }


        for(int c = 1;c < n;c++) {
            for (int i = c; i <= n; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i < c; i++) {
                System.out.print("*");
            }
            for (int i = 1; i <= c; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int c = 1;c <= n;c++) {
            for (int i = 1; i <= c; i++) {
                System.out.print(" ");
            }
            for (int i = c; i < n; i++) {
                System.out.print("*");
            }
            for (int i = c; i <= n; i++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
