package classwork.hotelmanagementsystem;

import java.util.Objects;
import java.util.Scanner;

public class HotelManagementApp {
    private static final Hotel hotel = new Hotel("New World Hotel", "Yaba, Lagos");
    private static final Scanner optionReader = new Scanner(System.in);

    public static void main(String[] args) {
        appMenu();
    }

    private static void appMenu() {
        System.out.printf("""
                
                WELCOME TO %s
                
                Please login:
                1. Admin
                2. Customer
                0. Exit
                """, hotel.getHotelName().toUpperCase());
        int option = optionReader.nextInt();
        optionReader.nextLine();

        if (option == 1) adminLogin();
        else if (option == 2) customerLogin();
        else if (option == 0) {
            System.out.println("Thank you for using our service.");
            System.exit(0);
        }
        else {
            System.out.println("Invalid selection. Please try again.");
            appMenu();
        }
    }

    private static void adminLogin() {
        System.out.println("Enter your admin passcode: ");
        int passcode = optionReader.nextInt();
        optionReader.nextLine();

        if (passcode > 10000 && passcode <20000) {
            System.out.println("""
                
                Welcome, Admin!
                
                What would you like to do?
                1. Add Room
                2. Register Customer
                3. Check Room Status
                4. View All Rooms
                5. Check Customer Details
                6. View All Customers
                7. Checkout Customer
                0. Exit
                """);
            int option = optionReader.nextInt();
            optionReader.nextLine();

            switch (option) {
                case 1 -> addRoom();
                case 2 -> registerCustomer();
                case 3 -> checkRoom();
                case 4 -> getAllRooms();
                case 5 -> checkCustomer();
                case 6 -> getAllCustomers();
                case 7 -> checkoutCustomer();
                case 0 -> appMenu();
                default -> System.out.println("Invalid selection. Please try again.");
            }
            appMenu();
        }

        System.out.println("Incorrect passcode. Please try again.\n");
        appMenu();
    }

    private static void customerLogin() {
        System.out.println("Enter your email: ");
        String email = optionReader.nextLine();

        for(Customer customer : hotel.getAllCustomers()) {
            if (Objects.equals(customer.getEmail(), email)) {
                System.out.printf("""
                        Welcome, %s!
                                        
                        What would you like to do?
                        1. Book Room
                        2. Check Available Rooms
                        3. View All Rooms
                        0. Exit
                        """, customer.getFullName());
                int option = optionReader.nextInt();
                optionReader.nextLine();

                switch (option) {
                    case 1 -> bookRoom(customer);
                    case 2 -> checkAvailableRooms();
                    case 3 -> getAllRooms();
                    case 0 -> appMenu();
                    default -> System.out.println("Invalid selection. Please try again.");
                }
                appMenu();
            }
        }

        System.out.println("You're not yet registered. Please register.\n");
        registerCustomer();
    }

    private static void registerCustomer() {
        System.out.println("Enter your full name: ");
        String fullName = optionReader.nextLine();

        System.out.println("Enter your phone number: ");
        String phoneNumber = optionReader.nextLine();

        System.out.println("Enter your email address: ");
        String email = optionReader.nextLine();

        Customer customer = new Customer(fullName, phoneNumber, email);

        hotel.addCustomer(customer);

        System.out.println("Customer successfully registered. Please login with your email.");

        customerLogin();
    }

    private static void addRoom() {
        System.out.println("Enter room number: ");
        int roomNumber = optionReader.nextInt();
        optionReader.nextLine();

        System.out.println("Enter room type: ");
        String roomType = optionReader.nextLine();

        Room newRoom = new Room(roomNumber, roomType);

        adminLogin();
    }

    private static void bookRoom(Customer customer) {
        System.out.println("""
                
                Please choose a room:
                1. Single Room
                2. King Suite
                3. Royal Suite
                4. Presidential Suite
                5. Penthouse Suite
                0. Exit
                """);
        int option = optionReader.nextInt();
        optionReader.nextLine();

        switch (option) {
            case 1 -> roomBooking(customer, "Single Room");
            case 2 -> checkAvailableRooms();
            case 3 -> getAllRooms();
            case 0 -> appMenu();
            default -> System.out.println("Invalid selection. Please try again.");
        }
    }

    private static void roomBooking(Customer customer, String roomType) {
        for (Room selectedRoom : hotel.getAllRooms()) {
            if (Objects.equals(selectedRoom.getRoomType(), roomType)) {
                System.out.printf("Please make payment of N%,f: ", selectedRoom.getRoomPrice());
                double amount = optionReader.nextDouble();

                hotel.makePayment(customer, selectedRoom, amount);
                hotel.bookRoom(customer, selectedRoom);
                customerLogin();
            }
        }
        System.out.println("The selected room is unavailable. Please choose another.");
        bookRoom(customer);
    }

    private static void checkRoom() {
    }

    private static void checkAvailableRooms() {
    }

    private static void getAllRooms() {
    }


    private static void getAllCustomers() {
    }

    private static void checkCustomer() {
    }

    private static void checkoutCustomer() {

    }
}
