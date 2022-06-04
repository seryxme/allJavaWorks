package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerTest {

    @Test
    public void resellerTDTest1() {
        TestDriller costing = new TestDriller();
        int price = costing.totalCost(3);
        assertEquals(6000, price);
    }

    @Test
    public void resellerTDTest2() {
        TestDriller costing = new TestDriller();
        int price = costing.totalCost(5);
        assertEquals(9000, price);
    }

    @Test
    public void resellerTDTest3() {
        TestDriller costing = new TestDriller();
        int price = costing.totalCost(15);
        assertEquals(24000, price);
    }

    @Test
    public void resellerTDTest4() {
        TestDriller costing = new TestDriller();
        int price = costing.totalCost(40);
        assertEquals(60000, price);
    }

    @Test
    public void resellerTDTest5() {
        TestDriller costing = new TestDriller();
        int price = costing.totalCost(50);
        assertEquals(65000, price);
    }

    @Test
    public void resellerTDTest6() {
        TestDriller costing = new TestDriller();
        int price = costing.totalCost(100);
        assertEquals(120000, price);
    }

    @Test
    public void resellerTDTest7() {
        TestDriller costing = new TestDriller();
        int price = costing.totalCost(200);
        assertEquals(220000, price);
    }

    @Test
    public void resellerTDTest8() {
        TestDriller costing = new TestDriller();
        int price = costing.totalCost(500);
        assertEquals(500000, price);
    }
}
