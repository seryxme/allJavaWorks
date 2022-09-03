package chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Example1 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             PrintStream printStream = new PrintStream("example.txt")) {
            String statement = bufferedReader.readLine();
            printStream.println(statement);
            printStream.append("New information");
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
