package chapter15;

import java.io.*;

public class ObjectDeserializationExample {
    public static void main(String[] args) {
        try (FileInputStream stream = new FileInputStream("dog-data");
             ObjectInputStream inStream = new ObjectInputStream(stream);) {
            Dog myDog = (Dog) inStream.readObject();
            System.out.println(myDog);

        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
