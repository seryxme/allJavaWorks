package chapter3;

import java.time.LocalDate;

public class HealthProfile {

    private String firstName;
    private String lastName;
    private String gender;
    private int yearOfBirth;
    private String monthOfBirth;
    private String dayOfBirth;
    private double weightInPounds;
    private double heightInInches;

    public HealthProfile(String firstName, String lastName,
                      String gender, int yearOfBirth, String monthOfBirth,
                      String dayOfBirth, double weightInPounds, double heightInInches) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.weightInPounds = weightInPounds;
        this.heightInInches = heightInInches;
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

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
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

    public void setWeight(double weight) {
        weightInPounds = weight;
    }

    public double getWeight() {
        return weightInPounds;
    }

    public void setHeight(double height) {
        heightInInches = height;
    }

    public double getHeight() {
        return heightInInches;
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

    public double bodyMassIndex() {
        double bmi = weightInPounds * 0.45359237/(heightInInches * 0.0254 * heightInInches *0.0254);
        return bmi;
    }
}
