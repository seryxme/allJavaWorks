package chapter6;

import java.util.Scanner;

public class BeautifyingStrings {
    public static void main(String[] args) {

        Scanner stringReader = new Scanner(System.in);

        System.out.println("Write a sentence: ");
        String statement = stringReader.nextLine();

        beautifyString(statement);

    }

    public static String fullStop(String str) {
        if (str.charAt((int)(str.chars().count() - 1)) != '.') {
            str = str + '.';
        }
        return str;
    }

    public static void caps(String str) {
        String newStr = str.toUpperCase();
        if (str.charAt(0) != newStr.charAt(0)) {
            System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1));
        }
        else System.out.println(str);
    }

    public static void beautifyString(String str) {
        caps(fullStop(str));
    }
}
