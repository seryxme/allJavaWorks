package otherAssignments;

import java.util.Scanner;

public class SumOfNumbersLoop {
    public static void main(String... args) {

        Scanner numberReader = new Scanner(System.in);

        int response = 1;

        do {
            System.out.println("Enter two numbers: ");
            int firstNum = numberReader.nextInt();
            int secondNum = numberReader.nextInt();

            int sum = firstNum + secondNum;

            System.out.println("The sum of both numbers is "+ sum);

            System.out.println("Would you like to perform the operation again? " +
                    "Enter '1' for Yes or '0' for No: ");
            response = numberReader.nextInt();
        }
        while (response != 0);
    }
}
