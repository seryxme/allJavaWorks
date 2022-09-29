package Practice.kata;

public class SpinWords {
    public static void main(String[] args) {
        System.out.println(spinWords("Long words get spinned!"));
    }

    public static String spinWords(String sentence) {
        String[] wordsArray = sentence.split(" ");
        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].length() > 4) {
                char[] charArray = wordsArray[i].toCharArray();
                StringBuilder reverseWord = new StringBuilder();
                for (int j = charArray.length-1; j >= 0; j--) {
                    reverseWord.append(charArray[j]);
                }
                wordsArray[i] = String.valueOf(reverseWord);
            }
        }
        return String.join(" ", wordsArray);
    }
}
