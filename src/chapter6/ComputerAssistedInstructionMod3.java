package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstructionMod3 {

    private static int firstNum;
    private static int secondNum;

    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final Scanner answerReader = new Scanner(System.in);

    public static void main(String[] args) {
        introToQuestions();
    }

    public static void introToQuestions() {
        System.out.println("How good are you with multiplications?\n\nPress 1 to test your knowledge or 0 to exit.");
        int response = answerReader.nextInt();

        if (response == 1) {
            System.out.println("""
                    Select your difficulty level:
                    1. Level 1
                    2. Level 2
                    3. Level 3
                    """);
            response = answerReader.nextInt();

            multiplicationQuestions(response);

        } else if (response == 0) {
            System.out.println("Good luck. Come back next time.");
        } else {
            System.out.println("Invalid option. Try again.");
            introToQuestions();
        }
    }

    public static void multiplicationQuestions(int level) {
        int correct = 0;
        int wrong = 0;
        int limitValue = (int)Math.pow(10, level) - 1;

        for(int i = 0; i < 10; i++) {
            firstNum = 1 + randomNumbers.nextInt(limitValue);
            secondNum = 1 + randomNumbers.nextInt(limitValue);
            System.out.printf("How much is %d times %d?%n", firstNum, secondNum);
            int answer = answerReader.nextInt();

            if (checkAnswer(answer)) {
                ++correct;
            } else ++wrong;
        }

        if (correct < 7.5) {
            System.out.printf("You got %d correct and %d wrong.%n", correct, wrong);
            System.out.println("Please ask your teacher for extra help. Good luck.\n");

            introToQuestions();
        }
        if (correct > 7.5) {
            System.out.printf("You got %d correct and %d wrong.%n", correct, wrong);
            System.out.println("Congratulations, you are ready to go to the next level!\n");

            introToQuestions();
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
                }
                case 2 -> {
                    System.out.println("\nExcellent!\n");
                }
                case 3 -> {
                    System.out.println("\nNice Work!\n");
                }
                case 4 -> {
                    System.out.println("\nKeep up the good work!\n");
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
