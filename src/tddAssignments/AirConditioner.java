package tddAssignments;

public class AirConditioner {
    private boolean status;
    private int temperature;

    public void setOn(boolean status) {
        this.status = status;
        temperature = 16;
    }

    public boolean getAcStatus() {
        return status;
    }


    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        temperature = temperature + 1;
        if (temperature > 30) {
            temperature = 30;
        }
    }

    public void decreaseTemperature() {
        temperature = temperature - 1;
        if (temperature < 16) {
            temperature = 16;
        }
    }
}
