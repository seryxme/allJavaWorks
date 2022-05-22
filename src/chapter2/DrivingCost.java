package chapter2;

import java.util.Scanner;

public class DrivingCost {
    public static void main(String[] args) {
        Scanner drive = new Scanner(System.in);

        System.out.println("Enter the driving distance: ");
        float distance = drive.nextFloat();

        System.out.println("Enter miles per gallon: ");
        float efficiency = drive.nextFloat();

        System.out.println("Enter price per gallon: ");
        float price = drive.nextFloat();

        float costOfDriving = price * distance / efficiency;

        System.out.printf("The cost of driving is %.2f", costOfDriving);
    }
}
