package chapter17;

@FunctionalInterface
public interface Human {
    void speak();
    default void eat() {
        System.out.println("I am eating.");
    }
}
