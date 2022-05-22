package chapter5;//Exercise 5.20

public class ValueOfPi {
    public static void main(String[] args) {

        double a = 3;
        double b = 1;
        int counter = 1;
        double pi = 4;
        System.out.printf("%-8s%20s%n%n", "Term", "Value of Pi");

        while(counter <= 200000) {
            pi -= 4 / a;
            System.out.printf("%-8d%20f%n", counter, pi);
            b += 4;
            if (b > a) {
                pi += 4 / b;
                counter++;
                System.out.printf("%-8d%20f%n", counter, pi);
            }
            a += 4;
            counter++;
        }

    }
}
