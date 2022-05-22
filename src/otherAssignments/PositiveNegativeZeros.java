package otherAssignments;

import java.util.Scanner;

public class PositiveNegativeZeros {
    public static void main(String... args) {

        Scanner numberReader = new Scanner(System.in);

        int positiveNum = 0;
        int negativeNum = 0;
        int zeroNum = 0;

        System.out.println("Enter any number between -20 and 20 or '30' to stop: ");
        int number = numberReader.nextInt();

        if (number > 20) {
            System.out.println("Not within range.");
        }
        if (number < -20) {
            System.out.println("Not within range.");
        }

        while (number != 30) {
            if (number > 0) {
                positiveNum++;
            }
            if (number < 0) {
                negativeNum++;
            }
            if (number == 0) {
                zeroNum++;
            }
            number = numberReader.nextInt();
        }
        System.out.printf("The number of positive numbers is %d.%n%nThe number of negative numbers is %d." +
                "%n%nThe number of zeros is %d.%n", positiveNum, negativeNum, zeroNum);
    }
}
