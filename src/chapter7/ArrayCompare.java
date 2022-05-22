package chapter7;

import java.util.Arrays;

public class ArrayCompare {
    public static void main(String[] args) {
        String[] firstArray = {"orange", "kiwi", "banana"};
        String[] secondArray = {"orange", "kiwi", "banana", "apple"};

        System.out.printf("%b", compareArrays(firstArray, secondArray));

    }

    public static boolean compareArrays(String[] array1, String[] array2) {

        return Arrays.equals(array1, array2);
    }


}
