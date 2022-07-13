package classwork.phonebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhonebookTest {
    Phonebook phonebook;
    Contact contact1;
    Contact contact2;
    Contact contact3;

    @BeforeEach
    void setUp() {
        phonebook = new Phonebook();
        contact1 = new Contact("Tunde", "Tunampa", "08123456789");
        contact2 = new Contact("Yinka", "Ade", "09123498765");
        contact3 = new Contact("Ugo", "Chukwu", "08012345678");
    }

    @Test
    void phonebookIsEmpty() {
        assertTrue(phonebook.isEmpty());
    }

    @Test
    void contactCanBeAddedToPhonebook() {
        phonebook.addContact(contact1);
        assertNotNull(phonebook.getContact(0));
    }

    @Test
    void contactInformationCanBeRetrievedFromPhonebook() {
        phonebook.addContact(contact1);
        assertEquals("Tunde", phonebook.getContact(0).getFirstName());

        assertEquals("Tunampa", phonebook.getContact(0).getLastName());

        assertEquals("08123456789", phonebook.getContact(0).getPhoneNumber());
    }

    @Test
    void contactCanBeDeletedFromPhonebook() {
        phonebook.addContact(contact1);
        phonebook.removeContact(contact1);
        assertTrue(phonebook.isEmpty());
    }

    @Test
    void multipleContactsCanBeAddedToPhonebook_sizeIncreases() {
        phonebook.addContact(contact1);
        phonebook.addContact(contact2);
        phonebook.addContact(contact3);
        assertEquals(3, phonebook.size());
    }

    @Test
    void sizeDecreasesAfterContactIsDeletedFromPhonebook() {
        phonebook.addContact(contact1);
        phonebook.addContact(contact2);
        phonebook.addContact(contact3);

        phonebook.removeContact(contact2);
        assertEquals(2, phonebook.size());
    }

    @Test
    void contactInformationCanBeRetrievedFromPhonebookUsingName() {
        phonebook.addContact(contact1);
        phonebook.addContact(contact2);
        phonebook.addContact(contact3);

        assertEquals("09123498765", phonebook.getContactNumber("Yinka"));

        assertEquals("08123456789", phonebook.getContactNumber("Tunampa"));
    }

    @Test
    void contactInformationCanBeRetrievedFromPhonebookUsingNumber() {
        phonebook.addContact(contact1);
        phonebook.addContact(contact2);
        phonebook.addContact(contact3);

        assertEquals("Yinka Ade", phonebook.getContactName("09123498765"));

        assertEquals("Tunde Tunampa", phonebook.getContactName("08123456789"));
    }

    @Test
    void contactExistsInPhonebook() {
        phonebook.addContact(contact1);
        phonebook.addContact(contact2);
        phonebook.addContact(contact3);

        assertTrue(phonebook.search("Yinka"));
        assertTrue(phonebook.search("08012345678"));
    }

    @Test
    void contactDoesNotExistInPhonebook() {
        phonebook.addContact(contact1);
        phonebook.addContact(contact2);
        phonebook.addContact(contact3);

        assertFalse(phonebook.search("Tayo"));
        assertFalse(phonebook.search("08029298823"));
    }

    @Test
    void phonebookListCanBeRetrieved() {
        phonebook.addContact(contact1);
        phonebook.addContact(contact2);
        phonebook.addContact(contact3);

        Contact[] contactsList = {contact1, contact2, contact3};

        assertArrayEquals(contactsList, phonebook.getPhonebook());
    }

    @Test
    void contactDetailsCanBeUpdated() {
        phonebook.addContact(contact1);

        phonebook.getContact(0).setEmail("me@mymail.com");
        assertEquals("me@mymail.com", phonebook.getContact(0).getEmail());

        phonebook.getContact(0).setAddress("45, Oluyele Street, Palmgrove, Somolu, Lagos");
        assertEquals("45, Oluyele Street, Palmgrove, Somolu, Lagos", phonebook.getContact(0).getAddress());

        System.out.println(contact1);
    }
}
