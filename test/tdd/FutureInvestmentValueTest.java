package tdd;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FutureInvestmentValueTest {
    @Test
    public void FutureInvestmentValue() {
        FutureInvestment futures = new FutureInvestment();

        double value = futures.futureInvestmentValue(1000.56, 4.25, 1);
        BigDecimal newValue = new BigDecimal(value).setScale(2, RoundingMode.DOWN);
        assertEquals(1043.92, newValue.doubleValue());
    }
}
