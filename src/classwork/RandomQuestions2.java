package classwork;

import java.util.Scanner;

public class RandomQuestions2 {
    public static void main(String[] args) {

        Scanner digitReader = new Scanner(System.in);


        System.out.println("How many questions would you like to set as a marker?");
        int numberOfQuestions = digitReader.nextInt();
        int counter = 1;
        int correct = 0;
        int wrong = 0;

        while(correct != numberOfQuestions) {
            char operator = '?';
            int value = 0;
            int a = (int)(1 + (Math.random() * 10));
            int b = (int)(1 + (Math.random() * 10));

            int operatorCount = (int)(1 + (Math.random() * 4));

            switch (operatorCount) {
                case 1 -> {operator = '+'; value = a + b;}
                case 2 -> {operator = '*'; value = a * b;}
                case 3 -> {operator = '/'; value = a / b;}
                case 4 -> {operator = '-'; value = a - b;}
            }

            System.out.println("Question "+ counter +":\n"+ a +" "+ operator +" "+ b + " = ");
            int answer = digitReader.nextInt();

            if (answer == value) {
                ++correct;
            }
            else ++wrong;
            ++counter;
        }

        int totalQuestions = correct + wrong;

        System.out.printf("You got %d correct answers out of %d questions.", correct, totalQuestions);

    }
}