package tdd;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KataTest {

    @Test
    public void additionTest() {

        Kata calculator = new Kata();
        int result = calculator.add(2,4);
        assertEquals(6, result);
    }

    @Test
    public void subtractionTest() {

        Kata calculator = new Kata();
        int result = calculator.subtract(4, 2);
        assertEquals(2, result);
    }

    @Test
    public void absoluteSubtractionTest() {

        Kata calculator = new Kata();
        int result = calculator.subtract(2, 4);
        assertEquals(2, result);
    }

    @Test
    public void productTest() {

        Kata calculator = new Kata();
        int result = calculator.product(2, 4);
        assertEquals(8, result);
    }

    @Test
    public void quotientTest() {

        Kata calculator = new Kata();
        int result = calculator.quotient(6, 2);
        assertEquals(3, result);
    }

    @Test
    public void zeroQuotientTest() {

        Kata calculator = new Kata();
        int result = calculator.quotient(5, 0);
        assertEquals(0, result);
    }

    @Test
    public void BitFlippingTest_0() {
        Kata bitflipper = new Kata();
        int flip = bitflipper.flipper(0);
        assertEquals(1, flip);
    }

    @Test
    public void BitFlippingTest_1() {
        Kata myBit = new Kata();
        int flip = myBit.flipper(1);
        assertEquals(0, flip);
    }

    @Test
    public void EvenNumbersTest() {
        Kata tester = new Kata();
        String confirmer = tester.numberChecker(10);
        assertEquals("10 is an even number.", confirmer);
    }

    @Test
    public void OddNumbersTest() {
        Kata tester = new Kata();
        String confirmer = tester.numberChecker(19);
        assertEquals("19 is an odd number.", confirmer);
    }

    @Test
    public void CorrectMysteryNumber() {
        Kata mystery = new Kata();
        String guessAnswer = mystery.guess(7);
        assertEquals("Correct!", guessAnswer);
    }

    @Test
    public void TooLowMysteryNumber() {
        Kata mystery = new Kata();
        String guessAnswer = mystery.guess(3);
        assertEquals("Too low.", guessAnswer);
    }

    @Test
    public void TooHighMysteryNumber() {
        Kata mystery = new Kata();
        String guessAnswer = mystery.guess(15);
        assertEquals("Too high.", guessAnswer);
    }

    @Test
    public void FutureInvestmentValue() {
        Kata futures = new Kata();

        double value = futures.futureInvestmentValue(1000.56, 4.25, 1);
        BigDecimal newValue = new BigDecimal(value).setScale(2, RoundingMode.DOWN);
        assertEquals(1043.92, newValue.doubleValue());
    }

    @Test
    public void InterestCalculatorTest() {

        Kata calculator = new Kata();
        double interest = calculator.monthlyInterest(1000.00, 3.5);
        BigDecimal newInterest = new BigDecimal(interest).setScale(4, RoundingMode.UP);
        assertEquals(2.9167, newInterest.doubleValue());
    }

    @Test
    public void DrivingCostTest() {
        Kata costing = new Kata();
        double cost = costing.drivingCost(900.5, 25.5, 3.55);
        BigDecimal newCost = new BigDecimal(cost).setScale(2, RoundingMode.DOWN);
        assertEquals(125.36, newCost.doubleValue());
    }

    @Test
    public void AreaOfTriangleTest() {
        Kata triangle = new Kata();
        double area = triangle.areaOfTriangle(1.5, -3.4, 4.6, 5, 9.5, -3.4);
        BigDecimal newArea = new BigDecimal(area).setScale(2, RoundingMode.DOWN);
        assertEquals(33.6, newArea.doubleValue());
    }

    @Test
    public void BmiCalculatorTest() {
        Kata calc = new Kata();
        double bmi = calc.bmiCalculator(95.5, 50);
        BigDecimal newBmi = new BigDecimal(bmi).setScale(4, RoundingMode.UP);
        assertEquals(26.8573, newBmi.doubleValue());
    }

    @Test
    public void CompoundValueTest() {
        Kata compound = new Kata();
        double value = compound.compoundValue(100);
        BigDecimal newValue = new BigDecimal(value).setScale(2, RoundingMode.DOWN);
        assertEquals(608.81, newValue.doubleValue());
    }

    @Test
    public void ClassGrades() {
        Kata scoreConverter = new Kata();
        String grade = scoreConverter.scoresToGrades(75);
        assertEquals("C", grade);
    }

    @Test
    public void FactorsTest() {
        int numOfFactors = Kata.factorsOf(5);
        assertEquals(2, numOfFactors);

        numOfFactors = Kata.factorsOf(10);
        assertEquals(4, numOfFactors);
    }

    @Test
    public void primeNumberTest() {
        boolean isPrime = Kata.isPrime(5);
        assertTrue(isPrime);
    }

}


