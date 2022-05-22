package chapter6;

public class PerfectNumbers {
    public static void main(String[] args) {
        int number = 1;
        int perfect = 1;


        while (number <= 1000) {
            perfect = isPerfect(number);
            ++number;
        }

    }

    public static int isPerfect(int num) {
        int factor = 1;
        int sumOfFactors = 0;
        int perfectNumber = 0;

        while(factor < num) {
            if (num % factor == 0) {
                 sumOfFactors += factor;
            }
            ++factor;
        }
        if (sumOfFactors == num) {
            perfectNumber = num;
            System.out.println("\n" + perfectNumber + " is a perfect number.\nFactors are: ");
        }
        factor = 1;
        while(factor < perfectNumber) {
            if (perfectNumber % factor == 0) {
                System.out.println(factor);
            }
            factor++;
        }

        return perfectNumber;
    }
}
