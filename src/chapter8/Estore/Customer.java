package chapter8.Estore;

import java.util.ArrayList;

public class Customer extends Users {
    private ArrayList<BillingInfo> billingInfo = new ArrayList<>();
    private ArrayList<ShoppingCart> shoppingCarts = new ArrayList<>();

    public Customer() {
        billingInfo = new ArrayList<>();
        shoppingCarts = new ArrayList<>();
    }

    public void addBillingInfo(BillingInfo info) {
        billingInfo.add(info);
    }

    public void deleteBillingInfo(int index) {
        billingInfo.remove(index);
    }

    public BillingInfo getBillingInfo(int index) {
        return billingInfo.get(index);
    }

    public void addShoppingCart(ShoppingCart cart) {
        shoppingCarts.add(cart);
    }

    public void deleteShoppingCart(int index) {
        shoppingCarts.remove(index);
    }

    public ShoppingCart getShoppingCart(int index) {
        return shoppingCarts.get(index);
    }
}
