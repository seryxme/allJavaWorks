package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOddTest {

    @Test
    public void EvenNumbersTest() {
        EvenOdd tester = new EvenOdd();
        String confirmer = tester.numberChecker(10);
        assertEquals("10 is an even number.", confirmer);
    }

    @Test
    public void OddNumbersTest() {
        EvenOdd tester = new EvenOdd();
        String confirmer = tester.numberChecker(19);
        assertEquals("19 is an odd number.", confirmer);
    }

}
