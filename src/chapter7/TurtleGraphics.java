package chapter7;

import java.util.Arrays;

public class TurtleGraphics {
    private String[][] floor;
    private int row;
    private int col;
    public enum Write {
        PEN_UP,
        PEN_DOWN
    }
    public enum Position {
        FACE_UP,
        FACE_DOWN,
        FACE_FORWARD,
        FACE_BACKWARD,
    }
    private Write turtleWrite;
    private Position turtlePosition;

    public TurtleGraphics(){
        floor = new String[20][20];
        turtleStart();
        row = 0;
        col = 0;
        turtlePosition = Position.FACE_FORWARD;
        turtleWrite = Write.PEN_UP;
    }

    public void turtleStart() {
        for(row = 0; row < 20; row++) {
            for(col = 0; col < 20; col++) {
                floor[row][col] = "   ";
            }
        }
    }

    public void displayFloor() {
        System.out.print(" ");
        for(int i = 0; i < 20; i++) {
            System.out.print("---");
        }
        System.out.println();

        for(int i = 0; i < 20; i++) {
            System.out.print("|");
            for(int j = 0; j < 20; j++) {
                System.out.printf("%s", floor[i][j]);
            }
            System.out.println("|");
        }
        System.out.print(" ");
        for(int k = 0; k < 20; k++) {
            System.out.print("---");
        }
        System.out.println();
    }

    public void turtleMoves(int option) {
        switch(option) {
            case 1 -> turtleWriting(1);
            case 2 -> turtleWriting(2);
            case 3 -> turtleTurnRight();
            case 4 -> turtleTurnLeft();
            case 6 -> displayFloor();
            case 9 -> System.out.println("Thank you for drawing with Turtle Graphics.");
        }

    }

    public void turtleMoves(int option, int steps) {
        if (option == 5) {
            System.out.println("Move Forward.");

            switch (turtlePosition) {
                case FACE_FORWARD -> {
                    switch (turtleWrite) {
                        case PEN_DOWN -> {
                            int j = col + 1;
                            while (j <= col + steps) {
                                floor[row][j] = " * ";
                                j++;
                            }
                        }
                        case PEN_UP -> {
                            int j = col + 1;
                            while (j <= col + steps) {
                                floor[row][j] = "   ";
                                j++;
                            }
                        }
                    }
                    col = col + steps;
                }
                case FACE_BACKWARD -> {
                    switch (turtleWrite) {
                        case PEN_DOWN -> {
                            int j = col - 1;
                            while (j >= col - steps) {
                                floor[row][j] = " * ";
                                j--;
                            }
                        }
                        case PEN_UP -> {
                            int j = col - 1;
                            while (j >= col - steps) {
                                floor[row][j] = "   ";
                                j--;
                            }
                        }
                    }
                    col = col - steps;
                }
                case FACE_UP -> {
                    switch (turtleWrite) {
                        case PEN_DOWN -> {
                            int i = row - 1;
                            while (i >= row - steps) {
                                floor[i][col] = " * ";
                                i--;
                            }
                        }
                        case PEN_UP -> {
                            int i = row - 1;
                            while (i >= row - steps) {
                                floor[i][col] = "   ";
                                i--;
                            }
                        }
                    }
                    row = row - steps;
                }
                case FACE_DOWN -> {
                    switch (turtleWrite) {
                        case PEN_DOWN -> {
                            int i = row + 1;
                            while (i <= row + steps) {
                                floor[i][col] = " * ";
                                i++;
                            }
                        }
                        case PEN_UP -> {
                            int i = row + 1;
                            while (i <= row + steps) {
                                floor[i][col] = "   ";
                                i++;
                            }
                        }
                    }
                    row = row + steps;
                }
            }
        }
    }

    public void turtleTurnRight() {
        System.out.println("Turn Right.");

        switch (turtlePosition) {
            case FACE_FORWARD -> turtlePosition = Position.FACE_DOWN;
            case FACE_BACKWARD -> turtlePosition = Position.FACE_UP;
            case FACE_DOWN -> turtlePosition = Position.FACE_BACKWARD;
            case FACE_UP -> turtlePosition = Position.FACE_FORWARD;
        }
    }

    public void turtleTurnLeft() {
        System.out.println("Turn Left.");

        switch (turtlePosition) {
            case FACE_FORWARD -> turtlePosition = Position.FACE_UP;
            case FACE_BACKWARD -> turtlePosition = Position.FACE_DOWN;
            case FACE_DOWN -> turtlePosition = Position.FACE_FORWARD;
            case FACE_UP -> turtlePosition = Position.FACE_BACKWARD;
        }
    }

    public void turtleWriting(int num) {
        if (num == 1) {
            System.out.println("Pen Up.");
            turtleWrite = Write.PEN_UP;
        }

        if (num == 2) {
            System.out.println("Pen Down.");
            turtleWrite = Write.PEN_DOWN;
        }
    }

//    public void moveCheck(int steps) {
//        switch (turtlePosition) {
//            case FACE_FORWARD -> {
//                if (row + steps > 19) {
//                    System.out.println("Boundary will be exceed. Please reduce steps.");
//                }
//            }
//            case FACE_BACKWARD -> turtlePosition = Position.FACE_DOWN;
//            case FACE_DOWN -> turtlePosition = Position.FACE_FORWARD;
//            case FACE_UP -> turtlePosition = Position.FACE_BACKWARD;
//        }
//    }
}
