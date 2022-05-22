package chapter4;

public class Triangles {
    public static void main(String[] args) {

        for(int c = 0;c <= 10;c++) {
            for (int i = 0; i < c; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int c = 10;c > 0;c--) {
            for (int i = 0; i < c; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int c = 10;c > 0;c--) {
            for (int i = 10; i > c;i--) {
                System.out.print(" ");
            }
            for (int i = 0; i < c;i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int c = 10;c > 0;c--) {
            for (int i = 0; i < c;i++) {
                System.out.print(" ");
            }
            for (int i = 10; i > c;i--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
