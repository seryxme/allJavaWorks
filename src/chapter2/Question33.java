package chapter2;

import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {

        Scanner mass = new Scanner(System.in);

        System.out.println("Enter your weight in kilograms: ");
        float weightInKilograms = mass.nextFloat();

        System.out.println("Enter your height in meters: ");
        float heightInMeters = mass.nextFloat();

        float bmi = weightInKilograms/(heightInMeters * heightInMeters);

        System.out.printf("Your body mass index is %f%n%n", bmi);
        System.out.println("BMI Categories: \nUnderweight = <18.5 \nNormal weight = 18.5 - 24.9 \nOverweight = 25 - 29.9 \nObesity = BMI of 30 or greater");
    }
}
