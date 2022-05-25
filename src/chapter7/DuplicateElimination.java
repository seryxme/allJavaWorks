package chapter7;

import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner numberReader = new Scanner(System.in);

        int[] numbers = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        System.out.println("Enter ten numbers between 10 and 100: ");

        for(int counter = 0; counter < numbers.length; counter++) {

            int number = numberReader.nextInt();

            numbers[counter] = number;
        }

        System.out.println("The initial elements of the array are:");

        for (int number : numbers) {
            System.out.printf("%d, ", number);
        }

        duplicateRemover(numbers);

        System.out.println("\n\nThe final elements of the array after removing duplicates are:");

        for (int number : numbers) {
            if (number != -1) {
                System.out.printf("%d, ", number);
            }
        }
    }

    public static void duplicateRemover(int[] array) {
        for(int counter = 0; counter < array.length; counter++) {

            for(int i = counter + 1; i < array.length; i++) {
                if (array[counter] == array[i]) {
                    array[counter] = -1;
                    break;
                }
            }
        }
    }
}
