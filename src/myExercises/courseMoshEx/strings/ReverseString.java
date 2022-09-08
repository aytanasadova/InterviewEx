package myExercises.courseMoshEx.strings;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverse("Hello"));;
    }

    static String reverse(String word) {
        if (word == null) return "";
        StringBuilder sb = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}
