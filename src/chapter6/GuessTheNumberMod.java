package chapter6;

import java.util.Scanner;

public class GuessTheNumberMod {
    public static void main(String[] args) {

        Scanner numberReader = new Scanner(System.in);

        int randomNumber = (int) (1 + Math.random() * 1000);

        System.out.print("Guess the number between 1 and 1000: ");
        int userGuess = numberReader.nextInt();

        int guessCounter = 1;

        while(userGuess != randomNumber) {
            if (userGuess > randomNumber) {
                System.out.println("Too high. Try again.");
            }
            else System.out.println("Too low. Try again.");

            ++guessCounter;

            userGuess = numberReader.nextInt();
        }
        System.out.println("Congratulations! You guessed the number in " + guessCounter + " guesses.");

        if (guessCounter < 10) {
            System.out.println("It's either you know the secret or you got lucky!");
        }
        else if (guessCounter == 10) {
            System.out.println("Aha! You know the secret!");
        }
        else System.out.println("You should be able to do better!");
    }
}
