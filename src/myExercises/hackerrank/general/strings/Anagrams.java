package myExercises.hackerrank.general.strings;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length()!=b.length()) return false;
        a=a.toLowerCase();
        b=b.toLowerCase();
        Map<Character,Integer> ma=new TreeMap<>();
        Map<Character,Integer> mb=new TreeMap<>();
        for(int i=0;i<a.length();i++){
            if ( ma.containsKey(a.charAt(i)) ) ma.put(a.charAt(i), ma.get(a.charAt(i)+1));
            else  ma.put(a.charAt(i), 1);

            if ( mb.containsKey(b.charAt(i)) ) mb.put(b.charAt(i), mb.get(b.charAt(i)+1));
            else  mb.put(b.charAt(i), 1);

        }

        for (int j=0;j<ma.size();j++)
            if(ma.get(j)!=mb.get(j)) return false;
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
