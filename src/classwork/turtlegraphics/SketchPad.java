package classwork.turtlegraphics;

public class SketchPad {
    int[][] floor;

    public SketchPad(int length, int width) {
        floor = new int[length][width];
    }

    public void setFloor(int[][] floor) {
        this.floor = floor;
    }
}
