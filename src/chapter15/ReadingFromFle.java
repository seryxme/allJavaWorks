package chapter15;

import java.io.*;

public class ReadingFromFle {
    public static void main(String[] args) {
        try {
            Reader fileReader = new FileReader("example.txt");
            BufferedReader buffer = new BufferedReader(fileReader);
            String fileContent = buffer.readLine();
            System.out.println(fileContent);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
