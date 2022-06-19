package chapter9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account;
    Account account2;
    Customer customer1;
    Customer customer2;
    Bank bank1;

    @BeforeEach
    void setUp() {
        customer1 = new Customer(bank1,1, "John", "Henry", "08012345678");
        customer2 = new Customer(bank1,2, "Nancy", "Drew", "08087654321");

        account = new Account("00000000001","1234", customer1);
        account2 = new Account("00000000002","1515", customer2);

        bank1 = new Bank("Seryx Bank", "Yaba");

        customer1.setMyAccount(account);
        customer2.setMyAccount(account2);

        account.deposit(5000);
    }

    @Test
    public void accountCanBeCreatedTest() {

        assertNotNull(account);

    }

    @Test
    public void accountConstructorIsFunctionalTest() {

        assertEquals("00000000001", account.getAccountNumber());

        assertEquals("John Henry", account.getAccountName());
    }

    @Test
    public void accountDetailsCanBeEditedTest() {

        account.setAccountName("John Newton Henry");

        assertEquals("John Newton Henry", account.getAccountName());
    }

    @Test
    public void accountCanBeDepositedIntoTest() {

        assertEquals(5000, account.getBalance("1234"));
    }

    @Test
    public void accountCanBeWithdrawnFromTest() {

        account.withdraw(2000, "1234");

        assertEquals(3000, account.getBalance("1234"));
    }

    @Test
    public void wrongPinNoWithdrawalTest() {

        account.withdraw(2000, "1414");

        assertEquals(0, account.getBalance("1414"));
    }

    @Test
    public void checkBalanceWithCorrectPinTest() {

        account.withdraw(2000, "1234");

        assertEquals(3000, account.getBalance("1234"));
    }

    @Test
    public void checkBalanceWithWrongPinTest() {

        account.withdraw(2000, "1234");

        assertEquals(0, account.getBalance("1414"));
    }

    @Test
    public void pinCanChangeTest() {

        account.setPin("1414");

        assertEquals(5000, account.getBalance("1414"));
    }

    @Test
    public void accountCanTransferTest() {

        account.transfer(2000, account2, "1234");

        assertEquals(3000, account.getBalance("1234"));

        assertEquals(2000, account2.getBalance("1515"));

    }

    @Test
    @DisplayName("Restrict negative deposits test")
    public void negativeDepositTest() {

        account.deposit(-5000);

        assertEquals(5000, account.getBalance("1234"));
    }

    @Test
    @DisplayName("Testing over-withdrawal from an account.")
    public void excessWithdrawalFromAccountTest() {
        account.withdraw(50000, "1234");

        assertEquals(5000, account.getBalance("1234"));
    }
    @Test
    @DisplayName("Testing negative withdrawal from an account.")
    public void withdrawalFromAccountTest3() {
        account.withdraw(-2000, "1234");

        assertEquals(5000, account.getBalance("1234"));
    }
}