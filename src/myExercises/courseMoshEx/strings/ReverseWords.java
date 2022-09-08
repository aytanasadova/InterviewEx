package myExercises.courseMoshEx.strings;

import java.nio.file.attribute.AclEntry;
import java.util.Arrays;

import java.util.Collections;

public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(reverse("Hello there"));
    }

    public static String reverse(String sentence) {
        if (sentence == null) return "";
        String[] words = sentence.trim().split("");
        Collections.reverse(Arrays.asList(words));
        return String.join("", words);
    }
}
