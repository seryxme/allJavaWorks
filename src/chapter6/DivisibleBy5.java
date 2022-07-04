package chapter6;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner numberReader = new Scanner(System.in);

        int count = 0;
        while (count < 10) {
            System.out.println("Enter an integer: ");
            int number = numberReader.nextInt();

            System.out.println(divisibleBy5(number));
            count++;
        }
    }

    public static boolean divisibleBy5(int number) {
        if (number % 5 == 0) {
            return true;
        }
        else return false;
    }
}
