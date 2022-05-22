package classwork;

import java.util.Scanner;

/*
Pseudocode for Class Grades

    Start.
    Ask user to input a score.
        If userScore is between 90 and 100.
            Output "A".
        If userScore is greater than or equal to 80 or less than 90.
            Output "B".
        If userScore is greater than or equal to 70 or less than 80.
            Output "C".
        If userScore is greater than or equal to 60 or less than 70.
            Output "D".
        If userScore is less than 60.
            Output "F".
    End.

 */
public class ClassGrades {
    public static void main(String[] args) {

        Scanner scoreInput = new Scanner(System.in);

        System.out.println("Enter a score: ");
        int userScore = scoreInput.nextInt();

        if (userScore <= 100) {
            if (userScore >= 90) {
                System.out.println("A");
            }
        }
        if (userScore < 90) {
            if (userScore >= 80) {
                System.out.println("B");
            }
        }
        if (userScore < 80) {
            if (userScore >= 70) {
                System.out.println("C");
            }
        }
        if (userScore < 70) {
            if (userScore >= 60) {
                System.out.println("D");
            }
        }
        if (userScore < 60) {
                System.out.println("F");
            }
        }
   }

