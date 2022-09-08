package myExercises.hackerrank.interwiePreperation.strings;


/**
 * https://www.hackerrank.com/challenges/repeated-string/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 * There is a string s, of lowercase English letters that is repeated infinitely many times.
 * Given an integer n find and print the number of letter a's in the first n letters of the infinite string.
 */
public class RepeatedString {

    public static void main(String[] args) {

//        long repeatCount = repeatedString("a", 1000000000000L);
        long repeatCount = repeatedString("aba", 10);
        System.out.println(repeatCount);
    }


    public static long repeatedString(String s, long n) {
        long repeatCountInFullStr = 0, repeatCount, reminder;
        long sLength = s.length();
        long absoluteResult = n / sLength;

        reminder=n %sLength;

        char[] sArr;
        sArr = s.toCharArray();

        for (char c : sArr) {
            if (c == 'a')
                repeatCountInFullStr = repeatCountInFullStr + 1;
        }
        repeatCount = absoluteResult * repeatCountInFullStr;


        for (int i = 0;reminder>0 && i < reminder; i++) {
            if (sArr[i] == 'a')
                repeatCount = repeatCount + 1;
        }
        return repeatCount;
    }

}
