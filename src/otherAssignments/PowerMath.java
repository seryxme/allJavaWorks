package otherAssignments;

import java.util.Scanner;

public class PowerMath {
    public static void main(String... args) {

        Scanner numberReader = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = numberReader.nextInt();
        int num2 = numberReader.nextInt();

        int power = 1;

        int counter = 0;

        if (num2 == 0) {
            power = 1;
        }
        while (counter < num2) {
            power *= num1;
            counter++;
        }
        System.out.printf("%d raised to the power of %d is equal to %d.%n", num1, num2, power);
    }
}
