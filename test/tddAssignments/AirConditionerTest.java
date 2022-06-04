package tddAssignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {

    @Test
    public void NewAirConditionerTurnedOn() {
        AirConditioner sanyo = new AirConditioner();

        sanyo.setOn(true);

        assertEquals(true, sanyo.getAcStatus());

    }

    @Test
    public void NewAirConditionerTurnedOff() {
        AirConditioner sanyo = new AirConditioner();

        sanyo.setOn(false);

        assertEquals(false, sanyo.getAcStatus());

    }

    @Test
    public void NewAirConditionerTempIncrease() {
        AirConditioner sanyo = new AirConditioner();

        sanyo.setOn(true);

        sanyo.increaseTemperature();
        sanyo.increaseTemperature();
        sanyo.increaseTemperature();
        sanyo.increaseTemperature();

        assertEquals(20, sanyo.getTemperature());

    }

    @Test
    public void NewAirConditionerTempDecrease() {
        AirConditioner sanyo = new AirConditioner();

        sanyo.setOn(true);

        sanyo.increaseTemperature();
        sanyo.increaseTemperature();
        sanyo.increaseTemperature();
        sanyo.increaseTemperature();

        sanyo.decreaseTemperature();
        sanyo.decreaseTemperature();

        assertEquals(18, sanyo.getTemperature());
    }

    @Test
    public void NewAirConditionerTempIncreaseLimit() {
        AirConditioner sanyo = new AirConditioner();

        sanyo.setOn(true);
        sanyo.increaseTemperature();
        sanyo.increaseTemperature();
        sanyo.increaseTemperature();
        sanyo.increaseTemperature();
        sanyo.increaseTemperature();
        sanyo.increaseTemperature();
        sanyo.increaseTemperature();
        sanyo.increaseTemperature();
        sanyo.increaseTemperature();
        sanyo.increaseTemperature();
        sanyo.increaseTemperature();
        sanyo.increaseTemperature();
        sanyo.increaseTemperature();
        sanyo.increaseTemperature();
        sanyo.increaseTemperature();
        sanyo.increaseTemperature();

        assertEquals(30, sanyo.getTemperature());
    }

    @Test
    public void NewAirConditionerTempDecreaseLimit() {
        AirConditioner sanyo = new AirConditioner();

        sanyo.setOn(true);

        sanyo.increaseTemperature();
        sanyo.increaseTemperature();
        sanyo.increaseTemperature();
        sanyo.increaseTemperature();

        sanyo.decreaseTemperature();
        sanyo.decreaseTemperature();
        sanyo.decreaseTemperature();
        sanyo.decreaseTemperature();
        sanyo.decreaseTemperature();
        sanyo.decreaseTemperature();
        sanyo.decreaseTemperature();

        assertEquals(16, sanyo.getTemperature());

    }
}
