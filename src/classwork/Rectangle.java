package classwork;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        validateValues(length);
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        validateValues(width);
        this.width = width;
    }

    public double calculatePerimeter(double length, double width) {
        return 2 * length + 2 * width;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public void validateValues(double values) {
        if (values > 20.0 || values < 0.0) {
            throw new IllegalArgumentException();
        }
    }

}
