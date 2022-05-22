package chapter3;

import java.util.Scanner;

public class TheHealthApp {
    public static void main(String[] args) {
        Scanner pump = new Scanner(System.in);

        HealthProfile user1 = new HealthProfile("Anna", "Bell", "Female",
                1980, "May", "20th", 140.50, 82.00);

        System.out.printf("Give your details like the sample below:%nFirst Name: %s%nLast Name: %s" +
                        "%nGender: %s%nYear of Birth: %d%nMonth of birth: %s%nDay of Birth: %s" +
                        "%nWeight (in pounds): %.2f%nHeight (in inches): %.2f%n%n",
                user1.getFirstName(), user1.getLastName(), user1.getGender(), user1.getYearOfBirth(),
                user1.getMonthOfBirth(), user1.getDayOfBirth(), user1.getWeight(), user1.getHeight());

        System.out.print("Enter your first name: ");
        String userFirstName = pump.nextLine();
        user1.setFirstName(userFirstName);

        System.out.print("Enter your last name: ");
        String userLastName = pump.nextLine();
        user1.setLastName(userLastName);

        System.out.print("Enter your gender: ");
        String userGender = pump.nextLine();
        user1.setGender(userGender);

        System.out.print("Enter year of birth: ");
        int userYearOfBirth = pump.nextInt();
        user1.setYearOfBirth(userYearOfBirth);

        pump.nextLine();

        System.out.print("Enter month of birth: ");
        String userMonthOfBirth = pump.nextLine();
        user1.setMonthOfBirth(userMonthOfBirth);

        System.out.print("Enter day of birth: ");
        String userDayOfBirth = pump.nextLine();
        user1.setDayOfBirth(userDayOfBirth);

        System.out.print("Enter your weight in pounds: ");
        double userWeight = pump.nextDouble();
        user1.setWeight(userWeight);

        System.out.print("Enter your height in inches: ");
        double userHeight = pump.nextDouble();
        user1.setHeight(userHeight);

        System.out.printf("%nHello, %s %s, born %s of %s, %d. Find your information below:" +
                        "%nGender: %s%nAge: %d years%nWeight (in pounds): %.2f%nHeight (in inches): %.2f" +
                        "%nBody Mass Index (BMI): %.1f%nMaximum Heart Rate: %d%nTarget Heart Rate: %d to %d" +
                        "%n%nBMI Categories: %n%nUnderweight = <18.5 %nNormal weight = 18.5 - 24.9 " +
                        "%nOverweight = 25 - 29.9 %nObesity = BMI of 30 or greater%n",
                user1.getFirstName(), user1.getLastName(), user1.getDayOfBirth(), user1.getMonthOfBirth(),
                user1.getYearOfBirth(), user1.getGender(), user1.userAge(), user1.getWeight(),
                user1.getHeight(), user1.bodyMassIndex(),user1.maxHeartRate(), user1.minTargetHeartRate(),
                user1.maxTargetHeartRate());
    }
}
