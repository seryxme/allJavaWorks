package chapter7;

import java.util.Scanner;

public class Turtle {

    private static final TurtleGraphics turtleDraw = new TurtleGraphics();

    private static final Scanner options = new Scanner(System.in);
    public static void main(String[] args) {

        turtleDraw.displayFloor();

        System.out.println("""
                Welcome to Turtle Draw. Use the turtle to draw on the sketch pad.
                
                What would you like to draw?
                1. Square
                2. Diamond
                3. Triangle
                4. Right-Angled Triangle
                """);
        int userOption = options.nextInt();

        switch (userOption) {
            case 1 -> drawSquare();
            case 2 -> drawDiamond();
            case 3 -> drawTriangle();
            case 4 -> drawRightAngledTriangle();
        }
    }

    public static void drawSquare() {
        turtleDraw.turtleMoves(5, 3);
        turtleDraw.turtleMoves(3);
        turtleDraw.turtleMoves(5, 3);
        turtleDraw.turtleWriting(2);
        turtleDraw.turtleMoves(5, 12);
        turtleDraw.turtleMoves(4);
        turtleDraw.turtleMoves(5, 12);
        turtleDraw.turtleMoves(4);
        turtleDraw.turtleMoves(5, 12);
        turtleDraw.turtleMoves(4);
        turtleDraw.turtleMoves(5, 12);
        turtleDraw.turtleMoves(1);
        turtleDraw.turtleMoves(6);
        turtleDraw.turtleMoves(9);
    }

    private static void drawDiamond() {
        turtleDraw.turtleMoves(5, 9);
        turtleDraw.turtleMoves(3);
        turtleDraw.turtleMoves(5, 2);
        turtleDraw.turtleWriting(2);
        turtleDraw.turtleMoves(5, 1);

        for (int i = 0; i < 6; i++) {
            turtleDraw.turtleMoves(1);
            turtleDraw.turtleMoves(3);
            turtleDraw.turtleMoves(5, 1);
            turtleDraw.turtleMoves(4);
            turtleDraw.turtleWriting(2);
            turtleDraw.turtleMoves(5, 1);
        }

        for (int i = 0; i < 6; i++) {
            turtleDraw.turtleMoves(1);
            turtleDraw.turtleMoves(4);
            turtleDraw.turtleMoves(5, 1);
            turtleDraw.turtleMoves(3);
            turtleDraw.turtleWriting(2);
            turtleDraw.turtleMoves(5, 1);
        }

        turtleDraw.turtleMoves(4);
        turtleDraw.turtleMoves(1);
        turtleDraw.turtleMoves(5, 1);
        turtleDraw.turtleMoves(4);

        for (int i = 0; i < 5; i++) {
            turtleDraw.turtleWriting(2);
            turtleDraw.turtleMoves(5, 1);
            turtleDraw.turtleMoves(3);
            turtleDraw.turtleWriting(1);
            turtleDraw.turtleMoves(5, 1);
            turtleDraw.turtleMoves(4);
        }

        for (int i = 0; i < 6; i++) {
            turtleDraw.turtleWriting(2);
            turtleDraw.turtleMoves(5, 1);
            turtleDraw.turtleMoves(4);
            turtleDraw.turtleWriting(1);
            turtleDraw.turtleMoves(5, 1);
            turtleDraw.turtleMoves(3);
        }

        turtleDraw.turtleMoves(6);
        turtleDraw.turtleMoves(9);
    }

    public static void drawTriangle() {
        turtleDraw.turtleMoves(5, 9);
        turtleDraw.turtleMoves(3);
        turtleDraw.turtleMoves(5, 2);
        turtleDraw.turtleWriting(2);
        turtleDraw.turtleMoves(5, 1);

        for (int i = 0; i < 6; i++) {
            turtleDraw.turtleMoves(1);
            turtleDraw.turtleMoves(3);
            turtleDraw.turtleMoves(5, 1);
            turtleDraw.turtleMoves(4);
            turtleDraw.turtleWriting(2);
            turtleDraw.turtleMoves(5, 1);
        }

        turtleDraw.turtleMoves(4);
        turtleDraw.turtleMoves(5, 12);
        turtleDraw.turtleMoves(1);
        turtleDraw.turtleMoves(4);

        for (int i = 0; i < 6; i++) {
            turtleDraw.turtleMoves(5, 1);
            turtleDraw.turtleWriting(2);
            turtleDraw.turtleMoves(4);
            turtleDraw.turtleMoves(5, 1);
            turtleDraw.turtleMoves(3);
            turtleDraw.turtleMoves(1);
        }

        turtleDraw.turtleMoves(6);
        turtleDraw.turtleMoves(9);
    }

    public static void drawRightAngledTriangle() {
        turtleDraw.turtleMoves(5, 3);
        turtleDraw.turtleMoves(3);
        turtleDraw.turtleMoves(5, 3);
        turtleDraw.turtleWriting(2);
        turtleDraw.turtleMoves(5, 12);
        turtleDraw.turtleMoves(4);
        turtleDraw.turtleMoves(5, 12);
        turtleDraw.turtleMoves(1);
        turtleDraw.turtleMoves(4);

        for (int i = 0; i < 12; i++) {
            turtleDraw.turtleMoves(5, 1);
            turtleDraw.turtleWriting(2);
            turtleDraw.turtleMoves(4);
            turtleDraw.turtleMoves(5, 1);
            turtleDraw.turtleMoves(3);
            turtleDraw.turtleMoves(1);
        }

        turtleDraw.turtleMoves(6);
        turtleDraw.turtleMoves(9);
    }
}
