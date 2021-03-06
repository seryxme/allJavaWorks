package classwork.ssd;

import static classwork.ssd.DisplaySegments.*;

public class SevenSegment {
    private final String[][] display;
    private final int[] converter;

    public SevenSegment() {
        display = new String[9][5];
        converter = new int[8];

    }

    public void showDisplay() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%s ", display[i][j]);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e){
                    System.out.println("Interrupted.");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void resetDisplay() {
        for (int i = 0; i < 8; i++) {
            converter[i] = 0;
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                display[i][j] = " ";
            }
        }
    }

    private void setSegmentOn(DisplaySegments displaySeg) {

        switch(displaySeg) {
            case TOP -> {
                display[0][1] = "#";
                display[0][2] = "#";
                display[0][3] = "#";
            }
            case RIGHT1 -> {
                display[1][4] = "# ";
                display[2][4] = "# ";
                display[3][4] = "# ";
            }
            case RIGHT2 -> {
                display[5][4] = "# ";
                display[6][4] = "# ";
                display[7][4] = "# ";
            }
            case BOTTOM -> {
                display[8][1] = "#";
                display[8][2] = "#";
                display[8][3] = "#";
            }
            case LEFT2 -> {
                display[5][0] = "#";
                display[6][0] = "#";
                display[7][0] = "#";
            }
            case LEFT1 -> {
                display[1][0] = "#";
                display[2][0] = "#";
                display[3][0] = "#";
            }
            case MIDDLE -> {
                display[4][1] = "#";
                display[4][2] = "#";
                display[4][3] = "#";
            }
        }
    }

    public void inputConverter(int number) {
        if (number > 9 || number < 0) {
            throw new IllegalArgumentException("Cannot display multiple digits or negative numbers.");
        }
        converter[7] = 1;
        switch (number) {
            case 1 -> {
                converter[1] = 1;
                converter[2] = 1;
            }
            case 2 -> {
                converter[0] = 1;
                converter[1] = 1;
                converter[3] = 1;
                converter[4] = 1;
                converter[6] = 1;
            }
            case 3 -> {
                converter[0] = 1;
                converter[1] = 1;
                converter[2] = 1;
                converter[3] = 1;
                converter[6] = 1;
            }
            case 4 -> {
                converter[1] = 1;
                converter[2] = 1;
                converter[5] = 1;
                converter[6] = 1;
            }
            case 5 -> {
                converter[0] = 1;
                converter[2] = 1;
                converter[3] = 1;
                converter[5] = 1;
                converter[6] = 1;
            }
            case 6 -> {
                converter[0] = 1;
                converter[2] = 1;
                converter[3] = 1;
                converter[4] = 1;
                converter[5] = 1;
                converter[6] = 1;
            }
            case 7 -> {
                converter[0] = 1;
                converter[1] = 1;
                converter[2] = 1;
            }
            case 8 -> {
                converter[0] = 1;
                converter[1] = 1;
                converter[2] = 1;
                converter[3] = 1;
                converter[4] = 1;
                converter[5] = 1;
                converter[6] = 1;
            }
            case 9 -> {
                converter[0] = 1;
                converter[1] = 1;
                converter[2] = 1;
                converter[3] = 1;
                converter[5] = 1;
                converter[6] = 1;
            }
            case 0 -> {
                converter[0] = 1;
                converter[1] = 1;
                converter[2] = 1;
                converter[3] = 1;
                converter[4] = 1;
                converter[5] = 1;
            }
        }
    }

    public void inputConverter(char character) throws IllegalArgumentException {

        converter[7] = 1;

        switch (character) {
            case 'a' -> {
                converter[0] = 1;
                converter[1] = 1;
                converter[2] = 1;
                converter[3] = 0;
                converter[4] = 1;
                converter[5] = 1;
                converter[6] = 1;
            }
            case 'b' -> {
                converter[2] = 1;
                converter[3] = 1;
                converter[4] = 1;
                converter[5] = 1;
                converter[6] = 1;
            }
            case 'c' -> {
                converter[3] = 1;
                converter[4] = 1;
                converter[6] = 1;
            }
            case 'd' -> {
                converter[1] = 1;
                converter[2] = 1;
                converter[3] = 1;
                converter[4] = 1;
                converter[6] = 1;
            }
            case 'e' -> {
                converter[0] = 1;
                converter[1] = 1;
                converter[3] = 1;
                converter[4] = 1;
                converter[5] = 1;
                converter[6] = 1;
            }
            case 'f' -> {
                converter[0] = 1;
                converter[4] = 1;
                converter[5] = 1;
                converter[6] = 1;
            }
        }
    }

    public void segmentReader() {
        if (converter[7] == 0) resetDisplay();
        else {
            for (int index = 0; index < 7; index++) {
                if (converter[index] == 1) {
                    switch (index) {
                        case 0 -> setSegmentOn(TOP);
                        case 1 -> setSegmentOn(RIGHT1);
                        case 2 -> setSegmentOn(RIGHT2);
                        case 3 -> setSegmentOn(BOTTOM);
                        case 4 -> setSegmentOn(LEFT2);
                        case 5 -> setSegmentOn(LEFT1);
                        case 6 -> setSegmentOn(MIDDLE);
                    }
                }
            }
        }
    }
}
