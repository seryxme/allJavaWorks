package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BitFlipperTest {

    @Test
    public void BitFlippingTest_0() {
        BitFlipper myBit = new BitFlipper();
        int flip = myBit.flipper(0);
        assertEquals(1, flip);
    }

    @Test
    public void BitFlippingTest_1() {
        BitFlipper myBit = new BitFlipper();
        int flip = myBit.flipper(1);
        assertEquals(0, flip);
    }
}
