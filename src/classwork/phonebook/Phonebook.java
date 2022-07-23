package classwork.phonebook;

import java.util.ArrayList;

public class Phonebook {
    private final ArrayList<Contact> contacts;

    public Phonebook() {
        contacts = new ArrayList<>();
    }

    public Contact getContact(int index) {
        return contacts.get(index);
    }

    public Contact getContact(String info) {
        for(Contact contact: contacts) {
            if (contact.getFirstName().equalsIgnoreCase(info) ||
                    (contact.getLastName().equalsIgnoreCase(info)) ||
                    (contact.getPhoneNumber().equalsIgnoreCase(info))) {
                return contact;
            }
        }
        return null;
    }

    public ArrayList<Contact> getPhonebook() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public boolean isEmpty() {
        return contacts.isEmpty();
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public int size() {
        return contacts.size();
    }

    public String getContactNumber(String name) {
        return getContact(name).getPhoneNumber();
    }

    public String getContactName(String number) {
        return String.format("%s %s", getContact(number).getFirstName(), getContact(number).getLastName());
    }

    public boolean search(String info) {
        return getContact(info) != null;
    }
}
