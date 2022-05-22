package chapter4;//Exercise 4.37

import java.util.Scanner;

public class TwoPoints {
    public static void main(String[] args) {

        Scanner coordinateReader = new Scanner(System.in);

        System.out.println("Enter first x coordinate: ");
        int x1 = coordinateReader.nextInt();

        System.out.println("Enter first y coordinate: ");
        int y1 = coordinateReader.nextInt();

        System.out.println("Enter second x coordinate: ");
        int x2 = coordinateReader.nextInt();

        System.out.println("Enter second y coordinate: ");
        int y2 = coordinateReader.nextInt();

        if(x1 == x2) {
            System.out.println("Both points are on a line perpendicular to the x-axis.");
        } else if (y1 == y2) {
            System.out.println("Both points are on a line perpendicular to the y-axis.");
        }
        else System.out.println("Both points are not on a line perpendicular to any axis.");
    }
}
