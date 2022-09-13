package myExercises.hackerrank.interwiePreperation.strings.Anagram3;

import java.util.Scanner;

public class Anagram3 {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length()!=b.length()) return false;

        char[] ca=a.toLowerCase().toCharArray();
        char[] cb=b.toLowerCase().toCharArray();
        boolean rs=false;

        for(int i=0;i<a.length();i++){
            rs=false;
            for(int j=0; !rs && j<a.length();j++){
                System.out.println("cb[j]= " +cb[j]+" ca[i]=   "+ca[i]);
                if (cb[j]==ca[i]){
                    cb[j]='0';
                    rs=true;
                }
            }
        }
        return  rs;
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
