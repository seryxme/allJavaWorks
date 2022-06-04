package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MysteryNumberTest {

    @Test
    public void CorrectMysteryNumber() {
        MysteryNumber mystery = new MysteryNumber();
        String guessAnswer = mystery.guess(7);
        assertEquals("Correct!", guessAnswer);
    }

    @Test
    public void TooLowMysteryNumber() {
        MysteryNumber mystery = new MysteryNumber();
        String guessAnswer = mystery.guess(3);
        assertEquals("Too low.", guessAnswer);
    }

    @Test
    public void TooHighMysteryNumber() {
        MysteryNumber mystery = new MysteryNumber();
        String guessAnswer = mystery.guess(15);
        assertEquals("Too high.", guessAnswer);
    }
}
