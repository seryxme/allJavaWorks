package tddAssignments;

public class AutomaticBike {

    private boolean status;
    private int speed;
    private int gear;

    public void setOn(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }

    public void acceleration() {

        if (speed > 40) {
            this.speed = this.speed + 4;
            gear = 4;
        }

        if (speed < 41) {
            if (speed > 30) {
                this.speed = this.speed + 3;
                gear = 3;
            }
        }
        if (speed < 31) {
            if (speed > 20) {
                this.speed = this.speed + 2;
                gear = 2;
            }
            if (speed < 21) {
                this.speed = this.speed + 1;
                gear = 1;
            }
        }

    }

    public void deceleration() {

        if (speed == 0) {
            gear = 0;
        }

        if (speed > 0) {
            if (speed < 21) {
                this.speed = this.speed - 1;
                gear = 1;
            }
        }
        if (speed > 20) {
            if (speed < 31) {
                this.speed = this.speed - 2;
                gear = 2;
            }
        }

        if (speed > 30) {
            if (speed < 41) {
                this.speed = this.speed - 3;
                gear = 3;
            }
            if (speed > 40) {
                this.speed = this.speed - 4;
                gear = 4;
            }
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }
}
