package chapter3;

import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {

        Scanner watcher = new Scanner(System.in);

        Clock watch = new Clock(0, 0, 0);

        System.out.printf("Initial clock time is %02d hours, %02d minutes and %02d seconds.%n%n",
                watch.getHour(), watch.getMinute(), watch.getSecond());

        System.out.print("Enter the hour: ");
        int hourNow = watcher.nextInt();
        watch.setHour(hourNow);

        System.out.print("Enter the minute: ");
        int minuteNow = watcher.nextInt();
        watch.setMinute(minuteNow);

        System.out.print("Enter the second: ");
        int secondNow = watcher.nextInt();
        watch.setSecond(secondNow);

        System.out.printf("The set clock time is %02d hours, %02d minutes and %02d seconds.%n%n",
                watch.getHour(), watch.getMinute(), watch.getSecond());

        System.out.printf("The set time is %s", watch.displayTime());
    }
}
