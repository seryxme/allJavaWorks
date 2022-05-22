package chapter5;//Exercise 5.29

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {

        int days = 1;
        int gift = 13;
        String day;

        while(days <= 12) {

            switch (days) {
                case 1:
                    day = "first";
                    break;
                case 2:
                    day = "second";
                    break;
                case 3:
                    day = "third";
                    break;
                case 4:
                    day = "fourth";
                    break;
                case 5:
                    day = "fifth";
                    break;
                case 6:
                    day = "sixth";
                    break;
                case 7:
                    day = "seventh";
                    break;
                case 8:
                    day = "eighth";
                    break;
                case 9:
                    day = "ninth";
                    break;
                case 10:
                    day = "tenth";
                    break;
                case 11:
                    day = "eleventh";
                    break;
                default:
                    day = "twelfth";
                    break;
            }
            System.out.printf("On the %s day of Christmas, my true love sent to me %n", day);
            gift--;
            switch (gift) {
                case 1:
                    System.out.println("\tTwelve drummers drumming,");
                case 2:
                    System.out.println("\tEleven pipers piping,");
                case 3:
                    System.out.println("\tTen lords a-leaping,");
                case 4:
                    System.out.println("\tNine ladies dancing");
                case 5:
                    System.out.println("\tEight maids a-milking");
                case 6:
                    System.out.println("\tSeven swans a-swimming,");
                case 7:
                    System.out.println("\tSix geese a-laying,");
                case 8:
                    System.out.println("\tFive gold rings,");
                case 9:
                    System.out.println("\tFour calling birds,");
                case 10:
                    System.out.println("\tThree French hens,");
                case 11:
                    System.out.println("\tTwo turtle doves, and");
                default:
                    System.out.println("\tA partridge in a pear tree.");
            }
            days++;

        }
    }
}
