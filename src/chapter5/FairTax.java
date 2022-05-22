package chapter5;//Exercise 5.32

import java.util.Objects;
import java.util.Scanner;

public class FairTax {
    public static void main(String... args) {

        Scanner expenseReader = new Scanner(System.in);

        String expenseCategory;
        double expenseAmount;
        double totalExpenses = 0;

        for(int entry = 1; entry > 0; entry++) {
            System.out.println("Enter your expense category (e.g. housing, health, education,etc.) " +
                    "or 'end': ");
            expenseCategory = expenseReader.nextLine();

            if(Objects.equals(expenseCategory, "end")) {
                break;
            }

            System.out.println("Enter your expense amount: ");
            expenseAmount = expenseReader.nextInt();
            expenseReader.nextLine();

            totalExpenses += expenseAmount;

        }
        double fairTaxEstimate = totalExpenses * 0.23;
        System.out.printf("Your total expenses = N%,.2f%n%nYour estimated FairTax is = N%,.2f",
                totalExpenses, fairTaxEstimate);
    }
}
