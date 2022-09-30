package classwork.hotelmanagementsystem;

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
    }

    private static void customerLogin() {
    }
}
