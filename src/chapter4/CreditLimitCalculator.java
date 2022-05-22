package chapter4;//Exercise 4.18

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        Scanner cardReader = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int accountNumber = cardReader.nextInt();

        System.out.println("Enter balance at the beginning of the month: ");
        int beginningBalance = cardReader.nextInt();

        System.out.println("Enter total of items charged to account this month: ");
        int totalItemsCharged = cardReader.nextInt();

        System.out.println("Enter total credit applied to account this month: ");
        int accountCredits = cardReader.nextInt();

        System.out.println("Enter allowed credit limit: ");
        int creditLimit = cardReader.nextInt();

        int newBalance = beginningBalance + totalItemsCharged - accountCredits;

        if (newBalance < creditLimit) {
            System.out.println("The balance in account "+ accountNumber +" is $"+ newBalance);
        }
        else System.out.println("Credit limit exceeded.");
    }
}
