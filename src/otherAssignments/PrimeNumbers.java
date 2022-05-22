package otherAssignments;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String... args) {

        Scanner numberReader = new Scanner(System.in);

        System.out.println("Enter a positive number: ");
        int number = numberReader.nextInt();

        int counter = 2;

        if (number == 0 || number == 1) {
            System.out.println("This is not a prime number.");
        }

        if (number == 2 || number == 3) {
            System.out.println("This is a prime number.");
        }

        while (counter < number) {
            if (number % counter == 0) {
                System.out.println("This is not a prime number.");
                break;
            }
            counter++;
            if (counter == number - 1) {
                System.out.println("This is a prime number.");
                break;
            }
        }

    }
}
