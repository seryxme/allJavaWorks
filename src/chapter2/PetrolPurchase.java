package chapter2;

public class PetrolPurchase {
    private String location;
    private String type;
    private int quantityInLitres;
    private double pricePerLitre;
    private double discount;

    public PetrolPurchase(String location, String type, int quantityInLitres, double price, double discount) {
        this.location = location;
        this.type = type;
        this.quantityInLitres = quantityInLitres;
        this.pricePerLitre = price;
        this.discount = discount;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setQuantity(int quantity) {
        quantityInLitres = quantity;
    }
    public int getQuantity() {
        return quantityInLitres;
    }
    public void setPrice(double price) {
        pricePerLitre = price;
    }
    public double getPrice() {
        return pricePerLitre;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double getDiscount() {
        return discount;
    }
    public double getPurchaseAmount() {
        return pricePerLitre * quantityInLitres * (1 - discount/100);
    }
}
