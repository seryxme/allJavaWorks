package tdd;

public class MysteryNumber {

    int mysteryNumber = 7;

    public String guess(int guessedNumber) {
        if (guessedNumber > mysteryNumber) return "Too high.";
        if (guessedNumber < mysteryNumber) return "Too low.";
        return "Correct!";
    }
}
