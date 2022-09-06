package chapter17;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
//        List<Integer> nums = List.of(4, 8, 12, 16, 20, 24);
//        Consumer<Integer> consumer = (num) -> System.out.println(num * 3);
//        Predicate<Integer> predicate = (num) -> num % 8 == 0;
//        nums.stream() // One way to generate a stream.
//                .filter(predicate)
//                .forEach(consumer);
//
//        Map<Integer, String> maps = Map.of(10, "Start", 20, "Enter name", 30, "Print name");
//
//        maps.forEach((num, line) -> System.out.printf("Line %d: %s%n", num, line.toUpperCase()));

        Stream<Integer> numbers = Stream.empty();

        Stream<Integer> factors = Stream.of(24, 32, 48, 64);

//        Supplier<Integer> supplier = () -> new Random().nextInt(1_000_000);
//        Stream<Integer> nums2 = Stream.generate(supplier);
//        nums2.forEach((num) -> System.out.println(num));

        UnaryOperator<Integer> operator = (num) -> num + 7;
        Stream<Integer> newNums = Stream.iterate(2, operator)
                .limit(100);
        newNums.forEach(System.out::println);
    }

}
