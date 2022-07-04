package classwork.turtlegraphics;

import java.util.Scanner;

public class TurtleMain {
    private static SketchPad board;
    private static Turtle turtle = new Turtle();
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        intro();
        draw();

    }

    public static void drawSquare() {
        turtle.move(5, board);
        turtle.turnRight();
        turtle.move(5, board);
        turtle.penDown();
        turtle.move(10, board);
        turtle.turnLeft();
        turtle.move(10, board);
        turtle.turnLeft();
        turtle.move(10, board);
        turtle.turnLeft();
        turtle.move(10, board);
        turtle.penUp();
        board.displayFloor();
    }

    public static void draw() {
        System.out.println("""
                
                1. Move turtle
                2. Turn turtle to the right
                3. Turn turtle to the left
                4. Draw
                5. Stop drawing
                6. Display board
                7. Reset board
                8. Exit app
                """);
        int userOption = input.nextInt();

        switch (userOption) {
            case 1 -> {
                System.out.println("How many steps?");
                userOption = input.nextInt();
                turtle.move(userOption, board);
                if (!turtle.isPenUp()) board.displayFloor();
            }
            case 2 -> turtle.turnRight();
            case 3 -> turtle.turnLeft();
            case 4 -> {
                turtle.penDown();
                System.out.println("Move turtle to start drawing.");
            }
            case 5 -> turtle.penUp();
            case 6 -> board.displayFloor();
            case 7 -> board.resetFloor();
            case 8 -> {
                System.out.println("Thank you for using Turtle Graphics.");
                System.exit(0);
            }
        }
        draw();
    }

    public static void intro() {
        System.out.println("""
                
                Welcome to Turtle Graphics. Use the board to draw
                by moving the turtle.
                Select your board size:
                1. 10x10
                2. 15x15
                3. 20x20
                """);
        int userOption = input.nextInt();

        switch (userOption) {
            case 1 -> board = new SketchPad(10, 10);
            case 2 -> board = new SketchPad(15, 15);
            case 3 -> board = new SketchPad(20, 20);
        }
    }
}
