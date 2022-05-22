package classwork;/*
Pseudocode For 'Pass or Fail' App

Start.
Ask user to input a score.
Check if score is equal to or greater than 55.
	If score is equal to or greater than 55,
	    Output "Pass".
	If score is less than 55,
	    Output "Fail".
End.

 */

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {

        Scanner score = new Scanner(System.in);

        System.out.println("Enter a score: ");
        int userScore = score.nextInt();

        if(userScore >= 55) {
            System.out.println("Pass");
        }
        if(userScore < 55) {
            System.out.println("Fail");
        }
    }
}
