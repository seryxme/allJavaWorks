package classwork;

import java.util.Scanner;

public class RandomQuestions {
    private static int value;
    private static int a;
    private static int b;
    private static char operator;
    private static int correct;
    private static int wrong;
    public static void main(String[] args) {

        Scanner digitReader = new Scanner(System.in);

        System.out.println("How many questions would you like to answer?");
        int numberOfQuestions = digitReader.nextInt();
        int counter = 1;
        correct = 0;
        wrong = 0;

        while(counter <= numberOfQuestions) {
            randomizer();

            System.out.println("Question "+ counter +":\n"+ a +" "+ operator +" "+ b + " = ");
            int answer = digitReader.nextInt();

            if (answer == value) {
                ++correct;
            }
            else ++wrong;
            ++counter;
        }

        int score = correct - wrong;

        System.out.printf("Your final score is %d.\nYou got %d correct and %d wrong.", score, correct, wrong);
    }

    public static void randomizer() {
        operator = '?';
        value = 0;
        a = (int)(1 + (Math.random() * 10));
        b = (int)(1 + (Math.random() * 10));

        int operatorCount = (int)(1 + (Math.random() * 4));

        switch (operatorCount) {
            case 1 -> {operator = '+'; value = a + b;}
            case 2 -> {operator = '*'; value = a * b;}
            case 3 -> {operator = '/'; value = a / b;}
            case 4 -> {operator = '-'; value = a - b;}
        }
    }
}