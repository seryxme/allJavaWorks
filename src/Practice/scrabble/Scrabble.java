package Practice.scrabble;

import java.util.Arrays;
import java.util.Objects;

import static Practice.scrabble.ScoreModifiers.*;

public class Scrabble {
    private final String[][] gameBoard = new String[15][15];
    private TilesBag tilesBag;
    private final ScoreModifiers scoreModifiers = GAME_START;
    private String[] playerOneTiles = new String[7];

    public Scrabble() {
        tilesBag = new TilesBag();
    }

    public void setSlotValue(int index1, int index2, String value) {
        if (Objects.equals(gameBoard[index1][index2], "     ") ||
                Objects.equals(gameBoard[index1][index2], "START") ||
                Objects.equals(gameBoard[index1][index2], " DLS ") ||
                Objects.equals(gameBoard[index1][index2], " TLS ") ||
                Objects.equals(gameBoard[index1][index2], " DWS ") ||
                Objects.equals(gameBoard[index1][index2], " TWS ")) {
            gameBoard[index1][index2] = value;
        } else {
            System.out.println("Slot already occupied.");
        }
    }

    public void displayBoard() {
        setSlotsEmpty();
        defaultSlots(GAME_START);
        defaultSlots(DOUBLE_LETTER_SCORE);
        defaultSlots(TRIPLE_LETTER_SCORE);
        defaultSlots(DOUBLE_WORD_SCORE);
        defaultSlots(TRIPLE_WORD_SCORE);
        System.out.println("+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");

        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 15; j++) {
                System.out.printf("|%s", getSlotValue(i,j));
            }
            System.out.println("|\n+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
        }
    }

    public void selectTiles() {
        int tilesToReplace = 0;
        for (String tile : playerOneTiles) {
            if (tile == null) tilesToReplace++;
        }
        for (int i = 0; i < tilesToReplace; i++) {
            playerOneTiles[i] = Character.toString(tilesBag.getLetters(tilesToReplace)[i]);
        }
    }

    public void showPlayerTiles() {
        System.out.println(Arrays.deepToString(playerOneTiles));
    }

    private void defaultSlots(ScoreModifiers modifiersEnum) {
        switch (modifiersEnum) {
            case GAME_START -> setSlotValue(7, 7, "START");
            case DOUBLE_LETTER_SCORE -> {
                setSlot(0, 3, " DLS ");
                setSlot(0, 11, " DLS ");
                setSlot(2, 6, " DLS ");
                setSlot(2, 8, " DLS ");
                setSlot(3, 0, " DLS ");
                setSlot(3, 7, " DLS ");
                setSlot(3, 14, " DLS ");
                setSlot(6, 2, " DLS ");
                setSlot(6, 6, " DLS ");
                setSlot(6, 8, " DLS ");
                setSlot(6, 12, " DLS ");
                setSlot(7, 3, " DLS ");
                setSlot(7, 11, " DLS ");
                setSlot(8, 2, " DLS ");
                setSlot(8, 6, " DLS ");
                setSlot(8, 8, " DLS ");
                setSlot(8, 12, " DLS ");
                setSlot(11, 7, " DLS ");
                setSlot(11, 0, " DLS ");
                setSlot(12, 6, " DLS ");
                setSlot(12, 8, " DLS ");
                setSlot(11, 14, " DLS ");
                setSlot(14, 3, " DLS ");
                setSlot(14, 11, " DLS ");
            }
            case DOUBLE_WORD_SCORE -> {
                for(int i = 1; i < 14; i++) {
                    if (i > 4 && i < 10) {
                        continue;
                    }
                    setSlot(i, i, " DWS ");
                    setSlot(i, 14-i, " DWS ");
                }
            }
            case TRIPLE_LETTER_SCORE -> {
                setSlot(1, 5, " TLS ");
                setSlot(1, 9, " TLS ");
                setSlot(5, 1, " TLS ");
                setSlot(5, 5, " TLS ");
                setSlot(5, 9, " TLS ");
                setSlot(5, 13, " TLS ");
                setSlot(9, 1, " TLS ");
                setSlot(9, 5, " TLS ");
                setSlot(9, 9, " TLS ");
                setSlot(9, 13, " TLS ");
                setSlot(13, 5, " TLS ");
                setSlot(13, 9, " TLS ");
            }
            case TRIPLE_WORD_SCORE -> {
                setSlot(0, 0, " TWS ");
                setSlot(0, 7, " TWS ");
                setSlot(0, 14, " TWS ");
                setSlot(7, 0, " TWS ");
                setSlot(7, 14, " TWS ");
                setSlot(14, 0, " TWS ");
                setSlot(14, 7, " TWS ");
                setSlot(14, 14, " TWS ");
            }
        }
    }

    public void setSlot(int row, int col, String value) {
        gameBoard[row][col] = value;
    }

    public void setSlotsEmpty() {
        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 15; j++) {
                gameBoard[i][j] = "     ";
            }
        }
    }

    public String getSlotValue(int index1, int index2) {
        return gameBoard[index1][index2];
    }

    public boolean checkSlots() {

        boolean b = false;
        for(int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (Objects.equals(getSlotValue(i, j), "     ")) {
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
}
