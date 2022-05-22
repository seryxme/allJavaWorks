package chapter3;

public class Car {
    private String model;
    private String year;
    private double price;
    private double discount;

    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        if (price > 0.00) {
            this.price = price;
        }
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getYear() {
        return year;
    }
    public void setPrice(double price) {
        if (price > 0.00) {
            this.price = price;
        }
    }
    public double getPrice() {
        return price;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
        }
    public double getDiscount() {
        return discount;
    }
    public double getDiscountedPrice() {
        return price * (1 - discount/100);
    }

}
