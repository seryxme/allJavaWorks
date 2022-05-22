package chapter2;

public class Question35 {
    public static void main(String[] args) {

        long numberOfStones = 2_300_000L;
        int weightOfStoneInKg = 2500;
        int numberOfYears = 27;
        int numberOfHours = numberOfYears * 365 * 24;
        int numberOfMinutes = numberOfHours * 60;

        long weightPerYear = numberOfStones * weightOfStoneInKg / numberOfYears;
        long weightPerHour = numberOfStones * weightOfStoneInKg / numberOfHours;
        long weightPerMinute = numberOfStones * weightOfStoneInKg / numberOfMinutes;

        System.out.printf("%dkg of the Great Pyramid was built each year.%n", weightPerYear);
        System.out.printf("%dkg of the Great Pyramid was built each hour.%n", weightPerHour);
        System.out.printf("%dkg of the Great Pyramid was built each minute.%n", weightPerMinute);
    }
}
