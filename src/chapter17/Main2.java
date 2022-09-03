package chapter17;

public class Main2 {
    public static void main(String[] args) {
        Vehicle car = Math::sqrt;
        System.out.println(car.move(36));

    }
}
