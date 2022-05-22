package chapter3;

import java.time.LocalDate;

public class HeartRates {

    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private String monthOfBirth;
    private String dayOfBirth;

    public HeartRates(String firstName, String lastName, int yearOfBirth, String monthOfBirth, String dayOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public int userAge() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        return currentYear - yearOfBirth;
    }

    public int maxHeartRate() {
        int age = userAge();
        return 220 - age;
    }

    public int minTargetHeartRate() {
        int maxRate = maxHeartRate();
        return maxRate * 50 / 100;
    }

    public int maxTargetHeartRate() {
        int maxRate = maxHeartRate();
        return maxRate * 85 / 100;
    }
}
