package classwork.phonebook;

import java.util.Scanner;

public class PhonebookApp {
    private static final Phonebook phonebook = new Phonebook();
    private static final Scanner dataReader = new Scanner(System.in);

    public static void main(String[] args) {
        appMenu();

    }

    private static void appMenu() {
        System.out.println("""
                
                Welcome to your Phone Directory App.
                1. Add Contact
                2. Check Contact
                3. Delete Contact
                4. Edit Contact
                5. Show All Contacts
                6. Exit
                """);
    int option = dataReader.nextInt();
    dataReader.nextLine();

    switch (option) {
        case 1 -> addContact();
        case 2 -> displayContact();
        case 3 -> deleteContact();
        case 4 -> editContact();
        case 5 -> displayAllContacts();
        case 6 -> System.exit(0);
        default -> {
            System.out.println("Invalid selection. Please, try again.");
            appMenu();
        }
    }

    }

    private static void addContact() {
        System.out.print("Enter the first name: ");
        String firstName = dataReader.nextLine();

        System.out.print("Enter the last name: ");
        String lastName = dataReader.nextLine();

        System.out.print("Enter the phone number: ");
        String phoneNumber = dataReader.nextLine();

        Contact newContact = new Contact(firstName, lastName, phoneNumber);

        phonebook.addContact(newContact);

        System.out.println("""
                
                Contact successfully added.
                Would you like to add more details?
                1. Yes
                2. No
                """);
        int option = dataReader.nextInt();
        dataReader.nextLine();

        if (option == 1) editNewContact(newContact);
        else appMenu();
    }

    private static void displayContact() {
        System.out.println("\nEnter the contact's first name, last name or phone number:");
        String detail = dataReader.nextLine();

        Contact foundContact = phonebook.getContact(detail);

        if(foundContact == null) System.out.println("Contact does not exist in your directory");
        else System.out.println(foundContact);

        System.out.println("""
                
                Would you like to check another contact?
                1. Yes
                2. No
                """);
        int option = dataReader.nextInt();
        dataReader.nextLine();

        if (option == 1) displayContact();
        else appMenu();
    }

    private static void deleteContact() {
        System.out.println("\nEnter the contact's first name, last name or phone number:");
        String detail = dataReader.nextLine();

        Contact foundContact = phonebook.getContact(detail);

        if(foundContact == null) System.out.println("Contact does not exist in your directory");
        else {
            System.out.printf("""
                    Are you sure you want to delete %s?
                    1. Yes
                    2. No
                    """, detail);
            int option = dataReader.nextInt();
            dataReader.nextLine();

            if (option == 1) phonebook.removeContact(foundContact);
            else {
                System.out.println("""
                
                Would you like to delete another contact?
                1. Yes
                2. No
                """);
                option = dataReader.nextInt();
                dataReader.nextLine();

                if (option == 1) deleteContact();
                else appMenu();
            }
        }
    }

    private static void editNewContact(Contact contact) {
        System.out.print("\nEnter email address: ");
        String email = dataReader.nextLine();
        contact.setEmail(email);

        System.out.print("Enter home address: ");
        String address = dataReader.nextLine();
        contact.setAddress(address);

        System.out.println("Contact details have been updated. Press enter to go back to the main menu.");
        dataReader.nextLine();

        appMenu();
    }

    private static void editContact() {
        System.out.println("\nEnter the contact's first name, last name or phone number:");
        String detail = dataReader.nextLine();

        Contact foundContact = phonebook.getContact(detail);

        System.out.println("""
                                
                What would you like to edit?
                1. First Name
                2. Last Name
                3. Phone Number
                4. Email
                5. Address
                6. Back
                """);
        int option = dataReader.nextInt();
        dataReader.nextLine();

        switch (option) {
            case 1 -> {
                System.out.print("Enter the new first name: ");
                String newFirstName = dataReader.nextLine();
                foundContact.setFirstName(newFirstName);

                System.out.println("Contact details have been updated. Press enter to go back to the menu.");
                dataReader.nextLine();

                editContact();
            }
            case 2 -> {
                System.out.print("Enter the new last name: ");
                String newLastName = dataReader.nextLine();
                foundContact.setFirstName(newLastName);

                System.out.println("Contact details have been updated. Press enter to go back to the menu.");
                dataReader.nextLine();

                editContact();
            }
            case 3 -> {
                System.out.print("Enter the new phone number: ");
                String newPhoneNum = dataReader.nextLine();
                foundContact.setFirstName(newPhoneNum);

                System.out.println("Contact details have been updated. Press enter to go back to the menu.");
                dataReader.nextLine();

                editContact();
            }
            case 4 -> {
                System.out.print("Enter the new email address: ");
                String newEmail = dataReader.nextLine();
                foundContact.setFirstName(newEmail);

                System.out.println("Contact details have been updated. Press enter to go back to the menu.");
                dataReader.nextLine();

                editContact();
            }
            case 5 -> {
                System.out.print("Enter the new home address: ");
                String newAddress = dataReader.nextLine();
                foundContact.setFirstName(newAddress);

                System.out.println("Contact details have been updated. Press enter to go back to the menu.");
                dataReader.nextLine();

                editContact();
            }
            case 6 -> appMenu();
            default -> {
                System.out.println("Invalid selection. Please, try again.");
                editContact();
            }
        }
    }

    private static void displayAllContacts() {
        System.out.println("------------------------------");
        System.out.println("**** ALL CONTACTS ****");
        System.out.println("------------------------------");
            for (Contact contact: phonebook.getPhonebook()) {
                System.out.println(contact);
                System.out.println("------------------------------");
            }

            System.out.println("Press enter to go back to the menu.");
            dataReader.nextLine();

            appMenu();

    }


}