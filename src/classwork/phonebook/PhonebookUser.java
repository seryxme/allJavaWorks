package classwork.phonebook;

import java.util.ArrayList;
import java.util.Objects;

public class PhonebookUser {
    private final String userName;
    private String password;
    private final Phonebook phonebook;

    public PhonebookUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
        phonebook = new Phonebook();
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String newPassword) {
        password = newPassword;
    }

    public boolean checkPassword(String password) {
        return Objects.equals(this.password, password);
    }

    public Phonebook getPhonebook() {
        return phonebook;
    }

    public void addContact(Contact contact) {
        phonebook.addContact(contact);
    }

    public void importContactList(ArrayList<Contact> contactList) {
        for (Contact contact:contactList) {
            phonebook.addContact(contact);
        }
    }

    public Contact getContact(String info) {
        return phonebook.getContact(info);
    }

    public void deleteContact(Contact contact) {
        phonebook.removeContact(contact);
    }

    public Contact[] getAllContact() {
        return  phonebook.getPhonebook();
    }

    public ArrayList<Contact> searchContacts(String characters) {
        int charLength = characters.length();
        ArrayList<Contact> foundContacts = new ArrayList<>();

        for(Contact contact: phonebook.getPhonebook()) {
            for (int i = 0; i < charLength; i++) {
                if(contact.getFirstName().toLowerCase().charAt(i) == characters.toLowerCase().charAt(i) ||
                        contact.getLastName().toLowerCase().charAt(i) == characters.toLowerCase().charAt(i)) {
                    if(!foundContacts.contains(contact)) {
                        foundContacts.add(contact);
                    }
                }
            }
        }

        if (foundContacts.isEmpty()) throw new ContactNotFoundException();

        return foundContacts;
    }
}
