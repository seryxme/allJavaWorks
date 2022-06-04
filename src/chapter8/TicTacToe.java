package chapter8;

import java.util.Objects;

public class TicTacToe {
    private String[][] options = new String[3][3];

    public TicTacToe() {

    }

    public void setSlotValue(int index1, int index2, String value) {
        if (Objects.equals(options[index1][index2], " ")) {
            options[index1][index2] = value;
        } else {
            System.out.println("Slot already occupied.");
        }
    }

    public void setSlotX(int index1, int index2) {
        options[index1][index2] = "X";
    }

    public void setSlotO(int index1, int index2) {
        options[index1][index2] = "O";
    }

    public void setSlotsEmpty() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                options[i][j] = " ";
            }
        }
    }

    public String getSlotValue(int index1, int index2) {
        return options[index1][index2];
    }

    public boolean checkSlots() {

        boolean b = false;
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Objects.equals(getSlotValue(i, j), " ")) {
                    b = true;
                    break;
                }
            }
            if (b) {
                break;
            }
        }
        return b;
    }


    public boolean checkPlayerOneWin() {

        boolean b = false;

        for(int i = 0; i < 3; i++) {
            if (getSlotValue(i, 0) == "X" && getSlotValue(i, 1) == "X" && getSlotValue(i, 2) == "X") {
                b = true;
                break;
            }
            if (getSlotValue(0, i) == "X" && getSlotValue(1, i) == "X" && getSlotValue(2, i) == "X") {
                b = true;
                break;
            }
            if (getSlotValue(0, 0) == "X" && getSlotValue(1, 1) == "X" && getSlotValue(2, 2) == "X") {
                b = true;
                break;
            }

            if (getSlotValue(0, 2) == "X" && getSlotValue(1, 1) == "X" && getSlotValue(2, 0) == "X") {
                b = true;
                break;
            }
        }
        return b;
    }

    public boolean checkPlayerTwoWin() {

        boolean b = false;

        for(int i = 0; i < 3; i++) {
            if (getSlotValue(i, 0) == "O" && getSlotValue(i, 1) == "O" && getSlotValue(i, 2) == "O") {
                b = true;
                break;
            }
            if (getSlotValue(0, i) == "O" && getSlotValue(1, i) == "O" && getSlotValue(2, i) == "O") {
                b = true;
                break;
            }
            if (getSlotValue(0, 0) == "O" && getSlotValue(1, 1) == "O" && getSlotValue(2, 2) == "O") {
                b = true;
                break;
            }

            if (getSlotValue(0, 2) == "O" && getSlotValue(1, 1) == "O" && getSlotValue(2, 0) == "O") {
                b = true;
                break;
            }
        }
        return b;
    }



}
