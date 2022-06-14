package chapter9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    Bank bank1;
    Bank bank2;
    Customer customer1;
    Customer customer2;
    Customer customer3;
    Account account1;
    Account account2;
    Account account3;

    @BeforeEach
    void setUp() {
        bank1 = new Bank("Seryx Bank", "Yaba");
        bank2 = new Bank("TopNotch Bank", "Ikeja");

        customer1 = new Customer(bank1,1, "John", "Henry", "08012345678");
        customer2 = new Customer(bank2,2, "Nancy", "Drew", "08087654321");
        customer3 = new Customer(bank1, 2, "Asisat", "Oshoala", "08087654321");

        account1 = new Account("00000100001","4321", customer1);
        account2 = new Account("00000200002","2222", customer2);
        account3 = new Account("10000100123","1234", customer3);

        bank1.addCustomer(customer1);
        bank2.addCustomer(customer2);
        bank1.addCustomer(customer3);

        bank1.addAccount(account1);
        bank2.addAccount(account2);
        bank1.addAccount(account3);

        customer1.setMyAccount(account1);
        customer2.setMyAccount(account2);
        customer3.setMyAccount(account3);

        customer1.getMyAccount().deposit(50000);
        customer2.getMyAccount().deposit(10000);
        customer3.getMyAccount().deposit(70000);
    }

    @Test
    void bankCanBeCreatedTest() {

        assertNotNull(bank1);
        assertNotNull(bank2);

    }

    @Test
    void bankDetailsCanBeSetTest() {

        bank1.setBankName("New Bank");

        assertEquals("New Bank", bank1.getBankName());

        bank1.setBranch("Iponri");

        assertEquals("Iponri", bank1.getBranch());

    }

    @Test
    void customersCanBeAddedTest() {

        assertEquals("John Henry", bank1.viewCustomer(0).getMyAccount().getAccountName());

        assertEquals("Nancy Drew", bank2.viewCustomer(0).getMyAccount().getAccountName());

        assertEquals("Asisat Oshoala", bank1.viewCustomer(1).getMyAccount().getAccountName());

    }

    @Test
    void accountsCanBeAddedTest() {

        assertEquals("00000100001", bank1.viewAccount(0).getAccountNumber());

        assertEquals("00000200002", bank2.viewAccount(0).getAccountNumber());

        assertEquals("10000100123", bank1.viewAccount(1).getAccountNumber());

    }

    @Test
    void accountsCanBeClosedTest() {

        assertEquals(2, bank1.numberOfAccounts());

        assertEquals(2, bank1.numberOfCustomers());

        bank1.closeAccount(account3);

        assertNull(account3.getAccountName());

        assertEquals(1, bank1.numberOfAccounts());

        assertEquals(1, bank1.numberOfCustomers());
    }

    @Test
    void customerCanMakeTransfersTest() {

        bank1.viewCustomer(0).getMyAccount().transfer(20000, bank1.viewCustomer(1).getMyAccount(), "4321");

        assertEquals(30000, account1.getBalance("4321"));

        assertEquals(90000, account3.getBalance("1234"));

        bank1.viewCustomer(1).getMyAccount().transfer(30000, bank2.viewCustomer(0).getMyAccount(), "1234");

        assertEquals(60000, account3.getBalance("1234"));

        assertEquals(40000, account2.getBalance("2222"));

    }



}