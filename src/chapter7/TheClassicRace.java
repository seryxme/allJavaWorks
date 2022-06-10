package chapter7;

import java.util.Scanner;

public class TheClassicRace {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        TheRace epicRace = new TheRace();

        epicRace.clearRaceCourse();
        epicRace.displayCourse();

        System.out.println("""
                
                Welcome to The Classic Race!
                
                The contenders are the Tortoise and the Hare.
                Who do you support? Place your bets now!
                
                Press 1 to start race.
                """);
        int response = reader.nextInt();

        if(response == 1) {
            System.out.println("""
                    
                    BANG!!!
                    AND THEY'RE OFF!!!
                    """);

            int harePosition = 1;
            int tortoisePosition = 1;
            int timer = 0;

            try {
                while (timer != -1) {
                    epicRace.clearRaceCourse();

                    epicRace.moveHare(harePosition - 1);
                    harePosition = epicRace.getHarePosition() + 1;
                    if (harePosition >= 70) {
                        break;
                    }

                    epicRace.moveTortoise(tortoisePosition - 1);
                    tortoisePosition = epicRace.getTortoisePosition() + 1;
                    if (tortoisePosition >= 70) {
                        break;
                    }

                    if (harePosition == tortoisePosition){
                        System.out.println("The tortoise bites the hare!");
                        epicRace.setSpot(harePosition - 1);
                    }

                    epicRace.displayCourse();

                    timer += 5;
                    Thread.sleep(5000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (harePosition >= 70) {
                System.out.printf("%nHare wins in %d seconds. Yuch.", timer);
            }

            if (tortoisePosition >= 70) {
                System.out.printf("%nTORTOISE WINS in %d seconds!!! YAY!!!", timer);
            }
        }

    }

}
