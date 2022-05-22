package classwork;

import java.util.Scanner;

public class ClassWork {
    private static int firstNumber;
    private static  int secondNumber;
    private static int operator;
    private static int answer;
    private static int userAnswer;
    private static int correct;
    private static int wrong;

    private static final Scanner digitReader = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many questions would you like to answer?");
        int numberOfQuestions = digitReader.nextInt();

        serveQuestion(numberOfQuestions);

        result();

    }

    private static void result() {
        int score = (int) (((double) correct / (correct + wrong)) * 100);
        System.out.printf("Your got %d out of %d correctly.%n", correct, correct+wrong);
        switch (score /10) {
            case 10, 9 -> System.out.println("Excellent!");
            case 8 -> System.out.println("Very Good.");
            case 7 -> System.out.println("Good.");
            case 6 -> System.out.println("Average performance.");
            default -> System.out.println("Not good enough. You need to brush up on your math skills.");
        }
    }

    private static void markQuestion() {
        if (userAnswer == answer) {
            ++correct;
        }
        else ++wrong;
    }

    private static void serveQuestion(int number) {
        int questions = 1;

        while(questions <= number) {
            firstNumber = generateRandomNumber(100);
            secondNumber = generateRandomNumber(100);
            operator = generateOperator();
            System.out.println(firstNumber + " " + (char) operator + " " + secondNumber + " = ");
            userAnswer = digitReader.nextInt();
            ++questions;
            markQuestion();
        }
    }

    private static int generateOperator() {
        int operatorCount = (int)(1 + (Math.random() * 4));

        switch (operatorCount) {
            case 1 -> {operator = '+'; answer = firstNumber + secondNumber;}
            case 2 -> {operator = '*'; answer = firstNumber * secondNumber;}
            case 3 -> {operator = '/'; answer = firstNumber / secondNumber;}
            case 4 -> {operator = '-'; answer = firstNumber - secondNumber;}
        }
        return operator;
    }

    public static int generateRandomNumber(int limit) {
        return (int)(1 + (Math.random() * limit));
    }
}