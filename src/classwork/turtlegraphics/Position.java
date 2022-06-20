package classwork.turtlegraphics;

import java.util.Arrays;

public class Position {
    private int[][] pos;
    private int row;
    private int column;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
        pos = new int[row][column];
    }

    public void setPosition(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public boolean equals(Object obj) {
        Position newPosition = (Position) obj;
        if(row == newPosition.getRow() && column == newPosition.getColumn()) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Position{" +
                ", row=" + row +
                ", column=" + column +
                '}';
    }
}
