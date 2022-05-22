package chapter6;

import java.util.Scanner;

public class ParkingCharges {
    public static Scanner parkingReader = new Scanner(System.in);

    private static double amount;
    public  static void main(String... args) {

        //System.out.println ("Enter customer name or 'none' to exit: ");
        //String customerName = parkingReader.nextLine();
        int customerNumber = 1;

        System.out.printf("Enter number of parking hours for customer %d or '0' to exit: ", customerNumber);
        int parkingHours = parkingReader.nextInt();
        parkingCharges(parkingHours);
        parkingReader.nextLine();

        double totalAmount = 0;

        while (parkingHours != 0) {

            totalAmount += amount;

            ++customerNumber;

            System.out.printf("Enter number of parking hours for customer %d or '0' to exit: ", customerNumber);
            parkingHours = parkingReader.nextInt();
            parkingCharges(parkingHours);
            parkingReader.nextLine();
        }
        System.out.printf("The total charges for yesterday is $%.2f.%n", totalAmount);


    }
    public static double parkingCharges(int hours) {

        if (hours <= 3) {
            amount = hours * 2.00;
        }
        if (hours > 3) {
            amount = 6.00 + ((hours - 3) * 0.50);
        }
        if (amount > 10.00) {
            amount = 10.00;
        }
        System.out.printf("The charges for %d hours of parking is $%.2f.%n", hours, amount);

        return amount;
    }
}
