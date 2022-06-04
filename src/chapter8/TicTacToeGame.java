package chapter8;

import java.security.SecureRandom;
import java.util.Objects;
import java.util.Scanner;

public class TicTacToeGame {
    private static int player;
    private static int playerOneScore = 0;
    private static int playerTwoScore = 0;

    private static int playerScore = 0;
    private static int computerScore = 0;

    public enum SlotValues {EMPTY, X, O}
    private static TicTacToe game = new TicTacToe();
    private static SlotValues slots;
    private static SecureRandom slotOptions = new SecureRandom();
    private static final Scanner optionReader = new Scanner(System.in);
    public static void main(String[] args) {

        gameIntro();

        int option = choosePlayMode();

        playingMode(option);


    }

    public static void gameIntro() {
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

    public static int choosePlayMode() {
        System.out.println("""
              
                Choose your playing option:
                1. Two Players
                2. v. Computer
                """);
        int option = optionReader.nextInt();

        return option;
    }

    public static void playingMode(int option) {

        if (option == 1) {
            game.setSlotsEmpty();

            playGame();
        } else if (option == 2) {
            System.out.println("""
              
                Will you like to play first?
                1. Yes
                2. No
                """);
            int option2 = optionReader.nextInt();

            if (option2 == 1) {
                game.setSlotsEmpty();

                displayGame();

                playGameVsComp(1, 0);
            } else if (option2 == 2) {
                game.setSlotsEmpty();

                playGameVsComp(0, 2);
            } else {
                System.out.println("Invalid option. Try again.");
                playingMode(2);
            }

        } else {
            System.out.println("Invalid option. Try again.");
            option = choosePlayMode();
            playingMode(option);
        }
    }

    public static void displayGame() {
        System.out.println("+-----+-----+-----+");

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.printf("|  %s  ", game.getSlotValue(i,j));
            }
            System.out.println("|\n+-----+-----+-----+");
        }
    }

    public static void playGame() {
        while(game.checkSlots()) {
            displayGame();

            playerOnePlay(1);

            if (game.checkPlayerOneWin()) {
                displayGame();
                playerOneScore++;
                endWinGame(1);
                break;
            }

            displayGame();

            if (!game.checkSlots()) {
                break;
            }

            playerTwoPlay(2);

            if (game.checkPlayerTwoWin()) {
                displayGame();
                playerTwoScore++;
                endWinGame(2);
                break;
            }
        }

        if (!game.checkPlayerOneWin() && !game.checkPlayerTwoWin()) {
            endNoWinGame();
        }
    }

    public static void playGameVsComp(int playerNum1, int playerNum2) {
        while(game.checkSlots()) {

            playerOnePlay(playerNum1);

            if (game.checkPlayerOneWin()) {
                displayGame();
                if (playerNum1 == 1) playerScore++;
                else computerScore++;
                endWinGameVsComputer(playerNum1);
                break;
            }

            displayGame();

            if (!game.checkSlots()) {
                break;
            }

            playerTwoPlay(playerNum2);

            if (game.checkPlayerTwoWin()) {
                displayGame();
                if (playerNum2 == 2) playerScore++;
                else computerScore++;
                endWinGameVsComputer(playerNum2);
                break;
            }

            displayGame();
        }

        if (!game.checkPlayerOneWin() && !game.checkPlayerTwoWin()) {
            endNoWinGameVsComputer(playerNum1, playerNum2);
        }
    }


    public static void playerPrompt (int playerNumber) {
        if (playerNumber == 1 || playerNumber == 2) {
            System.out.printf("Player %d, select your slot from 1 to 9: ", playerNumber);
            player = optionReader.nextInt();
        }
        if (playerNumber == 0) player = 1 + slotOptions.nextInt(9);

    }

    public static void playerOnePlay(int playerNum) {
        playerPrompt(playerNum);

        switch (player) {
            case 1 -> {
                if (Objects.equals(game.getSlotValue(0,0), " ")) {
                    game.setSlotValue(0,0, "X");
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerOneReplay(playerNum);
                }
            }

            case 2 -> {
                if (Objects.equals(game.getSlotValue(0,1), " ")) {
                    game.setSlotValue(0,1, "X");
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    TicTacToeGame.playerOneReplay(playerNum);
                }
            }

            case 3 -> {
                if (Objects.equals(game.getSlotValue(0,2), " ")) {
                    game.setSlotValue(0,2, "X");
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    TicTacToeGame.playerOneReplay(playerNum);
                }

            }

            case 4 -> {
                if (Objects.equals(game.getSlotValue(1,0), " ")) {
                    game.setSlotValue(1,0, "X");
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    TicTacToeGame.playerOneReplay(playerNum);
                }
            }

            case 5 -> {
                if (Objects.equals(game.getSlotValue(1,1), " ")) {
                    game.setSlotValue(1,1, "X");
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    TicTacToeGame.playerOneReplay(playerNum);
                }
            }

            case 6 -> {
                if (Objects.equals(game.getSlotValue(1,2), " ")) {
                    game.setSlotValue(1,2, "X");
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    TicTacToeGame.playerOneReplay(playerNum);
                }
            }

            case 7 -> {
                if (Objects.equals(game.getSlotValue(2,0), " ")) {
                    game.setSlotValue(2,0, "X");
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    TicTacToeGame.playerOneReplay(playerNum);
                }
            }

            case 8 -> {
                if (Objects.equals(game.getSlotValue(2,1), " ")) {
                    game.setSlotValue(2,1, "X");
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    TicTacToeGame.playerOneReplay(playerNum);
                }
            }

            case 9 -> {
                if (Objects.equals(game.getSlotValue(2, 2), " ")) {
                    game.setSlotValue(2,2, "X");
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    TicTacToeGame.playerOneReplay(playerNum);
                }
            }

            default -> {
                System.out.println("Invalid selection.");
                TicTacToeGame.playerOneReplay(playerNum);
            }
        }
    }

    public static void playerTwoPlay(int playerNum) {

        playerPrompt(playerNum);

        switch (player) {
            case 1 -> {
                if (Objects.equals(game.getSlotValue(0, 0), " ")) {
                    game.setSlotValue(0, 0, "O");
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerTwoReplay(playerNum);
                }
            }

            case 2 -> {
                if (Objects.equals(game.getSlotValue(0, 1), " ")) {
                    game.setSlotValue(0, 1, "O");
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerTwoReplay(playerNum);
                }
            }

            case 3 -> {
                if (Objects.equals(game.getSlotValue(0, 2), " ")) {
                    game.setSlotValue(0, 2, "O");
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerTwoReplay(playerNum);
                }
            }

            case 4 -> {
                if (Objects.equals(game.getSlotValue(1, 0), " ")) {
                    game.setSlotValue(1, 0, "O");
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerTwoReplay(playerNum);
                }
            }

            case 5 -> {
                if (Objects.equals(game.getSlotValue(1, 1), " ")) {
                    game.setSlotValue(1, 1, "O");
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerTwoReplay(playerNum);
                }
            }

            case 6 -> {
                if (Objects.equals(game.getSlotValue(1, 2), " ")) {
                    game.setSlotValue(1, 2, "O");
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerTwoReplay(playerNum);
                }
            }

            case 7 -> {
                if (Objects.equals(game.getSlotValue(2, 0), " ")) {
                    game.setSlotValue(2, 0, "O");
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerTwoReplay(playerNum);
                }
            }

            case 8 -> {
                if (Objects.equals(game.getSlotValue(2, 1), " ")) {
                    game.setSlotValue(2, 1, "O");
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerTwoReplay(playerNum);
                }
            }

            case 9 -> {
                if (Objects.equals(game.getSlotValue(2, 2), " ")) {
                    game.setSlotValue(2, 2, "O");
                } else {
                    System.out.println("Slot already occupied. Select another slot.");
                    playerTwoReplay(playerNum);
                }
            }

            default -> {
                System.out.println("Invalid selection.");
                playerTwoReplay(playerNum);
            }
        }
    }

    public static void playerOneReplay(int playerNum) {
        if(game.checkSlots()) {
            playerOnePlay(playerNum);
        }
    }

    public static void playerTwoReplay(int playerNum) {
        if(game.checkSlots()) {
            playerTwoPlay(playerNum);
        }
    }

    public static void endWinGame (int playerNumber) {
        System.out.printf("""

                Player %d wins! Congratulations!
                Scores: %d - %d

                Go again?
                1. Yes
                2. No
                """, playerNumber, playerOneScore, playerTwoScore);
        int response = optionReader.nextInt();

        switch (response) {
            case  1 -> {
                game.setSlotsEmpty();
                playGame();
            }
            case 2 -> System.out.println("Thank you for playing.\n\nGoodbye!");
        }
    }

    public static void endWinGameVsComputer (int playerNumber) {
        if (playerNumber == 1 || playerNumber == 2) {
            System.out.printf("""

                    Player wins! Congratulations!
                    Scores: %d - %d

                    """, playerScore, computerScore);
        }

        if (playerNumber == 0) {
            System.out.printf("""

                    Computer wins! You lose!
                    Scores: %d - %d

                    """, playerScore, computerScore);
        }

        System.out.println("""
                    Go again?
                    1. Yes
                    2. No
                    """);
        int response = optionReader.nextInt();

        switch (response) {
            case  1 -> {
                game.setSlotsEmpty();
                playingMode(2);
            }
            case 2 -> System.out.println("Thank you for playing.\n\nGoodbye!");
        }
    }

    public static void endNoWinGame () {
        System.out.printf("""

                Game over! No winners this round.
                Scores: %d - %d

                Go again?
                1. Yes
                2. No
                """, playerOneScore, playerTwoScore);
        int response = optionReader.nextInt();

        switch (response) {
            case  1 -> {
                game.setSlotsEmpty();
                playGame();
            }
            case 2 -> System.out.println("Thank you for playing.\n\nGoodbye!");
        }
    }

    public static void endNoWinGameVsComputer (int player1, int player2) {

        if (player1 == 1) {
            System.out.printf("""

                    Game over! No winners this round.
                    Scores: %d - %d

                    """, playerScore, computerScore);
        }

        if (player2 == 2) {
            System.out.printf("""

                    Game over! No winners this round.
                    Scores: %d - %d

                    """, computerScore, playerScore);
        }

        System.out.println("""
                    Go again?
                    1. Yes
                    2. No
                    """);
        int response = optionReader.nextInt();

        switch (response) {
            case  1 -> {
                game.setSlotsEmpty();
                playGameVsComp(player1, player2);
            }
            case 2 -> System.out.println("Thank you for playing.\n\nGoodbye!");
        }
    }


}
