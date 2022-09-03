package chapter17;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class LambdaExamples {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 10)
                .filter((x) -> (x % 2 == 0))
                .map(x -> x * 3)
                .sum());

        System.out.println(Arrays.toString(IntStream.rangeClosed(1, 10)
                .filter((x) -> (x % 2 == 0))
                .map(x -> x * 3).toArray()));
    }
}
