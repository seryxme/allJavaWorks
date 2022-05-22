package chapter4;//Exercise 4.39 - Decryption

import java.util.Scanner;

public class DecryptionKey {
    public static void main(String[] args) {

        Scanner dataReader = new Scanner(System.in);

        System.out.println("Enter your encrypted data: ");
        int encryptedData = dataReader.nextInt();

        int lastDigit = encryptedData % 10;
        int thirdDigit = ((encryptedData % 100) - lastDigit) / 10;
        int secondDigit = (((encryptedData % 1000) - thirdDigit * 10) - lastDigit)/100;
        int firstDigit = ((((encryptedData % 10000) - secondDigit * 100) - thirdDigit * 10) - lastDigit)/1000;

        int originalThirdDigit = 10 + firstDigit - 7;
        int originalLastDigit = 10 + secondDigit - 7;
        int originalFirstDigit = 10 + thirdDigit - 7;
        int originalSecondDigit = 10 + lastDigit - 7;

        int decryptedData = (originalFirstDigit * 1000) + (originalSecondDigit * 100) + (originalThirdDigit * 10) +
                (originalLastDigit);

        System.out.printf("Your decrypted data is %04d", decryptedData);

    }
}
