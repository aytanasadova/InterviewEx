package myExercises.hackerrank.dictionary_hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings, determine if they share a common substring. A substring may be as small as one character.
 */
public class TwoStrings {

    /*
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        Map<Character,Integer> m=new HashMap<>();
        Character myCharacter;

        for (int i=0;i<s1.length();i++){
            myCharacter=s1.charAt(i);
            if (m.containsKey(s1.charAt(i)))
                m.put(myCharacter,m.get(myCharacter)+1);
            else
                m.put(myCharacter, 1);
        }

        for (int j=0;j<s2.length();j++){
            myCharacter=s2.charAt(j);
            if (m.containsKey(myCharacter)) return "YES";

        }

        return "NO";
    }
}
