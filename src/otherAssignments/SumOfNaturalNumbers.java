package otherAssignments;

public class SumOfNaturalNumbers {
    public static void main(String... args) {

        int numberSum = 0;

        for(int number = 1;number <= 10; number++) {
            numberSum += number;
        }
        System.out.println("The sum of the first 10 natural numbers is "+ numberSum);
    }
}
