package chapter2;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner geom = new Scanner(System.in);

        System.out.print("Enter three points for triangle: ");
        double x1 = geom.nextDouble();
        double y1 = geom.nextDouble();
        double x2 = geom.nextDouble();
        double y2 = geom.nextDouble();
        double x3 = geom.nextDouble();
        double y3 = geom.nextDouble();

        double side1 = Math.sqrt(((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
        double side2 = Math.sqrt(((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2)));
        double side3 = Math.sqrt(((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3)));

        double s = (side1 + side2 + side3) / 2;

        double s1 = s * (s - side1) * (s - side2) * (s - side3);

        double areaOfTriangle = Math.sqrt(s1);

        System.out.printf("The area of the triangle is %.1f", areaOfTriangle);

    }
}
