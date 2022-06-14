package tdd;

public class Account {

    private int balance;

    public int getBalance() {
        return balance;
    }
    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else System.out.println("Invalid amount.");

    }

    public void withdraw(int amount) {
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

