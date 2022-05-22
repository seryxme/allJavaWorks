package chapter4;//Exercise 4.33

public class Checkerboard {
    public static void main(String[] args) {

        int counter1 = 1;

        while(counter1 <= 8){
            int counter2 = 1;
            while(counter2 <= 8) {
                System.out.print("* ");
                counter2++;
            }
            counter1++;
            System.out.println();
            if(counter1 % 2 == 0) {
                System.out.print(" ");
            }
        }

    }
}
