package myExercises.hackerrank;


import java.util.*;


/**
 * Sherlock considers a string to be valid if all characters of the string appear the same number of times.
 * It is also valid if he can remove just 1 character at  1 index in the string, and the remaining characters will occur the same number of times.
 * Given a string , determine if it is valid. If so, return YES, otherwise return NO.
 */
public class SherlockAndValidString {

    public static void main(String[] args) {
//  ;
//        System.out.println(isValid("abcdefghhgfedecba"));
//        System.out.println(isValid("aabbccddeefghi"));
        System.out.println(isValid("aaaabbcc"));
//        System.out.println(isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd"));

    }

    public static String isValid(String s) {
        // Write your code here
        if (s == null) return "NO";
        Map<Character, Integer> m = new HashMap<>();
        char[] arr = s.toCharArray();

        for (char c : arr) {
            if (m.containsKey(c)) {
                m.put(c, m.get(c) + 1);
            } else m.put(c, 1);
        }
        m.forEach((k, v) -> System.out.println(k + " " + v));
        Map<Integer, Integer> m2 = new HashMap<>();

        for (Integer i : m.values()) {
            if (m2.containsKey(i)) m2.put(i, m2.get(i) + 1);
            else m2.put(i, 1);
        }
        m2.forEach((k, v) -> System.out.println(k + " " + v));
        if (m2.size() > 2) return "NO";
        if (m2.size() == 1) return "YES";
        System.out.println(m2.get(1));
        if ( m2.containsKey(1) && m2.get(1)==1 ) return "YES";

        Integer[] in = m2.keySet().toArray(new Integer[m2.size()]);
        int l = 0;
        if (m2.containsValue(1)) {
            l = in[0] - in[1];
        }

        return (l == 1 || l == -1) ? "YES" : "NO";
    }


}
