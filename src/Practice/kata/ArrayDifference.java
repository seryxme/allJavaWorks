package Practice.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDifference {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2}, new int[]{1})));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> aa = new ArrayList<>();
        for(int integer: a) {
            aa.add(integer);
        }

        int[] c = new int[aa.size()];

        for (int k : b) {
            for (int j = 0; j < aa.size(); j++) {
                if (aa.get(j) == k) {
                    aa.remove(j);
                }
            }
        }

        for (int i = 0; i < aa.size(); i++) {
            c[i] = aa.get(i);
        }
        return a;
    }
}
