package classwork.turtlegraphics;

public class SketchPad {
    private int length;
    private int width;
    int[][] floor;

    public SketchPad(int length, int width) {
        this.length = length;
        this.width = width;
        floor = new int[length][width];
    }

    public void setFloor(int[][] floor) {
        this.floor = floor;
    }

    public int[][] getFloor() {
        return floor;
    }

    public void resetFloor() {
        for(length = 0; length < 20; length++) {
            for(width = 0; width < 20; width++) {
                floor[length][width] = 0;
            }
        }
    }

    public void displayFloor() {
        String design = null;
        System.out.print(" ");
        for(int i = 0; i < width; i++) {
            System.out.print("---");
        }
        System.out.println();

        for(int i = 0; i < length; i++) {
            System.out.print("|");
            for(int j = 0; j < width; j++) {
                if (floor[i][j] == 1) design = " * ";
                else design = "   ";
                System.out.printf("%s", design);
            }
            System.out.println("|");
        }
        System.out.print(" ");
        for(int k = 0; k < width; k++) {
            System.out.print("---");
        }
        System.out.println();
    }

}
