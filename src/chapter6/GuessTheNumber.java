package chapter6;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner numberReader = new Scanner(System.in);

        int randomNumber = (int) (1 + Math.random() * 1000);

        System.out.print("Guess the number between 1 and 1000: ");
        int userGuess = numberReader.nextInt();

        while(userGuess != randomNumber) {
            if (userGuess > randomNumber) {
                System.out.println("Too high. Try again.");
            }
            else System.out.println("Too low. Try again.");
            userGuess = numberReader.nextInt();
        }

        System.out.println("Congratulations! You guessed the number.");
    }
}
