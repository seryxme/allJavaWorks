package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void accountCanBeCreatedTest() {
        Account acct = new Account();

        assertEquals(0, acct.getBalance());

    }

    @Test
    public void depositMoneyTest() {
        Account acct = new Account();

        acct.deposit(15000);

        assertEquals(15000, acct.getBalance());
    }


    @Test
    public void depositMoneyTest2() {
        Account acct1 = new Account();

        acct1.deposit(15000);
        acct1.deposit(5000);

        assertEquals(20000, acct1.getBalance());
    }

    @Test
    @DisplayName("Restrict negative deposits test")
    public void depositNegativeTest3() {
        Account acct2 = new Account();

        acct2.deposit(-5000);

        assertEquals(0, acct2.getBalance());
    }

    @Test
    @DisplayName("Testing withdrawal from an account.")
    public void withdrawalFromAccountTest() {
        Account acct3 = new Account();

        acct3.deposit(45000);
        acct3.withdraw(25000);

        assertEquals(20000, acct3.getBalance());
    }
    @Test
    @DisplayName("Testing over-withdrawal from an account.")
    public void withdrawalFromAccountTest2() {
        Account acct3 = new Account();

        acct3.deposit(45000);
        acct3.withdraw(50000);

        assertEquals(45000, acct3.getBalance());
    }
    @Test
    @DisplayName("Testing negative withdrawal from an account.")
    public void withdrawalFromAccountTest3() {
        Account acct3 = new Account();

        acct3.deposit(45000);
        acct3.withdraw(-2000);

        assertEquals(45000, acct3.getBalance());
    }
}
