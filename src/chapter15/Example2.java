package chapter15;

import java.io.*;

public class Example2 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter printWriter = new PrintWriter(new FileWriter("example2.txt"))) {
            String statement = bufferedReader.readLine();
            printWriter.println(statement.toUpperCase());
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
