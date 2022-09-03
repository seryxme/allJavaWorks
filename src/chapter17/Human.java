package chapter17;

public interface Human {
    void speak();
    default void eat() {
        System.out.println("I am eating.");
    }
}
