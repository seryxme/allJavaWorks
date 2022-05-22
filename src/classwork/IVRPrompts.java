package classwork;

import java.util.Scanner;

public class IVRPrompts {
    public static void main(String[] args) {

        Scanner optionReader = new Scanner(System.in);

        System.out.println("""
                For English, press 1.
                For Igbo, press 2.
                For French, press 3.
                For Yoruba, press 4.
                """);
        int userSelection = optionReader.nextInt();

        while (userSelection < 1 || userSelection > 4) {
            System.out.println("Option not available, please try again.");
            userSelection = optionReader.nextInt();
        }

        switch(userSelection) {
            case 1:
                System.out.println("For Data, press 1.\n" +
                        "For Transfer, press 2.");
                int selection2 = optionReader.nextInt();
                switch (selection2) {
                    case 1 -> System.out.println("Data");
                    case 2 -> System.out.println("Transfer");
                }
                break;
            case 2:
                System.out.println("For Sharing, press 1.\n" +
                        "For Caring, press 2.");
                selection2 = optionReader.nextInt();
                switch (selection2) {
                    case 1 -> System.out.println("Sharing");
                    case 2 -> System.out.println("Caring");
                }
                break;
            case 3:
                System.out.println("For Egg, press 1.\n" +
                        "For Champagne, press 2.");
                selection2 = optionReader.nextInt();
                switch (selection2) {
                    case 1 -> System.out.println("Egg");
                    case 2 -> System.out.println("Champagne");
                }
                break;
            case 4:
                System.out.println("For Ewa, press 1.\n" +
                        "For Agoyin, press 2.");
                selection2 = optionReader.nextInt();
                switch (selection2) {
                    case 1 -> System.out.println("Ewa");
                    case 2 -> System.out.println("Agoyin");
                }
                break;
        }
    }
}
