package chapter3;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
               account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance...%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        double depositAmount2 = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance...%n%n", depositAmount2);
        account2.deposit(depositAmount2);

        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        System.out.print("Enter withdrawal amount for account1: ");
        double withdrawalAmount = input.nextDouble();
        System.out.printf("%nsubtracting $%.2f from account1 balance...%n%n", withdrawalAmount);
        account1.withdraw(withdrawalAmount);

        System.out.print("Enter withdrawal amount for account2: ");
        double withdrawalAmount2 = input.nextDouble();
        System.out.printf("%nsubtracting $%.2f from account2 balance...%n%n", withdrawalAmount2);
        account2.withdraw(withdrawalAmount2);

    }
}
