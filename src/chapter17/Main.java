package chapter17;

public class Main {
    public static void main(String[] args) {
        Human man = new Man();

        man.speak();

        Human woman = ()-> System.out.println("This isn't me anymore.");

        woman.speak();
        woman.eat();
    }
}
