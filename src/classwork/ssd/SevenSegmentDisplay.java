package classwork.ssd;

import java.util.Scanner;

public class SevenSegmentDisplay {
    private static SevenSegment newDisplay = new SevenSegment();
    private static Scanner digitReader = new Scanner(System.in);

    public static void main(String[] args) {

//        System.out.println("Enter a number to display: ");
//        int number = digitReader.nextInt();

        for (int i = 0; i < 10; i++) {
            displayNumber(i);
        }

        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};

        for(char character:charArray) {
            displayCharacter(character);
        }

    }

    public static void displayNumber(int number) {
        newDisplay.resetDisplay();

        newDisplay.inputConverter(number);

        newDisplay.segmentReader();

        newDisplay.showDisplay();
    }

    public static void displayCharacter(char character) {
        newDisplay.resetDisplay();

        newDisplay.inputConverter(character);

        newDisplay.segmentReader();

        newDisplay.showDisplay();
    }
}
