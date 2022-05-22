package chapter6;

public class HypotenuseCalculations {
    public static void main(String[] args) {

        double side1 = 3.0;
        double side2 = 4.0;

        double hypot = hypotenuse(side1, side2);

        System.out.printf("The hypotenuse for triangle 1 with side lengths 3.0 and 4.0 is = %.1f%n", hypot);

        side1 = 5.0;
        side2 = 12.0;

        hypot = hypotenuse(side1, side2);

        System.out.printf("The hypotenuse for triangle 2 with side lengths 5.0 and 12.0 is = %.1f%n", hypot);

        side1 = 8.0;
        side2 = 15.0;

        hypot = hypotenuse(side1, side2);

        System.out.printf("The hypotenuse for triangle 3 with side lengths 8.0 and 15.0 is = %.1f%n", hypot);

    }


    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
