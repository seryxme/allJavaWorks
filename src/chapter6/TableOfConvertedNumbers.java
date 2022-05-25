package chapter6;

public class TableOfConvertedNumbers {
    public static void main(String[] args) {

        System.out.printf("%-10s%-12s%-8s%s%n", "Decimal", "Binary", "Octal", "Hexadecimal");

        for(int i = 1; i <= 256; i++) {
            System.out.printf("%-10s%09d    %03d%8s%n", i, binary(i), octal(i), hex(i));
        }

    }

    public static int binary(int decimalNumber) {

        int digitSum = 0;

        for(int i = 0; i < 10; i++) {
            int digit = decimalNumber % 2;
            digitSum += digit * (Math.pow(10, i));
            decimalNumber /= 2;
        }

        return digitSum;
    }

    public static int octal(int decimalNumber) {

        int digitSum = 0;

        for(int i = 0; i < 4; i++) {
            int digit = decimalNumber % 8;
            digitSum += digit * (Math.pow(10, i));
            decimalNumber /= 8;
        }

        return digitSum;
    }

    public static String hex(int decimalNumber) {
        return Integer.toHexString(decimalNumber);
    }
}
