package chapter3;

import java.util.Scanner;

public class AccountTest2 {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        //System.out.printf("%s balance: $%.2f%n",
        //        account1.getName(), account1.getBalance());
        //System.out.printf("%s balance: $%.2f%n",
        //        account2.getName(), account2.getBalance());

        displayAccount(account1, account2);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        //System.out.printf("%s balance: $%.2f%n",
        //        account1.getName(), account1.getBalance());
        //System.out.printf("%s balance: $%.2f%n",
        //        account2.getName(), account2.getBalance());

        displayAccount(account1, account2);

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        //System.out.printf("%s balance: $%.2f%n",
        //        account1.getName(), account1.getBalance());
        //System.out.printf("%s balance: $%.2f%n",
        //        account2.getName(), account2.getBalance());

        displayAccount(account1, account2);
    }
    public static void displayAccount (Account account1, Account account2) {
        String name = account1.getName();
        double balance = account1.getBalance();
        String name1 = account2.getName();
        double balance1 = account2.getBalance();
        System.out.printf("%s balance: $%.2f%n", name, balance);
        System.out.printf("%s balance: $%.2f%n", name1, balance1);
    }
}
