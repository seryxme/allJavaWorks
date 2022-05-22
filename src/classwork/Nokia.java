package classwork;

import java.util.Scanner;

public class Nokia {
    private static String nokiaMenu;
    private static int userSelection;
    private static Scanner optionReader = new Scanner(System.in);

    public static void main(String[] args) {

        String nokiaMenu = """
                1. Phonebook
                2. Messages
                3. Chat
                4. Call Register
                5. Tones
                6. Settings
                7. Call Divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM Services
                """;
        int userSelection = select(nokiaMenu);

        switch (userSelection) {
            case 1 -> showMenu1();
            case 2 -> showMenu2();
            case 3 -> System.out.println("Chat");
            case 4 -> showMenu4();
            case 5 -> showMenu5();
            case 6 -> showMenu6();
            case 7 -> System.out.println("Call Divert");
            case 8 -> System.out.println("Games");
            case 9 -> System.out.println("Calculator");
            case 10 -> System.out.println("Reminder");
            case 11 -> showMenu11();
            case 12 -> System.out.println("Profiles");
            case 13 -> System.out.println("SIM Services");
        }
    }

    public static int select(String menu) {
        System.out.println(menu);
        return optionReader.nextInt();
    }

    public static void showMenu1(){
        nokiaMenu = """
                        1. Search
                        2. Service Nos.
                        3. Add Name
                        4. Erase
                        5. Edit      
                        6. Assign Tone   
                        7. Send b'card
                        8. Options      
                        9. Speed Dials 
                        10. Voice Tags 
                        """;
        userSelection = select(nokiaMenu);
        switch (userSelection) {
            case 1 -> System.out.println("Search");
            case 2 -> System.out.println("Service Nos.");
            case 3 -> System.out.println("Add Name");
            case 4 -> System.out.println("Erase");
            case 5 -> System.out.println("Edit");
            case 6 -> System.out.println("Assign Tone");
            case 7 -> System.out.println("Send b'card");
            case 8 -> {
                nokiaMenu = """
                        1. Type of View
                        2. Memory Status
                        """;
                userSelection = select(nokiaMenu);
                switch (userSelection) {
                    case 1 -> System.out.println("Type of View");
                    case 2 -> System.out.println("Memory Status");
                }
            }
            case 9 -> System.out.println("Speed Dials");
            case 10 -> System.out.println("Voice Tags");
        }
    }

    public static void showMenu2() {
        nokiaMenu = """
                    1. Search
                    2. Service Nos.
                    3. Add Name
                    4. Erase
                    5. Edit      
                    6. Assign Tone   
                    7. Send b'card
                    8. Options      
                    9. Speed Dials 
                    10. Voice Tags 
                    """;
        userSelection = select(nokiaMenu);
        switch (userSelection) {
            case 1 -> System.out.println("Search");
            case 2 -> System.out.println("Service Nos.");
            case 3 -> System.out.println("Add Name");
            case 4 -> System.out.println("Erase");
            case 5 -> System.out.println("Edit");
            case 6 -> System.out.println("Assign Tone");
            case 7 -> System.out.println("Send b'card");
            case 8 -> {
                nokiaMenu = """
                    1. Type of View
                    2. Memory Status
                    """;
                userSelection = select(nokiaMenu);
                switch (userSelection) {
                    case 1 -> System.out.println("Type of View");
                    case 2 -> System.out.println("Memory Status");
                }
            }
            case 9 -> System.out.println("Speed Dials");
            case 10 -> System.out.println("Voice Tags");
        }
    }

    public static void showMenu4() {
        nokiaMenu = """
                        1. Missed Calls
                        2. Received Calls
                        3. Dialled Numbers
                        4. Erase Recent Call Lists
                        5. Show Call Duration
                        6. Show Call Costs
                        7. Call Cost Settings
                        8. Prepaid Credit
                        """;
        userSelection = select(nokiaMenu);
        switch (userSelection) {
            case 1 -> System.out.println("Missed Calls");
            case 2 -> System.out.println("Received Calls");
            case 3 -> System.out.println("Dialled Numbers");
            case 4 -> System.out.println("Erase Recent Call Lists");
            case 5 -> {
                nokiaMenu = """
                        1. Last Call Duration
                        2. All Calls' Duration
                        3. Received Calls' Duration
                        4. Dialled Calls' Duration
                        5. Clear Timers
                        """;
                userSelection = select(nokiaMenu);
                switch (userSelection) {
                    case 1 -> System.out.println("Last Call Duration");
                    case 2 -> System.out.println("All Calls' Duration");
                    case 3 -> System.out.println("Received Calls' Duration");
                    case 4 -> System.out.println("Dialled Calls' Duration");
                    case 5 -> System.out.println("Clear Timers");
                }
            }
            case 6 -> {
                nokiaMenu = """
                        1. Last Call Cost
                        2. All Calls' Cost
                        3. Clear Counters
                        """;
                userSelection = select(nokiaMenu);
                switch (userSelection) {
                    case 1 -> System.out.println("Last Call Cost");
                    case 2 -> System.out.println("All Calls' Cost");
                    case 5 -> System.out.println("Clear Counters");
                }
            }
            case 7 -> {
                nokiaMenu = """
                        1. Call Cost Limit
                        2. Show Costs In
                        """;
                userSelection = select(nokiaMenu);
                switch (userSelection) {
                    case 1 -> System.out.println("Call Cost Limit");
                    case 2 -> System.out.println("Show Costs In");
                }
            }
            case 8 -> System.out.println("Prepaid Credit");
        }
    }

    public static void showMenu5() {
        nokiaMenu = """
                        1. Ringing Tone
                        2. Ringing Volume
                        3. Incoming Call Alert
                        4. Composer
                        5. Message Alert Tone
                        6. Keypad Tones
                        7. Warning and Game Tones
                        8. Vibrating Alert
                        9. Screen Saver
                        """;
        userSelection = select(nokiaMenu);
        switch (userSelection) {
            case 1 -> System.out.println("Ringing Tone");
            case 2 -> System.out.println("Ringing Volume");
            case 3 -> System.out.println("Incoming Call Alert");
            case 4 -> System.out.println("Composer");
            case 5 -> System.out.println("Message Alert Tone");
            case 6 -> System.out.println("Keypad Tones");
            case 7 -> System.out.println("Warning and Game Tones");
            case 8 -> System.out.println("Vibrating Alert");
            case 9 -> System.out.println("Screen Saver");
        }
    }

    public static void showMenu6() {
        nokiaMenu = """
                        1. Call Settings
                        2. Phone Settings
                        3. Security Settings
                        4. Restore Factory Settings
                        """;
        userSelection = select(nokiaMenu);
        switch (userSelection) {
            case 1 -> {
                nokiaMenu = """
                        1. Automatic Redial
                        2. Speed Dialling
                        3. Call Waiting Options
                        4. Own Number Sending
                        5. Phone Line in Use
                        6. Automatic Answer
                        """;
                userSelection = select(nokiaMenu);
                switch (userSelection) {
                    case 1 -> System.out.println("Automatic Redial");
                    case 2 -> System.out.println("Speed Dialling");
                    case 3 -> System.out.println("Call Waiting Options");
                    case 4 -> System.out.println("Own Number Sending");
                    case 5 -> System.out.println("Phone Line in Use");
                    case 6 -> System.out.println("Automatic Answer");
                }
            }
            case 2 -> {
                nokiaMenu = """
                        1. Language
                        2. Cell Info Display
                        3. Welcome Note
                        4. Network Selection
                        5. Lights
                        6. Confirm SIM Service Actions
                        """;
                userSelection = select(nokiaMenu);
                switch (userSelection) {
                    case 1 -> System.out.println("Language");
                    case 2 -> System.out.println("Cell Info Display");
                    case 3 -> System.out.println("Welcome Note");
                    case 4 -> System.out.println("Network Selection");
                    case 5 -> System.out.println("Lights");
                    case 6 -> System.out.println("Confirm SIM Service Actions");
                }
            }
            case 3 -> {
                nokiaMenu = """
                        1. PIN Code Request
                        2. Call Barring Service
                        3. Fixed Dialling
                        4. Closed User Group
                        5. Phone Security
                        6. Change Access Codes
                        """;
                userSelection = select(nokiaMenu);
                switch (userSelection) {
                    case 1 -> System.out.println("PIN Code Request");
                    case 2 -> System.out.println("Call Barring Service");
                    case 3 -> System.out.println("Fixed Dialling");
                    case 4 -> System.out.println("Closed User Group");
                    case 5 -> System.out.println("Phone Security");
                    case 6 -> System.out.println("Change Access Codes");
                }
            }
            case 4 -> System.out.println("Restore Factory Settings");
        }
    }

    public static void showMenu11() {
        nokiaMenu = """
                        1. Alarm Clock
                        2. Clock Settings
                        3. Date Setting
                        4. Stopwatch
                        5. Countdown Timer
                        6. Auto Update of Date and Time
                        """;
        userSelection = select(nokiaMenu);
        switch (userSelection) {
            case 1 -> System.out.println("Alarm Clock");
            case 2 -> System.out.println("Clock Settings");
            case 3 -> System.out.println("Date Setting");
            case 4 -> System.out.println("Stopwatch");
            case 5 -> System.out.println("Countdown Timer");
            case 6 -> System.out.println("Auto Update of Date and Time");
        }
    }
}
