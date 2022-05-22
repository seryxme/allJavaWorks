package chapter5;//Exercise 5.18

public class Interest2 {
    public static void main(String[] args) {
        int principal = 100000;
        double rate = 0.05;
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        for (int year = 1; year <= 10; ++year) {
            double amount = principal * Math.pow(1.0 + rate, year);
            int dollars = (int) amount / 100;
            int cents = (int) amount % 100;

            System.out.printf("%4d%17d.%02d%n", year, dollars, cents);
        }
    }
}