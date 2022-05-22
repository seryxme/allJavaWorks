package chapter6;

import java.security.SecureRandom;
import java.util.Objects;
import java.util.Scanner;

public class CrapsMod {
    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {CONTINUE, WON, LOST};
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    private static int bankBalance = 1000;
    private static int playSelection = 0;
    private static Scanner diceRoll = new Scanner(System.in);

    public static void main(String[] args) {

        gameplay();
        System.out.println("1. Play again\n0. Exit");
        playSelection = diceRoll.nextInt();
        while(playSelection == 1 && bankBalance > 0) {
            gameplay();

            System.out.println("1. Play again\n0. Exit");
            playSelection = diceRoll.nextInt();
        }
        if (bankBalance <= 0) {
            System.out.println("You're broke! Go home.");
        } else System.out.println("Now you can count your money!");
    }

    public static void gameplay() {
        System.out.println("You have $" + bankBalance + ". Enter a wager: ");
        int wager = diceRoll.nextInt();

        while(wager > bankBalance) {
            System.out.println("Too high. Enter new wager.");
            wager = diceRoll.nextInt();
        }

        System.out.println("Are you ready? Press 1 to roll dice: ");
        int userRoll = diceRoll.nextInt();
        diceRoll.nextLine();

        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = 0;
        if (userRoll == 1) sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN, YO_LEVEN -> gameStatus = Status.WON;
            case SNAKE_EYES, TREY, BOX_CARS -> gameStatus = Status.LOST;
            default -> {
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
            }
        }

        chatter();

        while (gameStatus == Status.CONTINUE) {
            System.out.println("Do you want to roll again? Enter 'y' for Yes or 'n' for No: ");
            String decision = diceRoll.nextLine();
            if (Objects.equals(decision, "n")) {
                gameStatus = Status.LOST;
            }
            if (Objects.equals(decision, "y")) {
                sumOfDice = rollDice();
            }

            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;
            }
            else {
                if (sumOfDice == SEVEN) {
                    gameStatus = Status.LOST;

                }
            }
            chatter();
        }
        if (gameStatus == Status.WON) {
            bankBalance += wager;
            System.out.println("You win! Your balance is $" + bankBalance);
        }
        else {
            bankBalance -= wager;
            System.out.println("You lose! Your balance is $" + bankBalance);
        }
    }

    public static int rollDice(){
        // pick random die values
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;
        System.out.printf("You rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }

    public static void chatter(){
        int chatterNum = (int) (1 + Math.random() * 5);
        switch(chatterNum) {
            case 1 -> System.out.println("\nBe bold. Play again.\n");
            case 2 -> System.out.println("\nKeep playing. You can get lucky!\n");
            case 3 -> System.out.println("\nAre you good enough to win?\n");
            case 4 -> System.out.println("\nYou should cash in your chips now. Will you?\n");
            case 5 -> System.out.println("\nYou're going on a roll!\n");
        }
    }
}
