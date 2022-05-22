package chapter5;//Exercise 5.28

public class ContinueRemoval {
    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++) { // loop 10 times
            if (count == 5) {
                count++;
            }
            System.out.printf("%d ", count);
        }
        System.out.printf("%nSkipped printing 5 without 'continue'%n");
    }
}
