package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstructionMod {

    private static int firstNum;
    private static int secondNum;

    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final Scanner answerReader = new Scanner(System.in);

    public static void main(String[] args) {

        multiplicationQuestions();

    }

    public static void multiplicationQuestions() {
        firstNum = 1 + randomNumbers.nextInt(9);
        secondNum = 1 + randomNumbers.nextInt(9);

        System.out.printf("How much is %d times %d?%n", firstNum, secondNum);
        int answer = answerReader.nextInt();

        while (!checkAnswer(answer)) {
            System.out.printf("How much is %d times %d?%n", firstNum, secondNum);
            answer = answerReader.nextInt();
        }
    }

    public static boolean checkAnswer(int answer) {
        boolean b = false;

        int product = firstNum * secondNum;

        int response = 1 + randomNumbers.nextInt(4);

        if (answer == product) {
            b = true;

            switch (response) {
                case 1 -> {
                    System.out.println("\nVery good!\n");
                    multiplicationQuestions();
                }
                case 2 -> {
                    System.out.println("\nExcellent!\n");
                    multiplicationQuestions();
                }
                case 3 -> {
                    System.out.println("\nNice Work!\n");
                    multiplicationQuestions();
                }
                case 4 -> {
                    System.out.println("\nKeep up the good work!\n");
                    multiplicationQuestions();
                }
            }

        } else {
            switch (response) {
                case 1 -> {
                    System.out.println("\nNo. Please try again.\n");
                }
                case 2 -> {
                    System.out.println("\nWrong. Try once more.\n");
                }
                case 3 -> {
                    System.out.println("\nNo. Keep trying.\n");
                }
                case 4 -> {
                    System.out.println("\nDon't give up. Try again.\n");
                }
            }

        }

        return b;
    }
}
