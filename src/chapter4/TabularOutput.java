package chapter4;//Exercise 4.22

public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N\t\tN^2\t\tN^3\t\tN^4\n");

        int number = 1;

        while(number <= 5) {
            int num2 = number * number;
            int num3 = number * num2;
            int num4 = number * num3;

            System.out.println(number+"\t\t"+num2+"\t\t"+num3+"\t\t"+num4);
            number++;
        }
    }
}
