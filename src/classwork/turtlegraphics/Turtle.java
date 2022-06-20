package classwork.turtlegraphics;

import static classwork.turtlegraphics.Direction.*;

public class Turtle {
    private boolean isPenUp = true;
    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0,0);
    private int row = currentPosition.getRow();
    private int column = currentPosition.getColumn();

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
        switch(currentDirection) {
            case EAST -> currentPosition.setColumn(column + numOfSteps);
            case WEST -> currentPosition.setColumn(column - numOfSteps);
            case SOUTH -> currentPosition.setRow(row + numOfSteps);
            case NORTH -> currentPosition.setRow(row - numOfSteps);
        }
    }

    public void move(int numOfSteps, SketchPad sketchPad) {
        write(numOfSteps, sketchPad);
        move(numOfSteps);
        }

    private void write(int numOfSteps, SketchPad sketchPad) {
        sketchPad = new SketchPad(5, 5);
        int[][] floor = new int[row][column];

        switch(currentDirection) {
            case EAST -> {
                for (int i = column; i < column + numOfSteps; i++) {
                    floor[row][i] = 1;
                }
            }
            case WEST -> currentPosition.setColumn(column - numOfSteps);
            case SOUTH -> currentPosition.setRow(row + numOfSteps);
            case NORTH -> currentPosition.setRow(row - numOfSteps);
        }
    }


}
