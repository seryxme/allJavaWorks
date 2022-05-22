package chapter5;//Exercise 5.14

public class Interest {
    public static void main(String[] args) {
        double principal = 1000.0;

        System.out.printf("%s%15s%20s%n", "Year", "Interest Rate", "Amount on deposit");
        for (int year = 1; year <= 10; ++year) {
            for (double rate = 5; rate <= 10; ++rate) {
                double amount = principal * Math.pow(1.0 + rate/100, year);
                System.out.printf("%4d%15.1f%,20.2f%n", year, rate, amount);
            }

        }
    }
}