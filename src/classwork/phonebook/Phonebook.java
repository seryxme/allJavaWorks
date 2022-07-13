package classwork.phonebook;

import java.util.ArrayList;
import java.util.Objects;

public class Phonebook {
    private ArrayList<Contact> contacts;

    public Phonebook() {
        contacts = new ArrayList<Contact>();
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

    public Contact[] getPhonebook() {
        Contact[] contactArray = new Contact[size()];

        for (int i = 0; i < size(); i++) {
            contactArray[i] = getContact(i);
        }
        return contactArray;
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
        return getContactInfo(name);
    }

    private String getContactInfo(String info) {
        String detail = null;
        for(Contact contact: contacts) {
            if (contact.getFirstName().equalsIgnoreCase(info) ||
                    (contact.getLastName().equalsIgnoreCase(info))) {
                detail = contact.getPhoneNumber();
            }
            else if (contact.getPhoneNumber().equalsIgnoreCase(info)) {
                detail = String.format("%s %s", contact.getFirstName(), contact.getLastName());
            }
        }
        return detail;
    }

    public String getContactName(String number) {
        return getContactInfo(number);
    }

    public boolean search(String info) {
        for(Contact contact: contacts) {
            if (Objects.equals(contact.getFirstName(), info) ||
                    (Objects.equals(contact.getLastName(), info))||
                    (Objects.equals(contact.getPhoneNumber(), info))) {
                return true;
            }
        }
        return false;
    }
}
