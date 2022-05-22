package chapter2;

import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {
        Scanner circle = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        int radius = circle.nextInt();

        float pi = 3.14159F;

        System.out.printf("The diameter is %d%n", 2*radius);
        System.out.printf("The circumference of the circle is %f%n", 2*pi*radius);
        System.out.printf("The area of the circle is %f%n", pi*radius*radius);
    }
}
