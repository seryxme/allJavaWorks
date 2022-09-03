package classwork.urlShortenerApp;

import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;

public class URLShortenerApp {

    private static final URLConverter converter = new URLConverter();

    private static final Scanner input = new Scanner(System.in);
    private static final SecureRandom randInt = new SecureRandom();

    public static void main(String[] args) {
        appMain();


    }

    private static void appMain() {
        try {
            System.out.println("""
                    
                    Welcome to the Link Shortener App
                                    
                    What would you like to do?
                    1. Shorten link
                    2. Retrieve link
                    0. Exit
                    """);
            int response = input.nextInt();
            input.nextLine();

            if (response == 1) shortenURL();
            else if (response == 2) recoverURL();
            else System.exit(0);
        } catch (InputMismatchException ex) {
            System.out.println("Invalid selection. Please try again.");
            input.nextLine();
            appMain();
        }
    }


    private static void shortenURL() {
        System.out.println("Please enter your link below: ");
        String longURL = input.nextLine();
        int requestKey = randInt.nextInt(1_000_000_000);
        if (converter.isValidURL(longURL)) {
            converter.addURL(requestKey, longURL);
            System.out.printf("%nHere's your short link: %s%n", converter.getShortURL(converter.getConvertedKey(requestKey)));
        } else {
            System.out.println("Invalid link. Please ensure your link starts with 'http' or 'https'");
            shortenURL();
        }
        appMain();
    }

    private static void recoverURL() {
        System.out.println("Please enter your short link below: ");
        String shortURL = input.nextLine();
        String[] compArray = shortURL.split("/");

        System.out.printf("%nHere's your web link: %s%n", converter.getURL(converter.getKey(compArray[compArray.length - 1])));

        appMain();
    }
}
