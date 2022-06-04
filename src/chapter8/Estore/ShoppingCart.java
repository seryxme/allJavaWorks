package chapter8.Estore;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Items> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Items item) {
        items.add(item);
    }

    public void deleteItem(int index) {
        items.remove(index);
    }

    public Items getItem(int index) {
       return items.get(index);
    }
}
