package chapter4;

// Exercise 4.26: Mystery3.java
public class Mystery3 {
    public static void main(String[] args) {
        int row = 5;
        while (row >= 1) {
            int column = 5;
            while (column >= 1) {
                System.out.print(row % 2 == 0 ? "X" : "O");
                --column;
            }
            --row;
            System.out.println();
        }
    }
}