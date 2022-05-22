package chapter5;//Exercise 5.21

public class PythagoreanTriples {
    public static void main(String[] args) {

        System.out.println("The Pythagorean Triples between 1 and 500 are: ");
        for(int hypotenuse = 1; hypotenuse <= 500; hypotenuse++) {
            double   h = hypotenuse * hypotenuse;
            for(int side1 = 1; side1 <= 500; side1++) {
                double s1 = side1 * side1;
                for(int side2 = 1; side2 <= 500; side2++) {
                    double s2 = side2 * side2;
                    double triple = h/(s1 + s2);
                    if (triple == 1) {
                        System.out.printf("%8d%8d%8d%n", hypotenuse, side1, side2);
                    }
                }
            }
        }

    }
}
