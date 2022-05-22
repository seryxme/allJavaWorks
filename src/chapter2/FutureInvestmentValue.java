package chapter2;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner invest = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        double investmentAmount = invest.nextFloat();

        System.out.println("Enter annual interest rate in percentage: ");
        double annualInterestRate = invest.nextFloat();

        System.out.println("Enter number of years: ");
        double numberOfYears = invest.nextFloat();

        double futureInvestmentValue = investmentAmount * Math.pow((1 + annualInterestRate/1200), (numberOfYears * 12));

        System.out.printf("Accumulated value is %f", futureInvestmentValue);
    }
}
