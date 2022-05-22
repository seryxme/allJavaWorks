package otherAssignments;

public class MoreTriangles {
    public static void main(String[] args) {

        int n = 5;

        for (int c = 0; c < n; c++) {
            for (int i = c; i <= n; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= c; i++) {
                System.out.print("*");
            }
            for (int i = 0; i < c; i++) {
                System.out.print("*");
            }
            for (int i = c; i <= n; i++) {
                System.out.print(" ");
            }

            for (int i = c; i <= n; i++) {
                System.out.print(" ");
            }
            for (int i = c; i < 1; i++) {
                System.out.print(1);
            }
            for (int i = c; i > 0 && i <= 2; i++) {
                System.out.print(c + 1);
            }
            for (int i = c; i > 1 && i <= 3; i++) {
                System.out.print(c + 1);
            }
            for (int i = c; i > 2 && i <= 5; i++) {
                System.out.print(c + 1);
            }
            for (int i = c; i > 3 && i <= 6; i++) {
                System.out.print(c + 1);
            }
            for (int i = c; i > 0 && i <= 1; i++) {
                System.out.print(c + 1);
            }
            for (int i = c; i > 1 && i <= 3; i++) {
                System.out.print(c + 1);
            }
            for (int i = c; i > 2 && i <= 4; i++) {
                System.out.print(c + 1);
            }
            for (int i = c; i > 3 && i <= 6; i++) {
                System.out.print(c + 1);
            }
            for (int i = c; i <= n; i++) {
                System.out.print(" ");
            }

            for (int i = c; i <= n; i++) {
                System.out.print(" ");
            }
            for (int i = c; i > 3 && i <= c; i++) {
                System.out.print(5);
            }
            for (int i = c; i > 2 && i <= c; i++) {
                System.out.print(4);
            }
            for (int i = c; i > 1 && i <= c; i++) {
                System.out.print(3);
            }
            for (int i = c; i > 0 && i <= c; i++) {
                System.out.print(2);
            }
            for (int i = 0; i < 1; i++) {
                System.out.print(1);
            }
            for (int i = c; i > 0 && i <= c; i++) {
                System.out.print(2);
            }
            for (int i = c; i > 1 && i <= c; i++) {
                System.out.print(3);
            }
            for (int i = c; i > 2 && i <= c; i++) {
                System.out.print(4);
            }
            for (int i = c; i > 3 && i <= c; i++) {
                System.out.print(5);
            }
            System.out.println();

        }
    }
}
