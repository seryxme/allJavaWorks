package chapter7;

import java.security.SecureRandom;

public class KnightsTourApp {
    public static void main(String[] args) {
        KnightsTour knight = new KnightsTour();
        SecureRandom randomNumber = new SecureRandom();

        knight.displayBoard();

        int option = 1 + randomNumber.nextInt(8);

        int count = 1;

        try {
            while (option <= 8) {
                if (!knight.knightMoves(option)) {
                    count = 1;
                    while (count <= 8) {
                        if (count == option) count++;
                        else if (!knight.knightMoves(count)) count++;
                        else break;

                        if (count == 8) {
                            System.out.println("No more available moves.");
                            break;
                        }
                    }
                    if (count == 8) {
                        break;
                    }
                }
                knight.displayBoard();

                option = 1 + randomNumber.nextInt(8);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        knight.displayBoard();
        System.out.printf("You made %d moves.", knight.getStepCount());

    }
}
