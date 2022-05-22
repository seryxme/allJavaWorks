package chapter5;//Exercise 5.23

public class DeMorgansLaws {
    public static void main(String[] args) {

        int x = 5;
        int y = 7;
        int a = 5;
        int b = 4;
        int g = 3;
        int i = 6;
        int j = 2;

        System.out.println(!(x < 5) && !(y >= 7));
        System.out.println(!((x < 5) || (y >= 7)));
        System.out.println(!(a == b) || !(g != 5));
        System.out.println(!((a == b) && (g != 5)));
        System.out.println(!((x <= 8) && (y > 4)));
        System.out.println(!(x <= 8) || !(y > 4));
        System.out.println(!((i > 4) || (j <= 6)));
        System.out.println(!(i > 4) && !(j <= 6));

    }
}
