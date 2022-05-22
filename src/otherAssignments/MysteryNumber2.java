package otherAssignments;

import java.util.Scanner;

public class MysteryNumber2 {
    public static void main(String[] args) {

        int mysteryNum = 15;

        Scanner mystery = new Scanner(System.in);

        System.out.print("Can you guess the mystery number between 1 and 20?\nEnter the number: ");
        int guessedNum = mystery.nextInt();


        while (guessedNum != mysteryNum) {
            if (guessedNum > mysteryNum) {
                System.out.println("Too high. Try again: ");
                guessedNum = mystery.nextInt();
            }
            if (guessedNum < mysteryNum) {
                System.out.println("Too low. Try again: ");
                guessedNum = mystery.nextInt();
            }
        }
        if (guessedNum == mysteryNum) {
            System.out.println("Correct!");
        }
    }
}