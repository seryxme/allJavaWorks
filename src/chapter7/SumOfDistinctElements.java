package chapter7;

import java.util.Arrays;

public class SumOfDistinctElements {
    public static void main(String[] args) {

        int[] set1 = {3, 1, 7, 9};
        int[] set2 = {2, 4, 1, 9, 3};

        sumDistinctElements1(set1, set2);
    }

    public static void sumDistinctElements1(int[] array1, int[] array2) {

        int sum1 = 0;
        int sum2 = 0;

        int[] sortedArray1 = new int[array1.length];
        int[] sortedArray2 = new int[array2.length];

        System.arraycopy(array1, 0, sortedArray1, 0, array1.length);
        System.arraycopy(array2, 0, sortedArray2, 0, array2.length);
        Arrays.sort(sortedArray1);
        Arrays.sort(sortedArray2);

        for (int k : array1) {
            int index = Arrays.binarySearch(sortedArray2, k);
            if (index < 0) {
                sum1 += k;
            }
        }

        for (int k : array2) {
            int index = Arrays.binarySearch(sortedArray1, k);
            if (index < 0) {
                sum2 += k;
            }
        }

        System.out.printf("Sum of the distinct elements in either set is %d.", sum1 + sum2);
    }

//    public static void sumDistinctElements2(int[] array1, int[] array2) {
//
//        for ()
//
//       /
//
//        System.out.printf("Sum of the distinct elements in either set is %d.", sum1 + sum2);
//    }
}
