package chapter5;//Exercise 5.12

public class MultiplesOf3 {
    public static void main(String[] args) {

        int sumOfMultiples = 0;

        for (int counter = 1;counter <= 30; counter++) {
            if (counter % 3 == 0) sumOfMultiples += counter;
        }
        System.out.println("The sum of multiples of 3 between 1 and 30 is: "+sumOfMultiples);
    }
}
