package Practice.scrabble;


import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TilesBag {
    private final ArrayList<Character> letters;
    private final Map<Character, Integer> letterCount;
    private final Map<Character, Integer> letterScore;

    public TilesBag() {
        letters = new ArrayList<>();
        letterCount = new HashMap<>();
        letterScore = new HashMap<>();

        generateLetters();
        addLetterScores();
    }

    public void generateLetters() {
        int count = 0;
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            switch (letter) {
                case 'A', 'I' -> {
                    count = 9;
                    letterCount.put(letter, count);
                    for (int i = 0; i < count; i++) {
                        letters.add(letter);
                    }
                }
                case 'B', 'C', 'F', 'H', 'M', 'P', 'V', 'W', 'Y' -> {
                    count = 2;
                    letterCount.put(letter, count);
                    for (int i = 0; i < count; i++) {
                        letters.add(letter);
                    }
                }
                case 'D', 'L', 'S' -> {
                    count = 4;
                    letterCount.put(letter, count);
                    for (int i = 0; i < count; i++) {
                        letters.add(letter);
                    }
                }
                case 'E' -> {
                    count = 12;
                    letterCount.put(letter, count);
                    for (int i = 0; i < count; i++) {
                        letters.add(letter);
                    }
                }
                case 'G' -> {
                    count = 3;
                    letterCount.put(letter, count);
                    for (int i = 0; i < count; i++) {
                        letters.add(letter);
                    }
                }
                case 'J', 'K', 'Q', 'X', 'Z' -> {
                    count = 1;
                    letterCount.put(letter, count);
                    for (int i = 0; i < count; i++) {
                        letters.add(letter);
                    }
                }
                case 'N', 'R' -> {
                    count = 6;
                    letterCount.put(letter, count);
                    for (int i = 0; i < count; i++) {
                        letters.add(letter);
                    }
                }
                case 'O' -> {
                    count = 8;
                    letterCount.put(letter, count);
                    for (int i = 0; i < count; i++) {
                        letters.add(letter);
                    }
                }
            }
        }
        letterCount.put('*', 2);
        for (int i = 0; i < 2; i++) {
            letters.add('*');
        }
    }

    public void addLetterScores() {
        int score = 0;
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            switch (letter) {
                case 'A', 'E', 'I', 'L', 'N', 'O', 'R', 'S', 'T', 'U' -> {
                    score = 1;
                    letterScore.put(letter, score);
                }
                case 'B', 'C', 'M', 'P' -> {
                    score = 3;
                    letterScore.put(letter, score);
                }
                case 'D', 'G' -> {
                    score = 2;
                    letterScore.put(letter, score);
                }
                case 'F', 'H', 'V', 'W', 'Y' -> {
                    score = 4;
                    letterScore.put(letter, score);
                }
                case 'J', 'X' -> {
                    score = 8;
                    letterScore.put(letter, score);
                }
                case 'K' -> {
                    score = 5;
                    letterScore.put(letter, score);
                }
                case 'Q', 'Z' -> {
                    score = 10;
                    letterScore.put(letter, score);
                }
            }
        }
        letterCount.put('*', 0);
    }

    public int getLetterScore(char letter) {
        return letterScore.get(letter);
    }

    public int getLetterCount(char letter) {
        return letterCount.get(letter);
    }

    public char[] getLetters(int numOfTiles) {
        SecureRandom randInt = new SecureRandom();
        char[] tilesList = new char[numOfTiles];
        int index = randInt.nextInt(100);
        for (int i = 0; i < numOfTiles; i++) {
            tilesList[i] = letters.get(index);
        }
        return tilesList;
    }

    public int getLettersLeft() {
        return letters.size();
    }

    public List<Character> getTilesBag() {
        return letters;
    }
}
