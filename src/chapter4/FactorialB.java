package chapter4;//Exercise 4.38b

import java.util.Scanner;

public class FactorialB {
    public static void main(String[] args) {

        Scanner integerReader = new Scanner(System.in);

        System.out.println("Enter number of terms: ");
        int numberOfTerms = integerReader.nextInt();

        double e = 1;
        double factorial = 1;
        int c = 1;
        while(c <= numberOfTerms) {
            factorial = factorial * c;
            e = e + (1/factorial);
            c++;
            }
        System.out.println(e);
    }
}
