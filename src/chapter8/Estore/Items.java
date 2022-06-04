package chapter8.Estore;

import java.util.ArrayList;

public class Items {
    private int productQty;
    private ArrayList<Product> products;

    public Items() {
        products = new ArrayList<>();
    }

    public int getProductQty() {
        return productQty;
    }

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(int index) {
        products.remove(index);
    }

    public Product getProduct(int index) {
        return products.get(index);
    }
}
