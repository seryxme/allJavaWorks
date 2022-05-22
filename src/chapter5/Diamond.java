package chapter5;//Exercise 5.24

public class Diamond {
    public static void main(String[] args) {

        int n = 5;

        for(int c = 1;c < n;c++) {
            for (int i = c; i <= n; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i < c; i++) {
                System.out.print("*");
            }
            for (int i = 1; i <= c; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int c = 1;c <= n;c++) {
            for (int i = 1; i <= c; i++) {
                System.out.print(" ");
            }
            for (int i = c; i < n; i++) {
                System.out.print("*");
            }
            for (int i = c; i <= n; i++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
