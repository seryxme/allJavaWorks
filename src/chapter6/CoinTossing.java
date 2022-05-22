package chapter6;

import java.util.Scanner;

public class CoinTossing {
    private enum Coin {HEAD, TAIL};

    private static int HEAD = 0;
    private static int TAIL = 0;
    //private static int headCount = 0;
    //private static int tailCount = 0;


    public static void main(String[] args) {

        Scanner coinTosser = new Scanner(System.in);

        System.out.println("1. Toss Coin\n0. Exit");
        int userResponse = coinTosser.nextInt();

        while(userResponse == 1) {

            flip();

            System.out.println("Heads: " + HEAD + "\nTails: " + TAIL);
            System.out.println("1. Toss Coin\n0. Exit");
            userResponse = coinTosser.nextInt();
        }
        System.out.println("Game ended.");
        System.out.println("Heads: " + HEAD + "\nTails: " + TAIL);
    }

    public static int flip() {

        int tossNum = (int) (1 + Math.random() * 2);
        switch(tossNum) {
            case 1 -> ++HEAD;
            case 2 -> ++TAIL;
        }

        return HEAD + TAIL;
    }
}
