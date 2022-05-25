package chapter7;

import java.util.Objects;
import java.util.Scanner;

public class TicTacToe {
    private String[][] options = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
    private int playerOne;
    private int playerTwo;

    Scanner optionReader = new Scanner(System.in);

    public TicTacToe() {
        playerOne = 0;
        playerTwo = 0;
    }

    public void gameIntro() {
        System.out.println("""
                Tic-Tac-Toe is a game with 9 slots to place X's or O's.
                If you can line up three consecutive X's or O's vertically,
                 horizontally or diagonally, you win!
                Chose your slot to place an X or an O.
                            +-----+-----+-----+
                            |  1  |  2  |  3  |
                            +-----+-----+-----+
                            |  4  |  5  |  6  |
                            +-----+-----+-----+
                            |  7  |  8  |  9  |
                            +-----+-----+-----+
                Press 1 to Start.
                """);
        int start = optionReader.nextInt();
    }

    public void displayGame() {
        System.out.println("+-----+-----+-----+");

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.printf("|  %s  ", options[i][j]);
            }
            System.out.println("|\n+-----+-----+-----+");
        }
    }

    public void playerOnePrompt (int playerNumber) {
        System.out.printf("Player %d, select your slot from 1 to 9: ", playerNumber);
        playerOne = optionReader.nextInt();
    }

    public void playerTwoPrompt (int playerNumber) {
        System.out.printf("Player %d, select your slot from 1 to 9: ", playerNumber);
        playerTwo = optionReader.nextInt();
    }

    public void playerOnePlay() {
        playerOnePrompt(1);

        switch (playerOne) {
            case 1 -> {
                if (Objects.equals(options[0][0], " ")) {
                    options[0][0] = "X";
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerOneReplay();
                }
            }

            case 2 -> {
                if (Objects.equals(options[0][1], " ")) {
                    options[0][1] = "X";
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerOneReplay();
                }
            }

            case 3 -> {
                if (Objects.equals(options[0][2], " ")) {
                    options[0][2] = "X";
                } else System.out.println("Slot already occupied. Select another slot.");
            }

            case 4 -> {
                if (Objects.equals(options[1][0], " ")) {
                    options[1][0] = "X";
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerOneReplay();
                }
            }

            case 5 -> {
                if (Objects.equals(options[1][1], " ")) {
                    options[1][1] = "X";
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerOneReplay();
                }
            }

            case 6 -> {
                if (Objects.equals(options[1][2], " ")) {
                    options[1][2] = "X";
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerOneReplay();
                }
            }

            case 7 -> {
                if (Objects.equals(options[2][0], " ")) {
                    options[2][0] = "X";
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerOneReplay();
                }
            }

            case 8 -> {
                if (Objects.equals(options[2][1], " ")) {
                    options[2][1] = "X";
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerOneReplay();
                }
            }

            case 9 -> {
                if (Objects.equals(options[2][2], " ")) {
                    options[2][2] = "X";
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerOneReplay();
                }
            }

            default -> {
                System.out.println("Invalid selection.");
                playerOneReplay();
            }
        }
    }

    public void playerTwoPlay() {
        playerTwoPrompt(2);


        switch (playerTwo) {
            case 1 -> {
                if (Objects.equals(options[0][0], " ")) {
                    options[0][0] = "O";
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerTwoReplay();
                }
            }

            case 2 -> {
                if (Objects.equals(options[0][1], " ")) {
                    options[0][1] = "O";
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerTwoReplay();
                }
            }

            case 3 -> {
                if (Objects.equals(options[0][2], " ")) {
                    options[0][2] = "O";
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerTwoReplay();
                }
            }

            case 4 -> {
                if (Objects.equals(options[1][0], " ")) {
                    options[1][0] = "O";
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerTwoReplay();
                }
            }

            case 5 -> {
                if (Objects.equals(options[1][1], " ")) {
                    options[1][1] = "O";
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerTwoReplay();
                }
            }

            case 6 -> {
                if (Objects.equals(options[1][2], " ")) {
                    options[1][2] = "O";
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerTwoReplay();
                }
            }

            case 7 -> {
                if (Objects.equals(options[2][0], " ")) {
                    options[2][0] = "O";
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerTwoReplay();
                }
            }

            case 8 -> {
                if (Objects.equals(options[2][1], " ")) {
                    options[2][1] = "O";
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerTwoReplay();
                }
            }

            case 9 -> {
                if (Objects.equals(options[2][2], " ")) {
                    options[2][2] = "O";
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerTwoReplay();
                }
            }

            default -> {
                System.out.println("Invalid selection.");
                playerTwoReplay();
            }
        }
    }

    public void setSlotValue(int index1, int index2, String value) {
        if (Objects.equals(options[index1][index2], " ")) {
            options[index1][index2] = value;
        } else {
            System.out.println("Slot already occupied.");
        }
    }

    public String getSlotValue(int index1, int index2) {
        return options[index1][index2];
    }

    public boolean checkSlots() {

        boolean b = false;
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Objects.equals(getSlotValue(i, j), " ")) {
                    b = true;
                    break;
                }
            }
            if (b) {
                break;
            }
        }
        return b;
    }

    public void playerOneReplay() {
        if(checkSlots()) {
            playerOnePlay();
        }
    }

    public void playerTwoReplay() {
        if(checkSlots()) {
            playerTwoPlay();
        }
    }

    public boolean checkPlayerOneWin() {

        boolean b = false;

        for(int i = 0; i < 3; i++) {
            if (getSlotValue(i, 0) == "X" && getSlotValue(i, 1) == "X" && getSlotValue(i, 2) == "X") {
                b = true;
                break;
            }
            if (getSlotValue(0, i) == "X" && getSlotValue(1, i) == "X" && getSlotValue(2, i) == "X") {
                b = true;
                break;
            }
            if (getSlotValue(0, 0) == "X" && getSlotValue(1, 1) == "X" && getSlotValue(2, 2) == "X") {
                b = true;
                break;
            }

            if (getSlotValue(0, 2) == "X" && getSlotValue(1, 1) == "X" && getSlotValue(2, 0) == "X") {
                b = true;
                break;
            }
        }
        return b;
    }

    public boolean checkPlayerTwoWin() {

        boolean b = false;

        for(int i = 0; i < 3; i++) {
            if (getSlotValue(i, 0) == "O" && getSlotValue(i, 1) == "O" && getSlotValue(i, 2) == "O") {
                b = true;
                break;
            }
            if (getSlotValue(0, i) == "O" && getSlotValue(1, i) == "O" && getSlotValue(2, i) == "O") {
                b = true;
                break;
            }
            if (getSlotValue(0, 0) == "O" && getSlotValue(1, 1) == "O" && getSlotValue(2, 2) == "O") {
                b = true;
                break;
            }

            if (getSlotValue(0, 2) == "O" && getSlotValue(1, 1) == "O" && getSlotValue(2, 0) == "O") {
                b = true;
                break;
            }
        }
        return b;
    }

    public void endWinGame (int playerNumber) {
        System.out.printf("""
                Player %d wins! Congratulations! Go again?
                1. Yes
                2. No
                """, playerNumber);
        int response = optionReader.nextInt();

        switch (response) {
            case  1 -> {
                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++) {
                        options[i][j] = " ";
                    }
                }
                playGame();
            }
            case 2 -> System.out.println("Thank you for playing.\n\nGoodbye!");
        }
    }

    public void endNoWinGame () {
        System.out.println("""
                Game over! No winners today. Go again?
                1. Yes
                2. No
                """);
        int response = optionReader.nextInt();

        switch (response) {
            case  1 -> {
                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++) {
                        options[i][j] = " ";
                    }
                }
                playGame();
            }
            case 2 -> System.out.println("Thank you for playing.");
        }
    }

    public void playGame() {
        while(checkSlots()) {
            displayGame();

            playerOnePlay();

            if (checkPlayerOneWin()) {
                displayGame();
                endWinGame(1);
                break;
            }

            displayGame();

            playerTwoPlay();

            if (checkPlayerTwoWin()) {
                displayGame();
                endWinGame(2);
                break;
            }
        }

        if (!checkPlayerOneWin() && !checkPlayerTwoWin()) {
            endNoWinGame();
        }
    }
}
