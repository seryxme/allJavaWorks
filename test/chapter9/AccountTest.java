package chapter9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {
    Account account;

    @BeforeEach
    void setUp() {
        account = new Account(1, "My Account", "1234");
    }

    @Test
    public void accountCanBeCreatedTest() {

        assertEquals(1, account.getAccountNumber());

        assertEquals("My Account", account.getAccountName());
    }

    @Test
    public void accountCanBeDepositedIntoTest() {

        account.deposit(5000);

        assertEquals(5000, account.getBalance("1234"));
    }

    @Test
    public void accountCanBeWithdrawnFromTest() {

        account.deposit(5000);

        account.withdraw(2000, "1234");

        assertEquals(3000, account.getBalance("1234"));
    }

    @Test
    public void wrongPinNoWithdrawalTest() {

        account.deposit(5000);

        account.withdraw(2000, "1414");

        assertEquals(5000, account.getBalance("1414"));
    }

    @Test
    public void checkBalanceWithCorrectAndWrongPinTest() {

        account.deposit(5000);

        account.withdraw(2000, "1234");

        assertEquals(3000, account.getBalance("1234"));

        assertEquals(0, account.getBalance("1414"));
    }
}