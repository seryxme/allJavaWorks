package tdd;

public class EvenOdd {

       public String numberChecker(int number) {
        if (number % 2 == 0) {
            return number + " is an even number.";
        }
        return number + " is an odd number.";
    }
}
