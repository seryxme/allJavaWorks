package chapter7;

import java.util.Objects;
import java.util.Scanner;

public class ShoppingTransactionsApp {
    public static void main(String[] args) {

        Scanner dataReader = new Scanner(System.in);

        Shopping czg = new Shopping();

        String companyName = "CZG MULTISTORES LTD.";
        String branch = "OMOLE BRANCH";
        String address = "743, BABATUNDE ATERE STREET, OMOLE PHASE 1, ISHERI-OLOWORA.";
        String phoneNumber = "08068713842";

        System.out.println("Enter customer's name: ");
        String customerName = dataReader.nextLine();

        String response = "yes";

        while(Objects.equals(response, "yes")) {
            czg.expandArrays();

            System.out.println("What did they buy? ");
            String itemBought = dataReader.nextLine();
            czg.addItem(itemBought);

            System.out.println("How many did they buy?");
            int itemQuantity = dataReader.nextInt();
            czg.addQuantity(itemQuantity);

            System.out.printf("How much is each %s?%n", itemBought.toLowerCase());
            double itemPrice = dataReader.nextDouble();
            dataReader.nextLine();
            czg.addPrice(itemPrice);

            czg.counter++;

            System.out.println("Did they buy another item?");
            response = dataReader.nextLine();
            while(!Objects.equals(response, "yes")) {
                if(!Objects.equals(response, "no")) {
                    System.out.println("Invalid response.\n\nDid they buy another item?");
                    response = dataReader.nextLine();
                }
                else break;
            }
        }

        System.out.println("Enter your name: ");
        String cashierName = dataReader.nextLine();

        System.out.println("What is the discount rate?");
        double discountRate = dataReader.nextDouble();

        czg.transactionDetails(companyName, branch, address, phoneNumber, cashierName, customerName);

        double discount = czg.subtotal * (discountRate/100);
        double vat = czg.subtotal * 0.175;
        String percent = "%";
        double totalBill = czg.subtotal - discount + vat;

        System.out.printf("""
                -----------------------------------------------------------
                                                     Sub Total:%10.2f
                                                      Discount:%10.2f
                                                  VAT @ 17.50%s:%10.2f
                ===========================================================
                                                    Amount Due:%10.2f
                ===========================================================
                        THIS IS NOT A RECEIPT. KINDLY PAY N%,.2f.
                ===========================================================
                """, czg.subtotal, discount, percent, vat, totalBill, totalBill);

        System.out.println("How much did customer pay?");
        double payment = dataReader.nextDouble();
        double balance = payment - totalBill;

        czg.transactionDetails(companyName, branch, address, phoneNumber, cashierName, customerName);

        System.out.printf("""
                -----------------------------------------------------------
                                                     Sub Total:%10.2f
                                                      Discount:%10.2f
                                                  VAT @ 17.50%s:%10.2f
                ===========================================================
                                                    Amount Due:%10.2f
                                                   Amount Paid:%10.2f
                                                       Balance:%10.2f
                ===========================================================
                                THANK YOU FOR YOUR PATRONAGE!
                ===========================================================
                """, czg.subtotal, discount, percent, vat, totalBill, payment, balance);
    }

}
