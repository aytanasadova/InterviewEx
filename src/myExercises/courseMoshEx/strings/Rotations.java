package myExercises.courseMoshEx.strings;


import java.util.Arrays;

/**
 * // TODO: 05/09/2022  not working))))0
 */
public class Rotations {

    public static void main(String[] args) {
        System.out.println(isRotations("ABCDE","EABCD"));
    }

    //    EABCD        CDEAB
    public static boolean isRotations(String str1, String str2) {
        if (str1 == null || str2 == null) return false;
        if (str1.length() != str2.length()) return false;
boolean result=true;
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        char first = str1.charAt(0);
        int sc = str2.indexOf(first);
        for (int i = 0; i < str1.length(); i++) {
            if ((i + sc) > arr2.length - 1 && arr1[i] != arr2[i + sc])
                return   false;
            else if (arr1[i] != arr2[arr2.length - 1 - i])
        return false;
        }
        return result;
    }
}
