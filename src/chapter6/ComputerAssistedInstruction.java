package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {

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

        if (answer == product) {
            b = true;
            System.out.println("\nVery good!\n");
            multiplicationQuestions();
        } else System.out.println("\nNo. Please try again.\n");

        return b;
    }
}
