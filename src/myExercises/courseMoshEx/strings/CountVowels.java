package myExercises.courseMoshEx.strings;

public class CountVowels {

    public static void main(String[] args) {
        countVowels("Hello world");
    }

    static int countVowels(String words) {
        if (words==null) return -1;
        int vowelCount = 0;
        String vowels = "ouiae";
        words = words.toLowerCase();

        for (char ch : words.toCharArray()) {
            if (words.contains(String.valueOf(ch)))
                vowelCount++;
        }
        return vowelCount;
    }
}
