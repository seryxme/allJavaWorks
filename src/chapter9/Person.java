package chapter9;

public class Person {
    private int head = 1;
    private String mouth;
    private int eyes = 2;
    private String gender;

    public void talk() {
        System.out.println("I can talk.");
    }

    public void sleep() {
        System.out.println("My " + eyes + "eyes are closed.");
    }


}
