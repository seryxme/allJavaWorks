package chapter9.bankApp;

import java.util.Objects;

public class Account {
    private String accountName;
    private final String accountNumber;
    private int balance;
    private String pin;
    private final Customer customer;
    private final Bank mainBank;

    public Account(String number, String pin, Customer customer) {
        mainBank = customer.getMyBank();
        accountNumber = number;
        this.pin = pin;
        this.customer = customer;
        setAccountName();
    }

    public String bankInfo() {
        return customer.myBankInfo();
    }

    public void setAccountName() {
        accountName = String.format("%s %s", customer.getFirstName(), customer.getLastName());
    }
    void setAccountName(String name) {
        accountName = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else System.out.println("Invalid amount.");

    }

    public int getBalance(String pin) {
        int mainBalance;

        if(Objects.equals(pin, this.pin)) {
            mainBalance = balance;
        }
        else {
            System.out.println("Wrong PIN. Try again.");
            mainBalance = 0;
        }

        return mainBalance;
    }

    public void withdraw(int amount, String pin) {
        if(this.pin.equals(pin)) {
            if (amount < 0) {
                System.out.println("Invalid amount.");
            }
            if (amount > 0) {
                if (amount <= balance) {
                    balance = balance - amount;
                } else System.out.println("Balance exceeded.");
            }
        }
    }

    public void transfer(int amount, Account account, String pin) {
        this.withdraw(amount, pin);
        account.deposit(amount);
    }

    @Override
    public String toString() {
        return String.format("Bank: %s%nAccount Name: %s%nAccount No.: %s",
                bankInfo(), accountName, accountNumber);
    }
}
