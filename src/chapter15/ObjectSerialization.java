package chapter15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerialization {
    public static void main(String[] args) {
        Dog dog = new Dog("Gatsby", 5);
//        System.out.println(dog);

        try (FileOutputStream stream = new FileOutputStream("dog-data");
             ObjectOutputStream outStream = new ObjectOutputStream(stream);) {

            outStream.writeObject(dog);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
