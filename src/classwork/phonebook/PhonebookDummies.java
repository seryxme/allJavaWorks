package classwork.phonebook;

import java.util.ArrayList;

public class PhonebookDummies {

    public static ArrayList<Contact> dummyContacts = new ArrayList<>();
    public static ArrayList<PhonebookUser> dummyUsers = new ArrayList<>();

    ArrayList<ArrayList<Contact>> allUserContacts = new ArrayList<>();
    public static ArrayList<Contact> dummyUser1Contacts= new ArrayList<>();
    public static ArrayList<Contact> dummyUser2Contacts= new ArrayList<>();
    public static ArrayList<Contact> dummyUser3Contacts= new ArrayList<>();


    private static Contact contact1 = new Contact("Ayoola", "Popoola","08123456789");
    private static Contact contact2 = new Contact("Junior", "Effiong", "09123456789");
    private static Contact contact3 = new Contact("Joy", "Ikechukwu", "07123456789");
    private static Contact contact4 = new Contact("Ayomide", "Adeoti", "08012345678");
    private static Contact contact5 = new Contact("Hassan", "Rilwan", "09012345678");
    private static Contact contact6 = new Contact("Tunde", "Tunampa", "08123456789");

    private static Contact contact7 = new Contact("Yinka", "Ade", "09123498765");
    private static Contact contact8 = new Contact("Ugo", "Chukwu", "08012378678");
    private static Contact contact9 = new Contact("Bala", "Musa", "08012455678");
    private static Contact contact10 = new Contact("Bola", "Tinubu", "08012345601");
    private static Contact contact11 = new Contact("Peter", "Obi", "08066345678");
    private static Contact contact12 = new Contact("Atiku", "Abubakar", "08012654678");

    private static PhonebookUser user1 = new PhonebookUser("aypop", "popping2");
    private static PhonebookUser user2 = new PhonebookUser("jayfly", "firefly219");
    private static PhonebookUser user3 = new PhonebookUser("iamjoy", "livinwild425");

    public void addDummies() {
        dummyUsers.add(user1);
        dummyUsers.add(user2);
        dummyUsers.add(user3);

        dummyUser1Contacts.add(contact1);
        dummyUser1Contacts.add(contact3);
        dummyUser1Contacts.add(contact5);
        dummyUser1Contacts.add(contact9);

        dummyUser2Contacts.add(contact4);
        dummyUser2Contacts.add(contact8);
        dummyUser2Contacts.add(contact7);
        dummyUser2Contacts.add(contact10);
        dummyUser2Contacts.add(contact11);

        dummyUser3Contacts.add(contact2);
        dummyUser3Contacts.add(contact6);
        dummyUser3Contacts.add(contact12);

        allUserContacts.add(dummyUser1Contacts);
        allUserContacts.add(dummyUser2Contacts);
        allUserContacts.add(dummyUser3Contacts);

    }

    public ArrayList<PhonebookUser> getDummyUsers() {
        return dummyUsers;
    }

    public ArrayList<Contact> getDummyContacts() {
        return dummyContacts;
    }
}
