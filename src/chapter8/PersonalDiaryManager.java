package chapter8;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonalDiaryManager {

    private static final User myCollection = new User();
    private static final Date date = new Date();
    private static int count = 0;
    private static boolean retry = true;
    private static final Scanner dataReader = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Please, enter your name: ");
        String userName = dataReader.nextLine();

        System.out.printf("\nWelcome %s, this is your Personal Diary Manager.%n", userName);

        appStart();
    }

    public static void appStart() {
        while(retry) {
            try {
                System.out.println("""
                                        
                        What would you like to do?
                        1. Create a new entry.
                        2. View entry.
                        3. Edit an entry.
                        4. Delete an entry.
                        5. Create a new diary.
                        6. View diary.
                        7. Update a diary.
                        8. Delete a diary.
                        0. Exit app.
                        """);
                int userOption = dataReader.nextInt();

                switch (userOption) {
                    case 1 -> createEntry();
                    case 2 -> viewEntry();
                    case 3 -> editEntry();
                    case 4 -> deleteEntry();
                    case 5 -> createDiary();
                    case 6 -> viewDiary();
                    case 7 -> updateDiary();
                    case 8 -> deleteDiary();
                    case 0 -> System.out.println("Thank you for using Personal Diary Manager.\n\nGoodbye!");
                    default -> {
                        System.out.println("Invalid option.");
                        appStart();
                    }
                }
                retry = false;
            } catch (InputMismatchException ex) {
                if (count == 3) {
                    System.out.println("Invalid input provided. Please restart.");
                    retry = true;
                    break;
                }
                System.out.println("Invalid input provided. Please try again.");
                dataReader.next();
                count++;
            }
        }

    }

    public static void createEntry() {
        try {
            Entry myEntry = new Entry();
            System.out.println("Enter the diary number where this entry will be stored:");
            int diaryId = dataReader.nextInt();

            try {
                myCollection.viewDiary(diaryId - 1);
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("""
                        Diary does not exist yet, will you like to create one?
                        1. Yes
                        2. No
                        """);
                int userResponse = dataReader.nextInt();
                if (userResponse == 1) {
                    createDiary();
                } else if (userResponse == 2) {
                    System.out.println("Please choose an existing diary number.\n");
                } else {
                    System.out.println("Invalid option.");
                    createEntry();
                }
            }

            System.out.println("Enter the entry number:");
            int entryId = dataReader.nextInt();
            myEntry.setId(entryId);
            dataReader.nextLine();

            System.out.println("Give your entry a title:");
            String entryTitle = dataReader.nextLine();
            myEntry.setTitle(entryTitle);

            System.out.println("Go ahead and write here:");
            String entryBody = dataReader.nextLine();
            myEntry.setBody(entryBody);

            myEntry.setDateCreated(date);

            try {
                myCollection.viewDiary(diaryId - 1).addEntry(entryId - 1, myEntry);

                System.out.println("Entry created!");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("An error occurred. Please check that diary exists.");
                viewDiary();
            }

        } catch(InputMismatchException ex) {
            System.out.println("Invalid input provided. Please start over.");
            dataReader.next();
            createEntry();
        }

        entryOptions();
    }

    public static void viewEntry() {
        try {
            System.out.print("Please enter the diary number for the entry you will like to view: ");
            int diaryId = dataReader.nextInt();

            System.out.println("""
                     What would you like to view?
                    1. One entry
                    2. All entries
                    """);
            int userOption = dataReader.nextInt();

            if (userOption == 1) {
                System.out.print("Please enter the entry number: ");
                int entryNumber = dataReader.nextInt();

                System.out.println(myCollection.viewDiary(diaryId - 1).getEntry(entryNumber - 1));
            } else if (userOption == 2) {
                myCollection.viewDiary(diaryId - 1).getAllEntries();
            } else {
                System.out.println("Invalid option.");
                viewEntry();
            }
        } catch(InputMismatchException ex) {
            System.out.println("Invalid input provided. Please start over.");
            dataReader.next();
            viewEntry();        }

        entryOptions();
    }

    private static void editEntry() {
        try {
            System.out.print("\nPlease enter the diary number for the entry you will like to edit: ");
            int diaryId = dataReader.nextInt();

            System.out.print("Please enter the entry number: ");
            int entryNumber = dataReader.nextInt();

            System.out.print("""
                    What would you like to edit?
                    1. Title
                    2. Details
                    """);
            int userOption = dataReader.nextInt();
            dataReader.nextLine();

            if (userOption == 1) {
                System.out.print("Enter a new title: ");
                String newTitle = dataReader.nextLine();
                myCollection.viewDiary(diaryId - 1).editEntryTitle(entryNumber - 1, newTitle);

            } else if (userOption == 2) {
                System.out.print("Re-enter details: ");
                String newDetails = dataReader.nextLine();
                myCollection.viewDiary(diaryId - 1).editEntryBody(entryNumber - 1, newDetails);

            } else {
                System.out.println("Invalid option.");
                editEntry();
            }

            System.out.println("Entry updated!");
        } catch(InputMismatchException ex) {
            System.out.println("Invalid input provided. Please start over.");
            dataReader.next();
            editEntry();        }

        entryOptions();
    }

    private static void deleteEntry() {
        try {
            System.out.print("Please enter the diary number for the entry you will like to delete: ");
            int diaryId = dataReader.nextInt();

            System.out.println("Enter the entry number you would like to delete: ");
            int entryId = dataReader.nextInt();
            myCollection.viewDiary(diaryId - 1).deleteEntry(entryId - 1);

            System.out.println("Entry deleted!");
        } catch(InputMismatchException ex) {
            System.out.println("Invalid input provided. Please start over.");
            dataReader.next();
            deleteEntry();        }
        entryOptions();
    }

    public static void entryOptions() {
        try {
            System.out.println("""
                    \n
                    What would you like to do next?
                    1. Create a new entry.
                    2. View entry.
                    3. Edit an entry.
                    4. Delete an entry.
                    0. Back to Main menu.
                    """);
            int userOption = dataReader.nextInt();

            switch (userOption) {
                case 1 -> createEntry();
                case 2 -> viewEntry();
                case 3 -> editEntry();
                case 4 -> deleteEntry();
                case 0 -> appStart();
                default -> {
                    System.out.println("Invalid option.");
                    appStart();
                }
            }
        } catch(InputMismatchException ex) {
            System.out.println("Invalid input provided. Please start over.");
            dataReader.next();
            entryOptions();        }
    }

    private static void createDiary() {
        try {
            Diary myDiary = new Diary();

            System.out.println("Enter the diary number:");
            int diaryId = dataReader.nextInt();
            myDiary.setId(diaryId);
            dataReader.nextLine();

            System.out.println("What is the name of this diary?");
            String diaryName = dataReader.nextLine();
            myDiary.setName(diaryName);

            myDiary.setDateCreated(date);

            myCollection.createDiary(diaryId - 1, myDiary);

            System.out.println("Diary created!");
        } catch(InputMismatchException ex) {
            System.out.println("Invalid input provided. Please start over.");
            dataReader.next();
            createDiary();        }

        diaryOptions();
    }

    private static void viewDiary() {
        try {
            System.out.println("""
                     What would you like to view?
                    1. One diary
                    2. All diaries
                    """);
            int userOption = dataReader.nextInt();

            if (userOption == 1) {
                System.out.print("Please enter the diary number you will like to view: ");
                int diaryNumber = dataReader.nextInt();

                System.out.println(myCollection.viewDiary(diaryNumber - 1));
            } else if (userOption == 2) {
                myCollection.viewAllDiaries();
            } else {
                System.out.println("Invalid option.");
                viewDiary();
            }
        } catch(InputMismatchException ex) {
            System.out.println("Invalid input provided. Please start over.");
            dataReader.next();
            viewDiary();        }

        diaryOptions();
    }

    private static void updateDiary() {
        try {
            System.out.println("Enter the number of the diary you want to update:");
            int diaryId = dataReader.nextInt();
            dataReader.nextLine();

            System.out.print("Enter a new name for this diary: ");
            String newName = dataReader.nextLine();

            myCollection.editDiary(diaryId - 1, newName);

            System.out.println("Diary successfully updated!");
        } catch(InputMismatchException ex) {
            System.out.println("Invalid input provided. Please start over.");
            dataReader.next();
            updateDiary();        }

        diaryOptions();
    }

    private static void deleteDiary() {
        try {
            System.out.println("Enter the diary number you would like to delete: ");
            int diaryId = dataReader.nextInt();
            myCollection.deleteDiary(diaryId - 1);

            System.out.println("Diary successfully deleted!");
        } catch(InputMismatchException ex) {
            System.out.println("Invalid input provided. Please start over.");
            dataReader.next();
            deleteDiary();
        }

        diaryOptions();
    }

    public static void diaryOptions() {
        try {
            System.out.println("""
                                    
                    What would you like to do next?
                    1. Create a new diary.
                    2. View diary.
                    3. Update a diary.
                    4. Delete a diary.
                    0. Back to Main menu.
                    """);
            int userOption = dataReader.nextInt();

            switch (userOption) {
                case 1 -> createDiary();
                case 2 -> viewDiary();
                case 3 -> updateDiary();
                case 4 -> deleteDiary();
                case 0 -> appStart();
                default -> {
                    System.out.println("Invalid option.");
                    appStart();
                }
            }
        } catch(InputMismatchException ex) {
            System.out.println("Invalid input provided. Please start over.");
            dataReader.next();
            diaryOptions();        }
    }
}
