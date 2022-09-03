package classwork.urlShortenerApp;

import java.util.ArrayList;
import java.util.List;

public class KeyConverter {
    private static final char[] char62Array =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
    private static final List<Integer> remainderList = new ArrayList<>();
    public static String convertRequestKey(int requestKey) {
        if (requestKey < 62) return String.valueOf(char62Array[requestKey]);

        int divisor = requestKey;
        while (divisor != 0) {
            remainderList.add(0, divisor % 62);
            divisor /= 62;
        }

        StringBuilder convertedKey = new StringBuilder();
        for(Integer remainder: remainderList) {
            convertedKey.append(char62Array[remainder]);
        }
        remainderList.clear();
        return convertedKey.toString();
    }

    public static int getRequestKey(String convertedKey) {
        int requestKey = 0;
        for(int i = 0; i < convertedKey.length(); i++) {
            for (int j = 0; j < 62; j++) {
                if (convertedKey.charAt(i) == char62Array[j]) {
                    requestKey += j * Math.pow(62, convertedKey.length() - (i + 1));
                    break;
                }
            }
        }
        return requestKey;
    }
}
