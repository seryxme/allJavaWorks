package chapter2;

import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double savings = calc.nextDouble();

        double monthlyInterestRate = 0.00417;

        double month1 = savings * (1 + monthlyInterestRate);
        double month2 = (savings + month1) * (1 + monthlyInterestRate);
        double month3 = (savings + month2) * (1 + monthlyInterestRate);
        double month4 = (savings + month3) * (1 + monthlyInterestRate);
        double month5 = (savings + month4) * (1 + monthlyInterestRate);
        double month6 = (savings + month5) * (1 + monthlyInterestRate);

        System.out.printf("After the sixth month, the account value is $%.2f", month6);
    }
}
