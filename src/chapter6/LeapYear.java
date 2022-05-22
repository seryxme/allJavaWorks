import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner yearReader = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = yearReader.nextInt();

        leapYear(year);
    }

    public static void leapYear(int year) {
        if (year % 4 == 0) System.out.println(year + " is a leap year.\n");
        else System.out.println(year + " is not a leap year.\n");
    }
}
