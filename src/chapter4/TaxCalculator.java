package chapter4;//Exercise 4.20

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner earningReader = new Scanner(System.in);

        int entryCounter = 1;

        while (entryCounter <= 3) {
            System.out.println("Enter annual income for citizen: ");
            double citizenIncome = earningReader.nextInt();
            if (citizenIncome <= 30000) {
                double annualTax = citizenIncome * 0.15;
                System.out.println("The annual tax is $" + annualTax);
            }
            if (citizenIncome > 30000) {
                double annualTax = citizenIncome * 0.2;
                System.out.println("The annual tax is $" + annualTax);
            }
            entryCounter += 1;
        }
    }
}
