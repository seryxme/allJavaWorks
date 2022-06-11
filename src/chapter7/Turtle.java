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
                """);
        int userOption = options.nextInt();

        if (userOption == 1) drawSquare();


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
}
