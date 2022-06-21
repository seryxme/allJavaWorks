package classwork.turtlegraphics;

import static classwork.turtlegraphics.Direction.*;

public class Turtle {
    private boolean isPenUp = true;
    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0,0);


    public boolean isPenUp() {
        return isPenUp;
    }

    public void penDown() {
        isPenUp = false;
    }

    public void penUp() {
        isPenUp = true;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch(currentDirection) {
            case EAST -> currentDirection = SOUTH;
            case SOUTH -> currentDirection = WEST;
            case WEST ->  currentDirection = NORTH;
            case NORTH ->  currentDirection = EAST;
        }
    }

    public void turnLeft() {
        switch (currentDirection) {
            case EAST ->  currentDirection = NORTH;
            case NORTH ->  currentDirection = WEST;
            case WEST ->  currentDirection = SOUTH;
            case SOUTH -> currentDirection = EAST;
        }
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    private void move(int numOfSteps) {
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();

        switch(currentDirection) {
            case EAST -> currentPosition.setColumn(column + numOfSteps - 1);
            case WEST -> currentPosition.setColumn(column - numOfSteps + 1);
            case SOUTH -> currentPosition.setRow(row + numOfSteps - 1);
            case NORTH -> currentPosition.setRow(row - numOfSteps + 1);
        }
    }

    public void move(int numOfSteps, SketchPad sketchPad) {
        write(numOfSteps, sketchPad);
        move(numOfSteps);
        }

    private void write(int numOfSteps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();

        switch(currentDirection) {
            case EAST -> {
                if (!isPenUp()) {
                    for (int i = column; i < column + numOfSteps; i++) {
                        floor[row][i] = 1;
                        sketchPad.setFloor(floor);
                    }
                }
            }
            case WEST -> {
                if (!isPenUp()) {
                    for (int i = column; i > column - numOfSteps; i--) {
                        floor[row][i] = 1;
                        sketchPad.setFloor(floor);
                    }
                }
            }
            case SOUTH -> {
                if (!isPenUp()) {
                    for (int i = row; i < row + numOfSteps; i++) {
                        floor[i][column] = 1;
                        sketchPad.setFloor(floor);
                    }
                }
            }
            case NORTH -> {
                if (!isPenUp()) {
                    for (int i = row; i > row - numOfSteps; i--) {
                        floor[i][column] = 1;
                        sketchPad.setFloor(floor);
                    }
                }
            }
        }
    }


}
