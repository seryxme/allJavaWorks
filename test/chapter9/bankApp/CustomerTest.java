package chapter9.bankApp;

import chapter9.bankApp.Account;
import chapter9.bankApp.Bank;
import chapter9.bankApp.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Bank bank1;
    Customer customer1;
    Customer customer2;
    Account account1;
    Account account2;
    Account account3;

    @BeforeEach
    void setUp() {
        bank1 = new Bank("Seryx Bank", "Yaba");

        customer1 = new Customer(bank1,1, "John", "Henry", "08012345678");
        customer2 = new Customer(bank1, 2, "Nancy", "Drew", "08087654321");

        account1 = new Account("00000100001","4321", customer1);
        account2 = new Account("00000200002","2222", customer2);
        account3 = new Account("00000100123","1234", customer1);

        customer1.setMyAccount(account1);
        customer2.setMyAccount(account2);
        customer1.setMyAccount(account3);

        customer1.getMyAccount().deposit(50000);
        customer2.getMyAccount().deposit(10000);
    }

    @Test
    public void customerCanBeCreatedTest() {

        assertNotNull(customer1);
        assertNotNull(customer2);

    }

    @Test
    void checkAllDetailsCanBeSet() {
        customer1.setFirstName("Tunde");

        assertEquals("Tunde", customer1.getFirstName());

        customer1.setMiddleName("Mike");

        assertEquals("Mike", customer1.getMiddleName());

        customer1.setLastName("Seriki");

        assertEquals("Seriki", customer1.getLastName());

        customer1.setPhoneNumber("08033334444");

        assertEquals("08033334444", customer1.getPhoneNumber());

        customer1.setEmailAddress("me@mymail.com");

        assertEquals("me@mymail.com", customer1.getEmailAddress());

        customer1.setGender("Male");

        assertEquals("Male", customer1.getGender());

        customer1.setAddress("3, Olowu Street, Onike, Yaba.");

        assertEquals("3, Olowu Street, Onike, Yaba.", customer1.getAddress());

    }

    @Test
    void displayDateOfBirthTest() {
        customer1.setDateOfBirth(5);
        customer1.setMonthOfBirth(3);
        customer1.setYearOfBirth(1992);

        assertEquals("05/03/1992", customer1.displayDateOfBirth());
    }

    @Test
    void accountCanBeAssignedToCustomerTest() {

        assertEquals(account1, customer1.getMyAccount());
    }

    @Test
    void accountNameIsSetTest() {

        assertEquals("John Henry", account1.getAccountName());
    }

    @Test
    void customerCanDepositIntoAccountTest() {

        assertEquals(50000, account1.getBalance("4321"));

        assertEquals(10000, account2.getBalance("2222"));
    }

    @Test
    void customerCanWithdrawFromAccountTest() {
        customer1.getMyAccount().withdraw(10000, "4321");

        assertEquals(40000, account1.getBalance("4321"));
    }

    @Test
    void customerCanChangePinTest() {
        customer2.getMyAccount().setPin("3434");

        assertEquals(10000, account2.getBalance("3434"));
    }

    @Test
    void customerCanMakeTransferTest() {

        customer1.getMyAccount().transfer(20000,customer2.getMyAccount(),"4321");

        assertEquals(30000, account1.getBalance("4321"));

        assertEquals(30000, account2.getBalance("2222"));
    }

    @Test
    void customerCanAddAnotherAccount() {

        assertEquals("John Henry", account3.getAccountName());
    }

    @Test
    void customerCanCloseAccount() {

        customer1.closeAccount(account3);

        assertNull(account3.getAccountName());
    }

    @Test
    void customerCanMakeSelfTransferTest() {

        customer1.getMyAccount().transfer(20000,customer1.getMyAccount(2),"4321");

        assertEquals(30000, account1.getBalance("4321"));

        assertEquals(20000, account3.getBalance("1234"));
    }

}