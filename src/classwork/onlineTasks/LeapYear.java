package classwork.onlineTasks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = scan.nextInt();
        System.out.println(is_leap(year));
    }

    public static boolean is_leap(int year) {
        boolean leap = false;
        if (1900 <= year && year <= 10_000) {
            if (year % 100 == 0 && year % 400 == 0) leap = true;
            else if (year % 4 == 0) {
                if (year % 100 == 0 && year % 400 != 0) {
                    leap = false;
                } else leap = true;
            }
        }

        return leap;
    }

}
