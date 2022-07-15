package classwork.phonebook;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class PhonebookApp {
    private static ArrayList<PhonebookUser> userData = new ArrayList<>();
    private static final PhonebookDummies dummyData = new PhonebookDummies();
    private static final Scanner dataReader = new Scanner(System.in);
    private  static int tries = 1;

    public static void main(String[] args) {
        dummyData.addDummies();

        userData = dummyData.getDummyUsers();
        for (int i = 0; i < userData.size(); i++) {
            userData.get(i).importContactList(dummyData.allUserContacts.get(i));
        }

        appMain();

    }

    private static void appMain() {
        try {
            System.out.println("""
                    ==========================
                    Seryx Phone Directory App
                    --------------------------
                    1. Register
                    2. Login
                    0. Exit
                    """);
            int option = dataReader.nextInt();
            dataReader.nextLine();

            switch (option) {
                case 1 -> userRegistration();
                case 2 -> userLogin();
                case 0 -> System.exit(0);
                default -> {
                    System.out.println("Invalid selection. Please, try again.");
                    appMain();
                }
            }
        } catch (InputMismatchException ex) {
            System.out.println("Use only numbers from the options, please.");
            appMain();
        }

    }

    private static void userRegistration() {
        System.out.println("Enter your username: ");
        String userName = dataReader.nextLine();

        for(PhonebookUser user:userData) {
            if (Objects.equals(user.getUserName(), userName)) {
                System.out.println("This username already exists. Try another one.");
                userRegistration();
            }
        }

        System.out.println("Enter your password: ");
        String password = dataReader.nextLine();

        PhonebookUser user = new PhonebookUser(userName, password);

        userData.add(user);

        System.out.println("Please log in to access your directory.");

        userLogin();
    }

    private static void userLogin() {
        System.out.println("Enter your username: ");
        String userName = dataReader.nextLine();

        for(PhonebookUser user:userData) {
            if (Objects.equals(user.getUserName(), userName)) {
                System.out.println("Enter your password: ");
                String password = dataReader.nextLine();

                if (user.checkPassword(password)) {
                    appMenu(user);
                }
                else {
                    if (tries <= 3) {
                        System.out.println("Invalid password. Try again.");
                        userLogin();
                        tries++;
                    } else {
                        System.out.println("You cannot log in to this account, Please register.");
                        tries = 1;
                        userRegistration();
                    }
                }
            }
        }
        if (tries <= 3) {
            System.out.println("Invalid username. Try again.");
            userLogin();
            tries++;
        }
        else {
            System.out.println("You cannot log in to this account, Please register.");
            tries = 1;
            userRegistration();
        }
    }

    private static void appMenu(PhonebookUser user) {
        try {
            System.out.printf("""
                                    
                    Welcome, %s! What would you like to do?
                    1. Add Contact
                    2. Check Contact
                    3. Delete Contact
                    4. Edit Contact
                    5. Search Directory
                    6. Show All Contacts
                    0. Logout
                    """, user.getUserName());
            int option = dataReader.nextInt();
            dataReader.nextLine();

            switch (option) {
                case 1 -> addContact(user);
                case 2 -> displayContact(user);
                case 3 -> deleteContact(user);
                case 4 -> {
                    System.out.println("\nEnter the contact's first name, last name or phone number:");
                    String detail = dataReader.nextLine();
                    editContact(user, detail);
                }
                case 5 -> searchDirectory(user);
                case 6 -> displayAllContacts(user);
                case 0 -> appMain();
                default -> {
                    System.out.println("Invalid selection. Please, try again.");
                    appMenu(user);
                }
            }
        } catch (InputMismatchException ex) {
            System.out.println("Use only numbers from the options, please.");
            appMenu(user);
        }
    }

    private static void addContact(PhonebookUser user) {
        System.out.print("Enter the first name: ");
        String firstName = dataReader.nextLine();

        System.out.print("Enter the last name: ");
        String lastName = dataReader.nextLine();

        System.out.print("Enter the phone number: ");
        String phoneNumber = dataReader.nextLine();

        Contact newContact = new Contact(firstName, lastName, phoneNumber);

        user.addContact(newContact);

        try {
            System.out.println("""
                                    
                    Contact successfully added.
                    Would you like to add more details?
                    1. Yes
                    2. No
                    """);
            int option = dataReader.nextInt();
            dataReader.nextLine();

            if (option == 1) editNewContact(user, newContact);
            else appMenu(user);
        } catch (InputMismatchException ex) {
            System.out.println("Invalid selection.");
            appMenu(user);
        }
    }

    private static void displayContact(PhonebookUser user) {
        System.out.println("\nEnter the contact's first name, last name or phone number:");
        String detail = dataReader.nextLine();

        Contact foundContact = user.getContact(detail);

        if(foundContact == null) System.out.println("Contact does not exist in your directory");
        else System.out.println(foundContact);

        try {
            System.out.println("""
                                    
                    Would you like to check another contact?
                    1. Yes
                    2. No
                    """);
            int option = dataReader.nextInt();
            dataReader.nextLine();

            if (option == 1) displayContact(user);
            else appMenu(user);
        } catch (InputMismatchException ex) {
            System.out.println("Invalid selection.");
            appMenu(user);
        }
    }

    private static void deleteContact(PhonebookUser user) {
        System.out.println("\nEnter the contact's first name, last name or phone number:");
        String detail = dataReader.nextLine();

        Contact foundContact = user.getContact(detail);

        try {
            if (foundContact == null) System.out.println("Contact does not exist in your directory");
            else {
                System.out.printf("""
                        Are you sure you want to delete %s?
                        1. Yes
                        2. No
                        """, detail);
                int option = dataReader.nextInt();
                dataReader.nextLine();

                if (option == 1) {
                    user.deleteContact(foundContact);
                    deleteRecall(user);
                } else deleteRecall(user);
            }
        } catch (InputMismatchException ex) {
            System.out.println("Invalid selection.");
            appMenu(user);
        }
    }

    private static void deleteRecall(PhonebookUser user) {
        try {
            System.out.println("""
                                    
                    Would you like to delete another contact?
                    1. Yes
                    2. No
                    """);
            int option = dataReader.nextInt();
            dataReader.nextLine();

            if (option == 1) deleteContact(user);
            else appMenu(user);
        } catch (InputMismatchException ex) {
            System.out.println("Invalid selection.");
            appMenu(user);
        }
    }

    private static void editNewContact(PhonebookUser user, Contact contact) {
        System.out.print("\nEnter email address: ");
        String email = dataReader.nextLine();
        contact.setEmail(email);

        System.out.print("Enter home address: ");
        String address = dataReader.nextLine();
        contact.setAddress(address);

        System.out.println("Contact details have been updated. Press enter to go back to the main menu.");
        dataReader.nextLine();

        appMenu(user);
    }

    private static void editContact(PhonebookUser user, String detail) {
        try {
            Contact foundContact = user.getContact(detail);

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

                    System.out.println("Contact details have been updated. Press enter to go back to the Edit menu.");
                    dataReader.nextLine();

                    editContact(user, newFirstName);
                }
                case 2 -> {
                    System.out.print("Enter the new last name: ");
                    String newLastName = dataReader.nextLine();
                    foundContact.setLastName(newLastName);

                    System.out.println("Contact details have been updated. Press enter to go back to the menu.");
                    dataReader.nextLine();

                    editContact(user, newLastName);
                }
                case 3 -> {
                    System.out.print("Enter the new phone number: ");
                    String newPhoneNum = dataReader.nextLine();
                    foundContact.setPhoneNumber(newPhoneNum);

                    System.out.println("Contact details have been updated. Press enter to go back to the menu.");
                    dataReader.nextLine();

                    editContact(user, newPhoneNum);
                }
                case 4 -> {
                    System.out.print("Enter the new email address: ");
                    String newEmail = dataReader.nextLine();
                    foundContact.setEmail(newEmail);

                    System.out.println("Contact details have been updated. Press enter to go back to the menu.");
                    dataReader.nextLine();

                    editContact(user, detail);
                }
                case 5 -> {
                    System.out.print("Enter the new home address: ");
                    String newAddress = dataReader.nextLine();
                    foundContact.setAddress(newAddress);

                    System.out.println("Contact details have been updated. Press enter to go back to the menu.");
                    dataReader.nextLine();

                    editContact(user, detail);
                }
                case 6 -> appMenu(user);
                default -> {
                    System.out.println("Invalid selection. Please, try again.");
                    editContact(user, detail);
                }
            }
        } catch (InputMismatchException ex) {
            System.out.println("Use only numbers from the options, please.");
            editContact(user, detail);
        }
    }

    private static void searchDirectory(PhonebookUser user) {
        try {
            System.out.println("Enter your search query: ");
            String query = dataReader.nextLine();

            System.out.println("==============================");
            System.out.printf("**** CONTACTS FOR '%s' ****%n", query.toUpperCase());
            System.out.println("------------------------------");
            for (Contact contact : user.searchContacts(query)) {
                System.out.println(contact);
                System.out.println("------------------------------");
            }

            System.out.println("Press enter to go back to the menu.");
            dataReader.nextLine();  } catch(ContactNotFoundException ex) {
            System.out.println("No contact found for your query search.");
        }

        appMenu(user);
    }

    private static void displayAllContacts(PhonebookUser user) {
        System.out.println("==============================");
        System.out.println("*******  ALL CONTACTS  *******");
        System.out.println("------------------------------");
            for (Contact contact: user.getAllContact()) {
                System.out.println(contact);
                System.out.println("------------------------------");
            }

            System.out.println("Press enter to go back to the menu.");
            dataReader.nextLine();

            appMenu(user);

    }


}