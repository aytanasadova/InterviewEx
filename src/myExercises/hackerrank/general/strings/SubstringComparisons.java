package myExercises.hackerrank.general.strings;

import java.util.Scanner;

public class SubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest ;
        String largest ;

        String current;
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest=s.substring(0,k);
        largest=s.substring(0,k);
        for(int i=1; (i+k)<=s.length();i++){
            current=s.substring(i,(i+k));
            if (current.compareTo(largest)>0)  largest=current;
            if (current.compareTo(smallest)<0)  smallest=current;
        }
        return smallest + "\n" + largest;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
    }
