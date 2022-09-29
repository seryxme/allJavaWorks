package chapter7;

import java.security.SecureRandom;
import java.util.Scanner;

public class AirlineReservation {
    private static boolean[] seatingChart = new boolean[10];
    private static String passengerName;
    private static String airline;
    private static String sectionName;

    private static final SecureRandom seatSelector = new SecureRandom();

    private static final Scanner dataReader = new Scanner(System.in);

    public static void main(String[] args) {

        airline = "Seryx Airline";

        reservation();

    }

    public static void reservation() {
        System.out.printf("\nWelcome to %s.\nPlease enter your name: ", airline);
        passengerName = dataReader.nextLine();

        System.out.println("""
                Please select your preferred section:
                1. First Class
                2. Economy
                """);
        int sectionChoice = dataReader.nextInt();

        if (sectionChoice == 1) selectFirstClassSeat();
        else if (sectionChoice == 2) selectEconomySeat();
        else {
            System.out.println("invalid input, Default to Economy");
            selectEconomySeat();
        }
    }

    public static boolean checkFirstClass() {
        boolean seatState = true;
        for (int i = 0; i < 5; i++) {
            seatState = seatingChart[i];
            if (!seatState) break;
        }

        return seatState;
    }

    public static void selectFirstClassSeat() {
        sectionName = "First Class";
        if (!checkFirstClass()) {
            int seat = 1 + seatSelector.nextInt(5);
            if (!seatingChart[seat - 1]) {
                seatingChart[seat - 1] = true;
                boardingPass(seat, sectionName);
            }
            else {
                selectFirstClassSeat();
            }

        }
        else {
            if (!checkEconomy()) {
                System.out.printf("""
                        The %s section is full. Would you mind booking Economy?
                        1. Yes
                        2. No
                        """, sectionName);
                int response = dataReader.nextInt();
                while (response != 1 && response != 2) {
                    System.out.println("Invalid selection.\n");
                    System.out.printf("""
                        The %s section is full. Would you mind booking Economy?
                        1. Yes
                        2. No
                        """, sectionName);
                    response = dataReader.nextInt();
                }
                if (response == 1) selectEconomySeat();
                else if (response == 2) System.out.println("Next flight leaves in 3 hours.");
                else {
                    System.out.println("Invalid choice");
                    selectFirstClassSeat();
                }
            }
            else System.out.println("All seats are fully booked. Next flight leaves in 3 hours.");
        }
    }

    public static boolean checkEconomy() {
        boolean seatState = true;
        for (int i = 5; i < 10; i++) {
            seatState = seatingChart[i];
            if (!seatState) break;
        }

        return seatState;
    }

    private static void selectEconomySeat() {
        sectionName = "Economy";
        if (!checkEconomy()) {
            int seat = 6 + seatSelector.nextInt(5);
            if (!seatingChart[seat - 1]) {
                seatingChart[seat - 1] = true;
                boardingPass(seat, sectionName);
            }
            else {
                selectEconomySeat();
            }

        }
        else {
            if (!checkFirstClass()) {
                System.out.printf("""
                        The %s section is full. Would you mind booking First Class?
                        1. Yes
                        2. No
                        """, sectionName);
                int response = dataReader.nextInt();
                while (response != 1 && response != 2) {
                    System.out.println("Invalid selection.\n");
                    System.out.printf("""
                        The %s section is full. Would you mind booking First Class?
                        1. Yes
                        2. No
                        """, sectionName);
                    response = dataReader.nextInt();
                }

                if (response == 1) selectFirstClassSeat();
                else if (response == 2) System.out.println("Next flight leaves in 3 hours.");
                else {
                    System.out.println("Invalid choice");
                    selectEconomySeat();
                }
            }
            else System.out.println("All seats are fully booked. Next flight leaves in 3 hours.");
        }
    }

    public static void boardingPass(int seatNumber, String sectionName) {
        System.out.println("------------------------------------------");
        System.out.printf("BOARDING PASS  %25s%n",
                airline);
        System.out.println("==========================================");
        System.out.printf("Name: %-19sSeat No.: %05d%nSection: %-16sFlight: SRXA001%n",
                passengerName, seatNumber, sectionName);
        System.out.println("------------------------------------------");
        System.out.println();
        System.out.printf("""
                        Would you like to make another reservation?
                        1. Yes
                        2. No
                        """, sectionName);
        int response = dataReader.nextInt();
        dataReader.nextLine();

        while (response != 1 && response != 2) {
            System.out.println("Invalid selection.\n");
            System.out.printf("""                        
                        Would you like to make another reservation?
                        1. Yes
                        2. No
                        """, sectionName);
            response = dataReader.nextInt();
            dataReader.nextLine();
        }
        if (response == 1 && (!checkFirstClass() || !checkEconomy())) reservation();
        if (response == 1 && (checkFirstClass() && checkEconomy())) {
            System.out.println("All seats are fully booked. Next flight leaves in 3 hours.");
        } else System.out.println("Thank you for using Seryx Airline Reservation System. Goodbye.");
    }
}
