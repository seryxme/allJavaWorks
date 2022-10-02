package classwork.hotelmanagementsystem;

import java.util.ArrayList;
import java.util.List;
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
            adminMenu();
        }

        System.out.println("Incorrect passcode. Please try again.\n");
        appMenu();
    }

    private static void adminMenu() {
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
            default -> {
                System.out.println("Invalid selection. Please try again.");
                adminMenu();
            }
        }
    }

    private static void customerLogin() {
        System.out.println("Enter your email: ");
        String email = optionReader.nextLine();

        for(Customer customer : hotel.getAllCustomers()) {
            if (Objects.equals(customer.getEmail(), email)) {
                customerMenu(customer);
            }
        }

        System.out.println("You're not yet registered. Please register.\n");
        registerCustomer();
    }

    private static void customerMenu(Customer customer) {
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
            case 2 -> checkAvailableRooms(customer);
            case 3 -> getAllRooms();
            case 0 -> appMenu();
            default -> {
                System.out.println("Invalid selection. Please try again.");
                customerMenu(customer);
            }
        }
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

        System.out.println("Customer successfully registered. Please login again.");

        appMenu();
    }

    private static void addRoom() {
        System.out.println("Enter room number: ");
        int roomNumber = optionReader.nextInt();
        optionReader.nextLine();

        System.out.println("Enter room type: ");
        String roomType = optionReader.nextLine();

        System.out.println("Enter room price: ");
        double roomPrice = optionReader.nextDouble();

        Room newRoom = new Room(roomNumber, roomType, roomPrice);
        hotel.addRoom(newRoom);

        adminMenu();
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
            case 2 -> roomBooking(customer, "King Suite");
            case 3 -> roomBooking(customer, "Royal Suite");
            case 4 -> roomBooking(customer, "Presidential Suite");
            case 5 -> roomBooking(customer, "Penthouse Suite");
            case 0 -> customerMenu(customer);
            default -> System.out.println("Invalid selection. Please try again.");
        }
    }

    private static void roomBooking(Customer customer, String roomType) {
        for (Room selectedRoom : hotel.getAllRooms()) {
            if (Objects.equals(selectedRoom.getRoomType(), roomType)) {
                System.out.printf("Please make payment of N%,.2f: ", selectedRoom.getRoomPrice());
                double amount = optionReader.nextDouble();

                hotel.makePayment(customer, selectedRoom, amount);
                hotel.bookRoom(customer, selectedRoom);
                System.out.println("Room booked successfully.\nDo you want to book another room?\n1. Yes\n2. No");
                int option = optionReader.nextInt();
                if (option == 1) bookRoom(customer);
                else customerMenu(customer);
            }
        }
        System.out.println("The selected room is unavailable. Please choose another.");
        bookRoom(customer);
    }

    private static void checkRoom() {
        System.out.println("Enter Room Number to check room details: ");
        int roomNumber = optionReader.nextInt();
        for(Room foundRoom : hotel.getAllRooms()) {
            if (foundRoom.getRoomNumber() == roomNumber) {
                System.out.println(foundRoom);
                checkRoomOption();
            }
        }
        System.out.println("Room not found.");
        checkRoomOption();
    }

    private static void checkRoomOption() {
        System.out.println("Do you want to check another room?\n1. Yes\n2. No");
        int option = optionReader.nextInt();
        if (option == 1) checkRoom();
        else adminMenu();
    }

    private static void checkAvailableRooms(Customer customer) {
        List<Room> availableRooms = new ArrayList<>();
        for(Room foundRoom : hotel.getAllRooms()) {
            if (foundRoom.isAvailable()) {
                availableRooms.add(foundRoom);
            }
        }

        if (availableRooms.size() != 0) {
            System.out.println("AVAILABLE ROOMS\n");
            for (Room availableRoom : availableRooms) {
                System.out.println(availableRoom);
            }
            customerMenu(customer);
        }
        System.out.println("No available rooms at the moment. Please check back later.");
        customerLogin();

    }

    private static void getAllRooms() {
        for (Room room : hotel.getAllRooms()) {
            System.out.println(room);
        }
        adminMenu();
    }


    private static void getAllCustomers() {
        for (Customer customer : hotel.getAllCustomers()) {
            System.out.println(customer);
        }
        adminMenu();
    }

    private static void checkCustomer() {
        System.out.println("Enter Customer ID: ");
        int customerId = optionReader.nextInt();

        for (Customer customer : hotel.getAllCustomers()) {
            if (customer.getCustomerId() == customerId) {
                System.out.println(customer);
                checkCustomerOption();
            }
        }

        System.out.println("Customer not found.");
        checkCustomerOption();
    }

    private static void checkCustomerOption() {
        System.out.println("Do you want to check another customer?\n1. Yes\n2. No");
        int option = optionReader.nextInt();
        if (option == 1) checkCustomer();
        else adminMenu();
    }

    private static void checkoutCustomer() {

    }
}
