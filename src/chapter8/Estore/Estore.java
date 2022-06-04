package chapter8.Estore;

import java.util.Scanner;

public class Estore {
    public enum product {ELECTRONICS, GROCERIES, UTENSILS, CLOTHING};
    public enum type {MASTERCARD, VISA_CARD, VERVE, AMERICA_EXPRESS};
    private static Users users;
    private static Address addresses;
    private static Product product;
    private static Items item;
    private static ShoppingCart cart;
    private static BillingInfo billingInfo;
    private static CreditCardInfo cardInfo;

    private static Scanner dataReader = new Scanner(System.in);

    public static void main(String[] args) {


    }
}
