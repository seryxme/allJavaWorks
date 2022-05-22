package classwork;

import java.util.Scanner;

public class Nokia2 {
    private static String nokiaMenu;
    private static int userSelection;
    private static Scanner optionReader = new Scanner(System.in);

    public static void main(String[] args) {

        showMainMenu();
    }

    public static int select(String menu) {
        System.out.println(menu);
        return optionReader.nextInt();
    }

    public static void showMainMenu() {
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
                14. Exit
                """;
        userSelection = select(nokiaMenu);
        switch (userSelection) {
            case 1 -> showMenu1();
            case 2 -> showMenu2();
            case 3 -> showMenu3();
            case 4 -> showMenu4();
            case 5 -> showMenu5();
            case 6 -> showMenu6();
            case 7 -> showMenu7();
            case 8 -> showMenu8();
            case 9 -> showMenu9();
            case 10 -> showMenu10();
            case 11 -> showMenu11();
            case 12 -> showMenu12();
            case 13 -> showMenu13();
            case 14 -> showMenu14();
        }
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
                        11. Back
                        """;
        userSelection = select(nokiaMenu);
        switch (userSelection) {
            case 1 -> showMenu1_0("Search");
            case 2 -> showMenu1_0("Service Nos.");
            case 3 -> showMenu1_0("Add Name");
            case 4 -> showMenu1_0("Erase");
            case 5 -> showMenu1_0("Edit");
            case 6 -> showMenu1_0("Assign Tone");
            case 7 -> showMenu1_0("Send b'card");
            case 8 -> showMenu1_8();
            case 9 -> System.out.println("Speed Dials");
            case 10 -> System.out.println("Voice Tags");
            case 11 -> showMainMenu();
        }
    }

    public static void showMenu1_0(String menu) {
        nokiaMenu = menu + """
                
                0. Back
                """;
        //System.out.println(nokiaMenu);
        userSelection = select(nokiaMenu);
        if (userSelection == 0) showMenu1();
    }

    public static void showMenu1_8() {
        nokiaMenu = """
                        1. Type of View
                        2. Memory Status
                        3. Back
                        """;
        userSelection = select(nokiaMenu);
        switch (userSelection) {
            case 1 -> showMenu1_81("Type of View");
            case 2 -> showMenu1_81("Memory Status");
            case 3 -> showMenu1();
        }
    }

    public static void showMenu1_81(String menu) {
        nokiaMenu = menu + """
                
                0. Back
                """;
        userSelection = select(nokiaMenu);
        if (userSelection == 0) showMenu1_8();
    }

    public static void showMenu2_0(String menu) {
        nokiaMenu = menu + """
                
                0. Back
                """;
        //System.out.println(nokiaMenu);
        userSelection = select(nokiaMenu);
        if (userSelection == 0) showMenu2();
    }

    public static void showMenu2_8() {
        nokiaMenu = """
                    1. Type of View
                    2. Memory Status
                    3. Back
                    """;
        userSelection = select(nokiaMenu);
        switch (userSelection) {
            case 1 -> showMenu2_81("Type of View");
            case 2 -> showMenu2_81("Memory Status");
            case 3 -> showMenu2();
        }
    }

    public static void showMenu2_81(String menu) {
        nokiaMenu = menu + """
                
                0. Back
                """;
        userSelection = select(nokiaMenu);
        if (userSelection == 0) showMenu2_8();
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
                    11. Back
                    """;
        userSelection = select(nokiaMenu);
        switch (userSelection) {
            case 1 -> showMenu2_0("Search");
            case 2 -> showMenu2_0("Service Nos.");
            case 3 -> showMenu2_0("Add Name");
            case 4 -> showMenu2_0("Erase");
            case 5 -> showMenu2_0("Edit");
            case 6 -> showMenu2_0("Assign Tone");
            case 7 -> showMenu2_0("Send b'card");
            case 8 -> showMenu2_8();
            case 9 -> showMenu2_0("Speed Dials");
            case 10 -> showMenu2_0("Voice Tags");
            case 11 -> showMainMenu();
        }
    }

    public static void showMenu3() {
        nokiaMenu = """
                Chat
                0. Back
                """;
        //System.out.println(nokiaMenu);
        userSelection = select(nokiaMenu);
        if (userSelection == 0) showMainMenu();
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
                        9. Back
                        """;
        userSelection = select(nokiaMenu);
        switch (userSelection) {
            case 1 -> showMenu4_0("Missed Calls");
            case 2 -> showMenu4_0("Received Calls");
            case 3 -> showMenu4_0("Dialled Numbers");
            case 4 -> showMenu4_0("Erase Recent Call Lists");
            case 5 -> showMenu4_5();
            case 6 -> showMenu4_6();
            case 7 -> showMenu4_7();
            case 8 -> showMenu4_0("Prepaid Credit");
            case 9 -> showMainMenu();
        }
    }

    public static void showMenu4_0(String menu) {
        nokiaMenu = menu + """
                
                0. Back
                """;
        //System.out.println(nokiaMenu);
        userSelection = select(nokiaMenu);
        if (userSelection == 0) showMenu4();
    }

    public static void showMenu4_5() {
        nokiaMenu = """
                        1. Last Call Duration
                        2. All Calls' Duration
                        3. Received Calls' Duration
                        4. Dialled Calls' Duration
                        5. Clear Timers
                        6. Back
                        """;
        userSelection = select(nokiaMenu);
        switch (userSelection) {
            case 1 -> showMenu4_51("Last Call Duration");
            case 2 -> showMenu4_51("All Calls' Duration");
            case 3 -> showMenu4_51("Received Calls' Duration");
            case 4 -> showMenu4_51("Dialled Calls' Duration");
            case 5 -> showMenu4_51("Clear Timers");
            case 6 -> showMenu4();
        }
    }

    public static void showMenu4_51(String menu) {
        nokiaMenu = menu + """
                
                0. Back
                """;
        userSelection = select(nokiaMenu);
        if (userSelection == 0) showMenu4_5();
    }

    public static void showMenu4_6() {
        nokiaMenu = """
                        1. Last Call Cost
                        2. All Calls' Cost
                        3. Clear Counters
                        4. Back
                        """;
        userSelection = select(nokiaMenu);
        switch (userSelection) {
            case 1 -> showMenu4_61("Last Call Cost");
            case 2 -> showMenu4_61("All Calls' Cost");
            case 3 -> showMenu4_61("Clear Counters");
            case 4 -> showMenu4();
        }
    }

    public static void showMenu4_61(String menu) {
        nokiaMenu = menu + """
                
                0. Back
                """;
        userSelection = select(nokiaMenu);
        if (userSelection == 0) showMenu4_6();
    }

    public static void showMenu4_7() {
        nokiaMenu = """
                        1. Call Cost Limit
                        2. Show Costs In
                        3. Back
                        """;
        userSelection = select(nokiaMenu);
        switch (userSelection) {
            case 1 -> showMenu4_71("Call Cost Limit");
            case 2 -> showMenu4_71("Show Costs In");
            case 3 -> showMenu4();
        }
    }

    public static void showMenu4_71(String menu) {
        nokiaMenu = menu + """
                
                0. Back
                """;
        userSelection = select(nokiaMenu);
        if (userSelection == 0) showMenu4_7();
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
                        10. Back
                        """;
        userSelection = select(nokiaMenu);
        switch (userSelection) {
            case 1 -> showMenu5_1("Ringing Tone");
            case 2 -> showMenu5_1("Ringing Volume");
            case 3 -> showMenu5_1("Incoming Call Alert");
            case 4 -> showMenu5_1("Composer");
            case 5 -> showMenu5_1("Message Alert Tone");
            case 6 -> showMenu5_1("Keypad Tones");
            case 7 -> showMenu5_1("Warning and Game Tones");
            case 8 -> showMenu5_1("Vibrating Alert");
            case 9 -> showMenu5_1("Screen Saver");
            case 10 -> showMainMenu();
        }
    }

    public static void showMenu5_1(String menu) {
        nokiaMenu = menu + """
                
                0. Back
                """;
        //System.out.println(nokiaMenu);
        userSelection = select(nokiaMenu);
        if (userSelection == 0) showMenu5();
    }

    public static void showMenu6() {
        nokiaMenu = """
                        1. Call Settings
                        2. Phone Settings
                        3. Security Settings
                        4. Restore Factory Settings
                        5. Back
                        """;
        userSelection = select(nokiaMenu);
        switch (userSelection) {
            case 1 -> showMenu6_1();
            case 2 -> showMenu6_2();
            case 3 -> showMenu6_3();
            case 4 -> showMenu6_4("Restore Factory Settings");
            case 5 -> showMainMenu();
        }
    }


    public static void showMenu6_1() {
        nokiaMenu = """
                1. Automatic Redial
                2. Speed Dialling
                3. Call Waiting Options
                4. Own Number Sending
                5. Phone Line in Use
                6. Automatic Answer
                7. Back
                """;
        userSelection = select(nokiaMenu);
        switch (userSelection) {
            case 1 -> showMenu6_11("Automatic Redial");
            case 2 -> showMenu6_11("Speed Dialling");
            case 3 -> showMenu6_11("Call Waiting Options");
            case 4 -> showMenu6_11("Own Number Sending");
            case 5 -> showMenu6_11("Phone Line in Use");
            case 6 -> showMenu6_11("Automatic Answer");
            case 7 -> showMenu6();
        }
    }

    public static void showMenu6_11(String menu) {
        nokiaMenu = menu + """
                
                0. Back
                """;
        userSelection = select(nokiaMenu);
        if (userSelection == 0) showMenu6_1();
    }

    public static void showMenu6_2() {
        nokiaMenu = """
                        1. Language
                        2. Cell Info Display
                        3. Welcome Note
                        4. Network Selection
                        5. Lights
                        6. Confirm SIM Service Actions
                        7. Back
                        """;
        userSelection = select(nokiaMenu);
        switch (userSelection) {
            case 1 -> showMenu6_21("Language");
            case 2 -> showMenu6_21("Cell Info Display");
            case 3 -> showMenu6_21("Welcome Note");
            case 4 -> showMenu6_21("Network Selection");
            case 5 -> showMenu6_21("Lights");
            case 6 -> showMenu6_21("Confirm SIM Service Actions");
            case 7 -> showMenu6();
        }
    }

    public static void showMenu6_21(String menu) {
        nokiaMenu = menu + """
                
                0. Back
                """;
        userSelection = select(nokiaMenu);
        if (userSelection == 0) showMenu6_2();
    }

    public static void showMenu6_3() {
        nokiaMenu = """
                        1. PIN Code Request
                        2. Call Barring Service
                        3. Fixed Dialling
                        4. Closed User Group
                        5. Phone Security
                        6. Change Access Codes
                        7. Back
                        """;
        userSelection = select(nokiaMenu);
        switch (userSelection) {
            case 1 -> showMenu6_31("PIN Code Request");
            case 2 -> showMenu6_31("Call Barring Service");
            case 3 -> showMenu6_31("Fixed Dialling");
            case 4 -> showMenu6_31("Closed User Group");
            case 5 -> showMenu6_31("Phone Security");
            case 6 -> showMenu6_31("Change Access Codes");
            case 7 -> showMenu6();
        }
    }

    public static void showMenu6_31(String menu) {
        nokiaMenu = menu + """
                
                0. Back
                """;
        userSelection = select(nokiaMenu);
        if (userSelection == 0) showMenu6_3();
    }

    public static void showMenu6_4(String menu) {
        nokiaMenu = menu + """
                
                0. Back
                """;
        userSelection = select(nokiaMenu);
        if (userSelection == 0) showMenu6();
    }

    public static void showMenu7() {
        nokiaMenu = """
                Call Divert
                0. Back
                """;
        System.out.println(nokiaMenu);
        userSelection = select(nokiaMenu);
        if (userSelection == 0) showMainMenu();
    }

    public static void showMenu8() {
        nokiaMenu = """
                Games
                0. Back
                """;
        System.out.println(nokiaMenu);
        userSelection = select(nokiaMenu);
        if (userSelection == 0) showMainMenu();
    }

    public static void showMenu9() {
        nokiaMenu = """
                Calculator
                0. Back
                """;
        System.out.println(nokiaMenu);
        userSelection = select(nokiaMenu);
        if (userSelection == 0) showMainMenu();
    }

    public static void showMenu10() {
        nokiaMenu = """
                Reminders
                0. Back
                """;
        System.out.println(nokiaMenu);
        userSelection = select(nokiaMenu);
        if (userSelection == 0) showMainMenu();
    }

    public static void showMenu11_1(String menu) {
        nokiaMenu = menu + """
                
                0. Back
                """;
        //System.out.println(nokiaMenu);
        userSelection = select(nokiaMenu);
        if (userSelection == 0) showMenu11();
    }

    public static void showMenu11() {
        nokiaMenu = """
                        1. Alarm Clock
                        2. Clock Settings
                        3. Date Setting
                        4. Stopwatch
                        5. Countdown Timer
                        6. Auto Update of Date and Time
                        7. Back
                        """;
        userSelection = select(nokiaMenu);
        switch (userSelection) {
            case 1 -> showMenu11_1("Alarm Clock");
            case 2 -> showMenu11_1("Clock Settings");
            case 3 -> showMenu11_1("Date Setting");
            case 4 -> showMenu11_1("Stopwatch");
            case 5 -> showMenu11_1("Countdown Timer");
            case 6 -> showMenu11_1("Auto Update of Date and Time");
            case 7 -> showMainMenu();
        }
    }

    public static void showMenu12() {
        nokiaMenu = """
                Profiles
                0. Back
                """;
        System.out.println(nokiaMenu);
        userSelection = select(nokiaMenu);
        if (userSelection == 0) showMainMenu();
    }

    public static void showMenu13() {
        nokiaMenu = """
                SIM Services
                0. Back
                """;
        System.out.println(nokiaMenu);
        userSelection = select(nokiaMenu);
        if (userSelection == 0) showMainMenu();
    }

    public static void showMenu14() {
        System.exit(0);
    }
}