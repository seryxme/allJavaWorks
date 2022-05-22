package chapter5;//Exercise 5.16

import java.util.Scanner;

public class BarChartPrinter {
    public static void main(String[] args) {

        Scanner numberReader = new Scanner(System.in);

        System.out.println("Enter five numbers between 1 and 30: ");
        int firstNumber = numberReader.nextInt();
        int secondNumber = numberReader.nextInt();
        int thirdNumber = numberReader.nextInt();
        int fourthNumber = numberReader.nextInt();
        int fifthNumber = numberReader.nextInt();

        for (int i = 0;i < firstNumber;) {
            i++;
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0;i < secondNumber;) {
            i++;
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0;i < thirdNumber;) {
            i++;
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0;i < fourthNumber;) {
            i++;
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0;i < fifthNumber;) {
            i++;
            System.out.print("*");
        }
        System.out.println();
    }
}
