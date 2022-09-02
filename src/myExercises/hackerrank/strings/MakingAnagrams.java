package myExercises.hackerrank.strings;

/**
 * A student is taking a cryptography class and has found anagrams to be very useful.
 * Two strings are anagrams of each other if the first string's letters can be rearranged to form the second string.
 * In other words, both strings must contain the same exact letters in the same exact frequency.
 * For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
 * The student decides on an encryption scheme that involves two large strings.
 * The encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. Determine this number.
 * Given two strings, a and ,b that may or may not be of the same length,
 * determine the minimum number of character deletions required to make a and b anagrams. Any characters can be deleted from either of the strings.
 */
public class MakingAnagrams {

    public static void main(String[] args) {
        int result = makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke");
        System.out.println(result);
    }


    public static int makeAnagram(String a, String b) {
        // Write your code here
        if (a.equals(b)) return 0;
        if (b.contains(a)) return b.length() - a.length();
        if (a.contains(b)) return a.length() - b.length();

        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        int aSize = aArr.length;
        int bSize = bArr.length;
        int commonCount = 0;
        boolean found;

        for (int i = 0; i < aSize; i++) {
            found = false;
            for (int j = 0; j < bSize; j++) {
                if (aArr[i] == bArr[j] && found==false) {
                    commonCount = commonCount + 1;
                    bArr[j] = 0;
                    found=true;
                }
            }
        }
        int result = (aSize - commonCount) + bSize - commonCount;
        return result;
    }

}
