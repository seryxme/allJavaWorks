package chapter4;//Exercise 4.32

import java.util.Scanner;

public class BinaryToDecimalConverter {
    public static void main(String[] args) {

        Scanner binaryReader = new Scanner(System.in);

        System.out.println("Enter a binary number: ");
        long binaryNumber = binaryReader.nextLong();

        long binary = binaryNumber;
        double decimalEquivalent = 0;
        int counter = 0;

        while(binaryNumber > 0) {
            long remainder = binaryNumber % 10;
            decimalEquivalent += (remainder * Math.pow(2, counter));
            counter++;
            binaryNumber = (binaryNumber - remainder)/10;
        }
        System.out.printf("%d in binary is equivalent to %.0f in decimal.", binary, decimalEquivalent);
    }

}
