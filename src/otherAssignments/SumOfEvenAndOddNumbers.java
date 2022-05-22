package otherAssignments;

import java.util.Scanner;

public class SumOfEvenAndOddNumbers {
    public static void main(String... args) {
        Scanner numberReader = new Scanner(System.in);

        System.out.println("Enter any number or enter '0' to exit: ");
        int number = numberReader.nextInt();

        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;

        while (number != 0) {
            if (number % 2 == 0) {
                sumOfEvenNumbers += number;
            }
            if (number % 2 != 0) {
                sumOfOddNumbers += number;
            }
            number = numberReader.nextInt();
        }
        System.out.printf("The sum of even numbers is %d.%n%nThe sume of odd numbers is %d.%n",
                sumOfEvenNumbers, sumOfOddNumbers);
    }
}
