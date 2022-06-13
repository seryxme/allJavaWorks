package chapter7;

public class KnightsTour {
    private int[][] board = new int[8][8];
    private final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    private int row;
    private int col;
    private int stepCount = 1;

    public KnightsTour(){
        knightStart();
        row = 3;
        col = 4;
        board[row][col] = 1;
    }

    public void knightStart() {
        for(row = 0; row < 8; row++) {
            for(col = 0; col < 8; col++) {
                board[row][col] = 0;
            }
        }
    }

    public void displayBoard() {
        for(int i = 0; i < 8; i++) {
            System.out.print("+----");
        }
        System.out.println("+");

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if (board[i][j] == 0) {
                    System.out.print("|    ");
                }
                else System.out.printf("| %02d ", board[i][j]);
            }
            System.out.println("|");
            for(int k = 0; k < 8; k++) {
                System.out.print("+----");
            }
            System.out.println("+");
        }
    }

    public boolean knightMoves(int option) {
        boolean b = true;

        row += horizontal[option - 1];
        col += vertical[option - 1];

        if (boundaryCheck()) {
            System.out.println("Move not allowed. Out of board space.");
            row -= horizontal[option - 1];
            col -= vertical[option - 1];
            b = false;
        }
        else if (moveCheck()) {
            System.out.println("Slot is occupied. Make another move.");
            row -= horizontal[option - 1];
            col -= vertical[option - 1];
            b = false;
        }
        else {
            stepCount++;
            board[row][col] = stepCount;
        }
        return b;
    }

    public boolean moveCheck() {
        boolean b = false;

        if (board[row][col] != 0) {
            b = true;
        }
        return b;
    }

    public boolean boundaryCheck() {
        boolean b = false;

        if (row < 0 || col < 0 || row > 7 || col > 7) {
            b = true;
        }
        return b;
    }

    public int getStepCount() {
        return stepCount;
    }
}
