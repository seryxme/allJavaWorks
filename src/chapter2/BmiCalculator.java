package chapter2;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {

        Scanner mass = new Scanner(System.in);

        System.out.println("Enter your weight in pounds: ");
        double weightInPounds = mass.nextDouble();

        System.out.println("Enter your height in inches: ");
        double heightInInches = mass.nextDouble();

        double bmi = weightInPounds * 0.45359237/(heightInInches * 0.0254 * heightInInches *0.0254);

        System.out.printf("Your body mass index is %.4f%n%n", bmi);
    }
}
