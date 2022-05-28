package chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe game;

    @BeforeEach
    void setUp() {
        game = new TicTacToe();
    }

    @Test
    void checkObjectIsInitializedTest() {

        String result = game.getSlotValue(0, 0);
        assertEquals(" ", result);
    }

    @Test
    void checkPlayerOneGameTest() {

        game.setSlotValue(0,0,"X");

        String result = game.getSlotValue(0, 0);
        assertEquals("X", result);

        game.setSlotValue(1,1, "X");
        String result2 = game.getSlotValue(1, 1);
        assertEquals("X", result2);
    }

    @Test
    void checkPlayerTwoGameTest() {

        game.setSlotValue(0,0, "O");
        String result = game.getSlotValue(0, 0);
        assertEquals("O", result);

        game.setSlotValue(1,2,"O");
        String result2 = game.getSlotValue(1, 2);
        assertEquals("O", result2);
    }

    @Test
    void slotOccupiedTest() {

        game.setSlotValue(0,1, "X");

        game.setSlotValue(0,1,"O");

        String result = game.getSlotValue(0, 1);
        assertEquals("X", result);
    }

    @Test
    void slotCheckTest() {

        game.setSlotValue(0,0,  "X");

        game.setSlotValue(1,1,"O");

        boolean gameState = game.checkSlots();

        assertTrue(gameState);
    }

    @Test
    void slotsFilledCheckTest() {

        game.setSlotValue(0,0,  "X");
        game.setSlotValue(1,0,"O");
        game.setSlotValue(0,1,  "X");
        game.setSlotValue(1,1,"O");
        game.setSlotValue(0,2,  "X");
        game.setSlotValue(1,2,"O");
        game.setSlotValue(2,0,"O");
        game.setSlotValue(2,1,  "X");
        game.setSlotValue(2,2,"O");

        boolean gameState = game.checkSlots();

        assertFalse(gameState);
    }

    @Test
    void checkWinTest() {

        game.setSlotValue(0,0,  "X");
        game.setSlotValue(1,0,"O");
        game.setSlotValue(0,1,  "X");
        game.setSlotValue(1,1,"O");
        game.setSlotValue(0,2,  "X");
        game.setSlotValue(1,2,"O");

        boolean gameState = game.checkSlots();

        assertTrue(gameState);
    }

}