package chapter7;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Objects;

public class TheRace {
    private int tortoisePosition;
    private int harePosition;
    private final String tortoise;
    private final String hare;

    private String[] raceCourse;
    private final SecureRandom random = new SecureRandom();

    public TheRace() {
        tortoise = " T  ";
        hare = " H  ";
        raceCourse = new String[70];
    }

    public void displayCourse() {
        for (int i = 0; i < 35; i++) {
            System.out.print("+----");
        }
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < 35; i++) {
            System.out.printf("%s|", raceCourse[i]);
        }
        System.out.println();
        for (int i = 0; i < 35; i++) {
            System.out.print("+----");
        }
        System.out.println();
        for (int i = 35; i < 70; i++) {
            System.out.print("+----");
        }
        System.out.println();
        System.out.print("|");
        for (int i = 35; i < 70; i++) {
            System.out.printf("%s|", raceCourse[i]);
        }
        System.out.println();
        for (int i = 35; i < 70; i++) {
            System.out.print("+----");
        }

    }

    public void moveTortoise(int position){
        int move = 1 + random.nextInt(10);
        raceCourse[position] = "    ";
        switch (move) {
            case 1,2,3,4,5 -> {
                System.out.println("Tortoise: Fast Plod.");
                tortoisePosition = position + 3;
                if (tortoisePosition > 69) {
                    System.out.println("Finish!");
                    tortoisePosition = 69;
                }
                raceCourse[tortoisePosition] = tortoise;
            }
            case 6,7 -> {
                System.out.println("Tortoise: Slip.");
                tortoisePosition = position - 6;
                if (tortoisePosition < 0) {
                    System.out.println("Back to the Starting Gate.");
                    tortoisePosition = 0;
                }
                raceCourse[tortoisePosition] = tortoise;
            }
            case 8,9,10 -> {
                System.out.println("Tortoise: Slow Plod.");
                tortoisePosition = position + 1;
                if (tortoisePosition > 69) {
                    System.out.println("Finish!");
                    tortoisePosition = 69;
                }
                raceCourse[tortoisePosition] = tortoise;
            }
        }
    }

    public void moveHare(int position){
        raceCourse[position] = "    ";
        int move = 1 + random.nextInt(10);
        switch (move) {
            case 1,2 -> {
                System.out.println("\nHare: Sleep.");
                harePosition = position;
                raceCourse[harePosition] = hare;
            }
            case 3,4 -> {
                System.out.println("\nHare: Big Hop.");
                harePosition = position + 9;
                if (harePosition > 69) {
                    System.out.println("Finish!");
                    harePosition = 69;
                }
                raceCourse[harePosition] = hare;
            }
            case 5 -> {
                System.out.println("\nHare: Big Slip.");
                    harePosition = position - 12;
                    if (harePosition < 0) {
                        System.out.println("Back to the Starting Gate.");
                        harePosition = 0;
                    }
                    raceCourse[harePosition] = hare;
            }
            case 6,7,8 -> {
                System.out.println("\nHare: Small Hop.");
                harePosition = position + 1;
                if (harePosition > 69) {
                    System.out.println("Finish!");
                    harePosition = 69;
                }
                raceCourse[harePosition] = hare;
            }
            case 9,10 -> {
                System.out.println("\nHare: Small Slip.");
                harePosition = position - 2;
                if (harePosition < 0) {
                    System.out.println("Back to the Starting Gate.");
                    harePosition = 0;
                }
                raceCourse[harePosition] = hare;
            }
        }
    }

    public int getTortoisePosition() {
        int index = 0;
        for (int i = 0; i < raceCourse.length; i++) {
            if (Objects.equals(raceCourse[i], tortoise)) {
                index = i;
            }
        }
        return index;
    }

    public int getHarePosition() {
        int index = 0;
        for (int i = 0; i < raceCourse.length; i++) {
            if (Objects.equals(raceCourse[i], hare)) {
                index = i;
            }
        }
        return index;
    }

    public void clearRaceCourse() {
        Arrays.fill(raceCourse, "    ");
    }

    public void setSpot(int index) {
        raceCourse[index] = "OUCH";
    }
}
