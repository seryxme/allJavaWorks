package chapter7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Shopping {
    private String[] items;
    private int[] quantities;
    private double[] price;
    private double[] totalPrice;
    public int counter;
    public  double subtotal;
    private String date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());

    public Shopping() {
        items = new String[5];
        quantities = new int[5];
        price = new double[5];
        totalPrice = new double[5];
        counter = 0;
    }

    public void addItem(String item) {
        items[counter] = item;;
    }

    public String getItems(int index) {
        return items[index];
    }

    public void addQuantity(int quantity) {
        quantities[counter] = quantity;
    }

    public int getQuantities(int index) {
        return quantities[index];
    }

    public void addPrice(double amount) {
        price[counter] = amount;
    }

    public double getPrice(int index) {
        return price[index];
    }

    public void calculateTotalPrice(int index) {
        totalPrice[index] = price[index] * quantities[index];
    }

    public double getTotalPrice(int index) {

        return totalPrice[index];
    }

    public void expandArrays() {
        if (counter == items.length) {
            String[] newItems = new String[items.length * 2];
            int[] newQuantities = new int[quantities.length * 2];
            double[] newPrice = new double[price.length * 2];
            double[] newTotal = new double[totalPrice.length * 2];

            for(int element = 0; element < items.length; element++) {
                newItems[element] = items[element];
                newQuantities[element] = quantities[element];
                newPrice[element] = price[element];
                newTotal[element] = totalPrice[element];
            }
            items = newItems;
            quantities = newQuantities;
            price = newPrice;
            totalPrice = newTotal;
        }
    }

    public void transactionDetails(String companyName, String branch, String address, String phoneNumber, String cashierName, String customerName) {
        System.out.printf("""
                
                %s
                %s
                %s
                PHONE: %s
                Date: %s
                Cashier: %s
                Customer: %s
                ===========================================================
                           ITEM            QTY     PRICE(NGN)   TOTAL(NGN)
                -----------------------------------------------------------
                
                """, companyName, branch, address, phoneNumber, date, cashierName, customerName);

        subtotal = 0;

        for(int element = 0; element < counter; element++) {

            calculateTotalPrice(element);

            subtotal += getTotalPrice(element);

            System.out.printf("%2d. %-16s%10d%13.2f%14.2f%n", element+1, getItems(element), getQuantities(element), getPrice(element), getTotalPrice(element));
        }
    }
}
