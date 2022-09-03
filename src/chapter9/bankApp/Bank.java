package chapter9.bankApp;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private String branch;
    private int customerCount;
    private int accountCount;
    private ArrayList<Customer> customers;
    private ArrayList<Account> accounts;


    public Bank(String bankName, String branch) {
        this.bankName = bankName;
        this.branch = branch;
        customers = new ArrayList<>();
        accounts = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void addCustomer(Customer customer) {
        customers.add(customerCount, customer);

        customerCount++;
    }

    public Customer viewCustomer(int index) {
        return customers.get(index);
    }

    public void addAccount(Account account) {
        accounts.add(accountCount, account);

        accountCount++;
    }

    public Account viewAccount(int index) {
        return accounts.get(index);
    }

    public int numberOfAccounts() {
        return accounts.size();
    }

    public int numberOfCustomers() {
        return customers.size();
    }

    public void closeAccount(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i) == account) {
                accounts.remove(account);
                customers.get(i).closeAccount(account);
                Customer customer = customers.get(i);
                customers.remove(i);
            }
        }
        accountCount--;
        customerCount--;

    }
}
