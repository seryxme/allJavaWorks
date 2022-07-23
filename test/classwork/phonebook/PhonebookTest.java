package classwork.phonebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhonebookTest {
    PhonebookUser user1;
    Contact contact1;
    Contact contact2;
    Contact contact3;

    @BeforeEach
    void setUp() {
        user1 = new PhonebookUser("seryx", "twitty2");
        contact1 = new Contact("Tunde", "Tunampa", "08123456789");
        contact2 = new Contact("Yinka", "Ade", "09123498765");
        contact3 = new Contact("Ugo", "Chukwu", "08012345678");
    }

    @Test
    void userCanLogIn() {
        assertEquals("seryx", user1.getUserName());
        assertTrue(user1.checkPassword("twitty2"));
    }


    @Test
    void userHasAPhonebook_phonebookIsEmpty() {
        assertTrue(user1.getPhonebook().isEmpty());
    }

    @Test
    void userCanAddContactToPhonebook() {
        user1.addContact(contact1);
        assertNotNull(user1.getPhonebook().getContact(0));
    }

    @Test
    void userCanRetrieveContactInformationFromPhonebook() {
        user1.addContact(contact1);
        assertEquals("Tunde", user1.getPhonebook().getContact(0).getFirstName());

        assertEquals("Tunampa", user1.getPhonebook().getContact(0).getLastName());

        assertEquals("08123456789", user1.getPhonebook().getContact(0).getPhoneNumber());
    }

    @Test
    void userCanDeleteContactFromPhonebook() {
        user1.addContact(contact1);
        user1.deleteContact(contact1);
        assertTrue(user1.getPhonebook().isEmpty());
    }

    @Test
    void userCanAddMultipleContactsToPhonebook_sizeIncreases() {
        user1.addContact(contact1);
        user1.addContact(contact2);
        user1.addContact(contact3);
        assertEquals(3, user1.getPhonebook().size());
    }

    @Test
    void sizeDecreasesAfterUserDeletesContactFromPhonebook() {
        user1.addContact(contact1);
        user1.addContact(contact2);
        user1.addContact(contact3);

        user1.deleteContact(contact2);
        assertEquals(2, user1.getPhonebook().size());
    }

    @Test
    void contactInformationCanBeRetrievedFromPhonebookUsingName() {
        user1.addContact(contact1);
        user1.addContact(contact2);
        user1.addContact(contact3);

        assertEquals("09123498765", user1.getPhonebook().getContactNumber("Yinka"));

        assertEquals("08123456789", user1.getPhonebook().getContactNumber("Tunampa"));
    }

    @Test
    void contactInformationCanBeRetrievedFromPhonebookUsingNumber() {
        user1.addContact(contact1);
        user1.addContact(contact2);
        user1.addContact(contact3);

        assertEquals("Yinka Ade", user1.getPhonebook().getContactName("09123498765"));

        assertEquals("Tunde Tunampa", user1.getPhonebook().getContactName("08123456789"));
    }

    @Test
    void userCanConfirmContactExistsInPhonebook() {
        user1.addContact(contact1);
        user1.addContact(contact2);
        user1.addContact(contact3);

        assertTrue(user1.search("Yinka"));
        assertTrue(user1.search("08012345678"));
    }

    @Test
    void userCanConfirmContactDoesNotExistInPhonebook() {
        user1.addContact(contact1);
        user1.addContact(contact2);
        user1.addContact(contact3);

        assertFalse(user1.search("Tayo"));
        assertFalse(user1.search("08029298823"));
    }

    @Test
    void phonebookListCanBeRetrieved() {
        user1.addContact(contact1);
        user1.addContact(contact2);
        user1.addContact(contact3);

        Contact[] contactsList = {contact1, contact2, contact3};
        Contact[] contactsList2 = user1.getAllContact().toArray(new Contact[0]);

        assertArrayEquals(contactsList, contactsList2);
    }

    @Test
    void userCanUpdateContactDetails() {
        user1.addContact(contact1);

        user1.getContact("Tunde").setEmail("me@mymail.com");
        assertEquals("me@mymail.com", user1.getContact("Tunde").getEmail());

        user1.getContact("Tunde").setAddress("45, Oluyele Street, Palmgrove, Somolu, Lagos");
        assertEquals("me@mymail.com", user1.getContact("Tunde").getEmail());
        assertEquals("45, Oluyele Street, Palmgrove, Somolu, Lagos", user1.getContact("Tunde").getAddress());

        System.out.println(contact1);
    }
}
