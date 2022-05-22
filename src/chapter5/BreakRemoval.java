package chapter5;//Exercise 5.26

public class BreakRemoval {
    public static void main(String[] args) {
        int count;

        for (count = 1; count <= 10; count++) {
            if (count < 5) {
                System.out.printf("%d ", count);
            }
            else count = 10;
        }
        System.out.printf("%nBroke out of loop at count = %d%n", count-6);
    }
}
