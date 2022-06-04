package chapter9;

public class Account {
    private String name;
    private int number;
    private int balance;
    private String pin;

    public Account(int number, String name, String pin) {
        this.number = number;
        this.name = name;
        this.pin = pin;
    }

    public int getAccountNumber() {
        return number;
    }

    public String getAccountName() {
        return name;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance(String pin) {
        int mainBalance;

        if(this.pin.equals(pin)) {
            mainBalance = balance;
        } else mainBalance = 0;
        return mainBalance;
    }

    public void withdraw(int amount, String pin) {
        if(this.pin.equals(pin)) {
            balance -= amount;
        }
    }
}
