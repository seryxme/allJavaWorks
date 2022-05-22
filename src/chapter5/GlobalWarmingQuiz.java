package chapter5;//Exercise 5.31

import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String... args) {

        Scanner answerReader = new Scanner(System.in);

        System.out.println("What is global warming?\n" +
                "\n" +
                "1. It is the warming of the globe.\n" +
                "2. It refers to the rise in average global temperatures, which is linked to significant \n" +
                "\timpacts on humans, wildlife, and ecosystems around the world.\n" +
                "3. It refers to the heating of certain places in the world not affecting others.\n" +
                "4. It is a change in temperature of the atmosphere.");

        System.out.println("Choose your answer from 1 to 4: ");
        int answer = answerReader.nextInt();

        int correctAnswers = 0;

        switch (answer) {
            case 1:
                System.out.println("Incorrect.\n");
                break;
            case 2:
                System.out.println("Correct!\n");
                ++correctAnswers;
                break;
            case 3:
                System.out.println("Incorrect.\n");
                break;
            case 4:
                System.out.println("Incorrect.\n");
                break;
        }

        System.out.println("Which of the following is NOT a greenhouse gas?\n" +
                "\n" +
                "1. helium\n" +
                "2. methane\n" +
                "3. nitrous oxide\n" +
                "4. water vapor");

        System.out.println("Choose your answer from 1 to 4: ");
        answer = answerReader.nextInt();

        switch (answer) {
            case 1:
                System.out.println("Correct!\n");
                ++correctAnswers;
                break;
            case 2:
                System.out.println("Incorrect.\n");
                break;
            case 3:
                System.out.println("Incorrect.\n");
                break;
            case 4:
                System.out.println("Incorrect.\n");
                break;
        }

        System.out.println("Which of the following is NOT an effect of global warming?\n" +
                "\n" +
                "1. Extreme droughts and floods.\n" +
                "2. Loss of sea ice, \n" +
                "3. Increased atmospheric oxygen.\n" +
                "4. Longer, more intense heat waves.");

        System.out.println("\nChoose your answer from 1 to 4: ");
        answer = answerReader.nextInt();

        switch (answer) {
            case 1:
                System.out.println("Incorrect.\n");
                break;
            case 2:
                System.out.println("Incorrect.\n");
                break;
            case 3:
                System.out.println("Correct!\n");
                ++correctAnswers;
                break;
            case 4:
                System.out.println("Incorrect.\n");
                break;
        }

        System.out.println("One of the following is NOT a reason used to disprove global warming.\n" +
                "\n" +
                "1. There is no scientific consensus on global warming.\n" +
                "2. The amount of rainfall increases every year.\n" +
                "3. The climate has changed before so it’s not a big deal.\n" +
                "4. People, animals and plants will just be able to.");

        System.out.println("\nChoose your answer from 1 to 4: ");
        answer = answerReader.nextInt();

        switch (answer) {
            case 1:
                System.out.println("Incorrect.\n");
                break;
            case 2:
                System.out.println("Correct!\n");
                ++correctAnswers;
                break;
            case 3:
                System.out.println("Incorrect.\n");
                break;
            case 4:
                System.out.println("Incorrect.\n");
                break;
        }

        System.out.println("Which of the following is NOT a global warming fact?\n" +
                "\n" +
                "1. Nine of the 10 warmest years since 1880 have occurred since 2005.\n" +
                "2. The concentration of CO2 in the atmosphere has risen from around 280 ppm in " +
                "pre-Industrial time, to 413 ppm as of early 2020.\n" +
                "3. Global sea level has risen by about 8 inches since reliable record keeping began in 1880.\n" +
                "4. 60% of aquatic life has gone extinct in the last decade.");

        System.out.println("\nChoose your answer from 1 to 4: ");
        answer = answerReader.nextInt();

        switch (answer) {
            case 1:
                System.out.println("Incorrect.\n");
                break;
            case 2:
                System.out.println("Incorrect.\n");
                break;
            case 3:
                System.out.println("Incorrect.\n");
                break;
            case 4:
                System.out.println("Correct!\n");
                ++correctAnswers;
                break;
        }
        if (correctAnswers == 5) {
            System.out.println("\nExcellent!\nYou got perfect scores.");
        } else if (correctAnswers == 4) {
            System.out.println("\nVery Good!\nYou got 4 out of 5 correctly.");
        }else System.out.println("Time to brush up on your knowledge of global warming.\n" +
                "Get more information from the following websites:\n" +
                "https://studentenergy.org/influencer/climate-change/\n" +
                "https://www.nrdc.org/stories/global-warming-101\n" +
                "https://climate.nasa.gov/\n" +
                "https://www.amnesty.org/en/what-we-do/climate-change/\n" +
                "\n" +
                "You can also calculate your carbon footprint here:\n" +
                "https://warmheartworldwide.org/environmental-news-2/");

    }
}
