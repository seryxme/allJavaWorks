package chapter17;

import java.util.function.*;

public class FunctionalInterfaceSample {
    public static void main(String[] args) {
        Staff staff = (hours) -> System.out.printf("I work %d hours a day.%n", hours);

        Consumer<Staff> consumer = (staff1) -> staff1.work(14);

        consumer.accept(staff);

        BiConsumer<String, String> biConsumer = (time, name) -> System.out.printf("%s is coming in by %s.%n", name, time);

        biConsumer.accept("11.59am", "Dave");

        Predicate<String> predicate = (name) -> name.equals("Dee");

        System.out.println(predicate.test("Tee"));

        BiPredicate<String, Integer> biPredicate = (value, num) -> value.length() == num;

        System.out.println(biPredicate.test("sterling", 8));

        Function<String, Integer> function = String::length;

        System.out.println(function.apply("Black Renaissance"));

        BiFunction<String, Integer, Integer> biFunction = (word, number) -> word.length() + number;

        System.out.println(biFunction.apply("Black Renaissance", 12));

        UnaryOperator<String> unaryOperator = (name) -> "Greatness lies in " + name + "!";

        System.out.println(unaryOperator.apply("You"));

        BinaryOperator<Double> binaryOperator = Math::pow;

        System.out.println(binaryOperator.apply(2.5, 3.0));
    }
}
