package chapter6;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FloorAndCeil {
    public static void main(String[] args) {

        Scanner doubleReader = new Scanner(System.in);

        System.out.println("Enter a floating point number: ");
        double x = doubleReader.nextDouble();

        int ceil = myCeil(x);
        int floor = myFloor(x);

        System.out.printf("Ceil = %d%nFloor = %d%n", ceil, floor);

    }

    public static int myFloor(double num){
        return ((int) num);
    }

    public static int myCeil ( double num){
        return ((int) (num + 1));
    }
}
