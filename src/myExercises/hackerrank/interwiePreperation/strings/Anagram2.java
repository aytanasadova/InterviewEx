package myExercises.hackerrank.interwiePreperation.strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram2 {


        static boolean isAnagram(String a, String b) {
            // Complete the function
            if (a.length()!=b.length()) return false;

            char[] ca=a.toLowerCase().toCharArray();
            char[] cb=b.toLowerCase().toCharArray();
            String aCurrElem,bCurrElem;
            Map<String, Integer> m=new HashMap<>();

            for(int i=0;i<a.length();i++){
                aCurrElem=String.valueOf(ca[i]);
                bCurrElem=String.valueOf(cb[i]);
                if (m.containsKey(ca[i])) m.put(aCurrElem, m.get(aCurrElem)+1);
                else  m.put(aCurrElem, 1);

                if (m.containsKey(cb[i])) m.put(bCurrElem, m.get(bCurrElem)-1);
                else m.put(bCurrElem, -1);
            }
            Integer rs= Collections.max(m.values()) ;

            return  (rs==0)?true:false;
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
