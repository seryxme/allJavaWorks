package Practice;

import java.security.SecureRandom;
import java.util.Objects;
import java.util.Scanner;

public class Craps {
    private static final SecureRandom randomNumbers = new SecureRandom();

    public enum Status {CONTINUE, WON, LOST};
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        Scanner diceRoll = new Scanner(System.in);
        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
        }

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
        }
        if (gameStatus == Status.WON) {
            System.out.println("Player wins");
        }
        else {
            System.out.println("Player loses");
        }
    }

    public static int rollDice(){
        // pick random die values
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }
}
