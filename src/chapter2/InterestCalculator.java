package chapter2;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g. 3 for 3%): ");
        double balance = calc.nextDouble();
        double annualInterestRate = calc.nextDouble();

        double interest = balance * annualInterestRate / 1200;

        System.out.printf("The interest is %.5f", interest);
    }
}
