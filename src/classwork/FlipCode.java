package classwork;

import java.util.Scanner;

public class FlipCode {
    public static void main(String[] args) {
        Scanner flip = new Scanner(System.in);

        System.out.print("Enter either 1 or 0: ");
        int num = flip.nextInt();

        //if (num == 1) {
        //    System.out.print(0);
        //}

        //if (num == 0) {
        //    System.out.print(1);
        //}
        //System.out.println(num == 0 ? "1" : "0");
        if (num == 1) {
                System.out.print(0);
            }
        else {
            System.out.print(1);
        }
    }
}
