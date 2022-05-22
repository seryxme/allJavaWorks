package chapter4;//Exercise 4.36

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = userInput.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = userInput.nextInt();

        if(firstNumber == secondNumber) {
            System.out.println("0");
        } else if (firstNumber > secondNumber) {
            System.out.println("1");
        }
        else System.out.println("-1");
    }
}
