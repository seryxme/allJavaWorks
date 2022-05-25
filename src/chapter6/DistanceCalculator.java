package chapter6;

import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {

        Scanner pointReader = new Scanner(System.in);

        System.out.println("Enter coordinates x1 and y1: ");
        double x1 = pointReader.nextDouble();
        double y1 = pointReader.nextDouble();

        System.out.println("Enter coordinates x2 and y2: ");
        double x2 = pointReader.nextDouble();
        double y2 = pointReader.nextDouble();

        System.out.printf("The distance between point(x1, y1) and point(x2, y2) is %.2f.%n", distance(x1, y1, x2, y2));

    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
