package chapter5;//Exercise 5.13

public class SumOfSeries {
    public static void main(String[] args) {

        int counter = 1;
        long sumOfSeries = 0;
        System.out.printf("%4s %20s%n", "n", "Sum of Series");

        while (counter >= 1 && counter <= 100) {
            sumOfSeries += counter;
            System.out.printf("%4d %,20d%n", counter, sumOfSeries);
            counter++;
        }
    }
}
