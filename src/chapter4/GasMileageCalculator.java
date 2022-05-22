package chapter4;//Exercise 4.17
import java.util.Scanner;

public class GasMileageCalculator {
    public static void main(String[] args) {

        Scanner dataReader = new Scanner(System.in);
        double totalMilesPerGallon = 0;
        int counter = 0;

        System.out.println("Enter the miles driven for the trip or 0 to quit: ");
        double milesDriven = dataReader.nextInt();

        System.out.println("Enter the gallons used for the trip or 0 to quit: ");
        double gallonsUsed = dataReader.nextInt();

        while (milesDriven != 0 && gallonsUsed != 0) {
            double milesPerGallon = (milesDriven / gallonsUsed);
            System.out.printf("The miles per gallon for this trip is %.2fmpg.%n", milesPerGallon);

            totalMilesPerGallon = totalMilesPerGallon + milesPerGallon;
            counter = counter + 1;

            System.out.println("Enter the miles driven for the trip or 0 to quit: ");
            milesDriven = dataReader.nextInt();

            System.out.println("Enter the gallons used for the trip or 0 to quit: ");
            gallonsUsed = dataReader.nextInt();
        }
        if (counter != 0) {
            double averageMilesPerGallon = totalMilesPerGallon / counter;
            System.out.printf("The average miles per gallon used for %d trips is %.2fmpg", counter, averageMilesPerGallon);
        }



    }
}
