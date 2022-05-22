package classwork;

import java.util.Scanner;

public class HotelReservationApp {

    private static int userOption = 0;

    private static int  room = 0;
    private static int roomNumber = 0;

    private static final Scanner optionReader = new Scanner(System.in);

    private static final String[] hotelRoom = new String[12];

    public static void main(String[] args) {

        reservationMenu();

    }

    private static void reservationMenu() {
        System.out.println("""
                
                What would you like to do?
                1. Make a reservation.
                2. Check out.
                3. Check room occupancy.
                0. Exit
                """);
        userOption = optionReader.nextInt();
        optionReader.nextLine();

        switch(userOption) {
            case 0 -> appHome();
            case 1 -> makeReservation();
            case 2 -> checkOut();
            case 3 -> checkReservations();
            default -> {
                System.out.println("Invalid option. Try again.\n");
                reservationMenu();
            }
        }
    }

    private static void appHome() {
        System.out.println("Goodbye!\n");

        System.out.println("Press 0 to access reservation menu.");
        userOption = optionReader.nextInt();

        while (userOption != 0) {
            System.out.println("Enter a valid option.\nPress 0 to access reservation menu.");
            userOption = optionReader.nextInt();
        }
        reservationMenu();
    }

    private static void makeReservation() {
        for (room = 0; room < hotelRoom.length; room++) {
            roomNumber = room + 1;

            if (hotelRoom[room] == null) {
                System.out.printf("Room %03d is empty.%n", roomNumber);
                break;
            }
        }
        try {
            System.out.println("Enter customer name to reserve room: ");
            String customerName = optionReader.nextLine();

            hotelRoom[room] = customerName;
        } catch (ArrayIndexOutOfBoundsException newError) {
            System.out.println("\nAll rooms are occupied!");
        }

        reservationMenu();
    }

    private static void checkOut() {

        System.out.println("What room number are you checking out for?");
        roomNumber = optionReader.nextInt();

        hotelRoom[roomNumber-1] = null;
        System.out.printf("Room %03d is now empty.%n%n", roomNumber);

        reservationMenu();
    }

    public static void checkReservations() {
        for (room = 0; room < hotelRoom.length; room++) {
            roomNumber = room + 1;

            if (hotelRoom[room] == null) {
                System.out.printf("Room %03d is empty.%n", roomNumber);
            } else System.out.printf("Room %03d is occupied by %s.%n", roomNumber, hotelRoom[room]);
        }

        reservationMenu();
    }
}

