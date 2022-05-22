package chapter3;

import java.util.Scanner;

public class HeartRateCalculator {
    public static void main(String[] args) {

        Scanner pump = new Scanner(System.in);

        HeartRates user1 = new HeartRates("Anna", "Bell", 1980, "May", "20th");

        System.out.printf("Give your details like the sample below:%nFirst Name: %s%nLast Name: %s%nYear of Birth: %d%nMonth of birth: %s%nDay of Birth: %s%n%n",
                user1.getFirstName(), user1.getLastName(), user1.getYearOfBirth(), user1.getMonthOfBirth(), user1.getDayOfBirth());

        System.out.print("Enter your first name: ");
        String userFirstName = pump.nextLine();
        user1.setFirstName(userFirstName);

        System.out.print("Enter your last name: ");
        String userLastName = pump.nextLine();
        user1.setLastName(userLastName);

        System.out.printf("Enter year of birth: ");
        int userYearOfBirth = pump.nextInt();
        user1.setYearOfBirth(userYearOfBirth);

        pump.nextLine();

        System.out.print("Enter month of birth: ");
        String userMonthOfBirth = pump.nextLine();
        user1.setMonthOfBirth(userMonthOfBirth);

        System.out.print("Enter day of birth: ");
        String userDayOfBirth = pump.nextLine();
        user1.setDayOfBirth(userDayOfBirth);

        System.out.printf("%nHello, %s %s, born %s of %s, %d. Find your information below:%nAge: %d years" +
                        "%nMaximum Heart Rate: %d%nTarget Heart Rate: %d to %d.%n",
                user1.getFirstName(), user1.getLastName(), user1.getDayOfBirth(), user1.getMonthOfBirth(),
                user1.getYearOfBirth(), user1.userAge(), user1.maxHeartRate(), user1.minTargetHeartRate(),
                user1.maxTargetHeartRate());
    }
}
