package tddAssignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {

    @Test

    public void BikeOnTest() {

        AutomaticBike raleigh = new AutomaticBike();

        raleigh.setOn(true);

        assertEquals(true, raleigh.getStatus());

    }

    @Test

    public void BikeOffTest() {

        AutomaticBike raleigh = new AutomaticBike();

        raleigh.setOn(true);
        raleigh.setOn(false);

        assertEquals(false, raleigh.getStatus());

    }

    @Test
    public void BikeGearTest() {

        AutomaticBike raleigh = new AutomaticBike();
        raleigh.setOn(true);

        assertEquals(0, raleigh.getGear());
    }

    @Test

    public void BikeAccelerationInGear1Test() {

        AutomaticBike raleigh = new AutomaticBike();

        raleigh.setOn(true);

        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();

        assertEquals(20, raleigh.getSpeed());

    }

    @Test
    public void AccelerationBikeGear1ChangeTest() {

        AutomaticBike raleigh = new AutomaticBike();

        raleigh.setOn(true);

        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();

        assertEquals(1, raleigh.getGear());

    }

    @Test
    public void BikeAccelerationInGear2Test() {

        AutomaticBike raleigh = new AutomaticBike();

        raleigh.setOn(true);

        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();


        assertEquals(29, raleigh.getSpeed());

    }

    @Test
    public void AccelerationBikeGear2ChangeTest() {

        AutomaticBike raleigh = new AutomaticBike();

        raleigh.setOn(true);

        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();

        assertEquals(2, raleigh.getGear());

    }
    @Test
    public void BikeAccelerationInGear3Test() {

        AutomaticBike raleigh = new AutomaticBike();

        raleigh.setOn(true);

        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();

        assertEquals(40, raleigh.getSpeed());

    }

    @Test
    public void AccelerationBikeGear3ChangeTest() {

        AutomaticBike raleigh = new AutomaticBike();

        raleigh.setOn(true);

        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();

        assertEquals(3, raleigh.getGear());

    }

    @Test
    public void BikeAccelerationInGear4Test() {

        AutomaticBike raleigh = new AutomaticBike();

        raleigh.setOn(true);

        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();

        assertEquals(51, raleigh.getSpeed());

    }

    @Test
    public void AccelerationBikeGear4ChangeTest() {

        AutomaticBike raleigh = new AutomaticBike();

        raleigh.setOn(true);

        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();

        assertEquals(4, raleigh.getGear());

    }

    @Test
    public void BikeDecelerationInGear4Test() {

        AutomaticBike raleigh = new AutomaticBike();

        raleigh.setOn(true);

        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();

        assertEquals(39, raleigh.getSpeed());

    }

    @Test
    public void DecelerationBikeGear3ChangeTest() {
        AutomaticBike raleigh = new AutomaticBike();

        raleigh.setOn(true);

        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();

        assertEquals(3, raleigh.getGear());
    }

    @Test
    public void BikeDecelerationInGear3Test() {

        AutomaticBike raleigh = new AutomaticBike();

        raleigh.setOn(true);

        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();

        assertEquals(30, raleigh.getSpeed());
    }

    @Test
    public void DecelerationBikeGear2ChangeTest() {

        AutomaticBike raleigh = new AutomaticBike();

        raleigh.setOn(true);

        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();

        assertEquals(2, raleigh.getGear());
    }

    @Test
    public void BikeDecelerationInGear2Test() {

        AutomaticBike raleigh = new AutomaticBike();

        raleigh.setOn(true);

        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();

        assertEquals(20, raleigh.getSpeed());
    }

    @Test
    public void DecelerationBikeGear1ChangeTest() {

        AutomaticBike raleigh = new AutomaticBike();

        raleigh.setOn(true);

        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();

        assertEquals(1, raleigh.getGear());
    }

    @Test
    public void BikeDecelerationInGear1Test() {

        AutomaticBike raleigh = new AutomaticBike();

        raleigh.setOn(true);

        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();

        assertEquals(0, raleigh.getSpeed());
    }

    @Test
    public void DecelerationBikeGear0Test() {

        AutomaticBike raleigh = new AutomaticBike();

        raleigh.setOn(true);

        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.acceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();
        raleigh.deceleration();

        assertEquals(0, raleigh.getGear());

    }

}
