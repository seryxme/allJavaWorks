package chapter4;//Exercise 4.19

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner itemReader = new Scanner(System.in);

        int item1 = 0;
        int item2 = 0;
        int item3 = 0;
        int item4 = 0;

        System.out.println("Enter number of item 1 sold: ");
        item1 = itemReader.nextInt();

        System.out.println("Enter number of item 2 sold: ");
        item2 = itemReader.nextInt();

        System.out.println("Enter number of item 3 sold: ");
        item3 = itemReader.nextInt();

        System.out.println("Enter number of item 4 sold: ");
        item4 = itemReader.nextInt();

        double grossSales = item1 * 239.99 + item2 * 129.75 + item3 * 99.95 + item4 * 350.89;

        double totalEarnings = 200 + grossSales * 9/100;

        System.out.printf("Total earnings this week is $%.2f.%n", totalEarnings);

    }
}
