package myExercises.hackerrank.dictionary_hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SerlockAnagrams {

    public static int sherlockAndAnagrams(String s) {
        // Write your code here
        Map<String,Integer> m=new HashMap<>();
        int anagramCount=0,sLength=s.length(),i,j=0;
        char[] currenStringArr ;
        String sortedString ;

        for(i=0;i<=sLength;i++)   {
            for (j=1; j<sLength+1;j++){
                if(j>i) {
                    currenStringArr=s.substring(i, j).toCharArray();
                    Arrays.sort(currenStringArr);

                    sortedString=String.valueOf(currenStringArr);

                    if (m.containsKey(sortedString))
                    {
                        anagramCount=anagramCount+m.get(sortedString);
                        m.put(sortedString, m.get(sortedString)+1);
                    }
                    else m.put(sortedString, 1);
                }
            }
        }
        return anagramCount;
    }

}
