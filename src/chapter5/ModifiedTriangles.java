package chapter5;//Exercise 5.22

public class ModifiedTriangles {
    public static void main(String[] args) {

        int x = 1;
        int y = 10;
        int z = 1;
        for(; x <= 10;) {
            for(int c = 0;c < 1;c++) {
                for (int i = 0; i < x; i++) {
                    System.out.print("*");
                }
            }
            for(int c = y;c > 0;c--) {
                for (int i = 0; i < 1; i++) {
                    System.out.print(" ");
                }
            }
            for(int c = 0;c < y;c++) {
                for (int i = 0; i < 1; i++) {
                    System.out.print("*");
                }
            }
            for(int c = 1;c > 0;c--) {
                for (int i = 0; i < z; i++) {
                    System.out.print(" ");
                }
            }
            for(int c = 0;c < y;c++) {
                for (int i = 0; i < 1; i++) {
                    System.out.print("*");
                }
            }
            for(int c = y;c > 0;c--) {
                for (int i = 0; i < 1; i++) {
                    System.out.print(" ");
                }
            }
            for(int c = 0;c < 1;c++) {
                for (int i = 0; i < x; i++) {
                    System.out.print("*");
                }
            }
            System.out.println();
            x++;
            y--;
            z += 2;
        }
    }
}
