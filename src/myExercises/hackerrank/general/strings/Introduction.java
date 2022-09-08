package myExercises.hackerrank.general.strings;

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder aa=new StringBuilder();
        aa.append(A.substring(0,1).toUpperCase());
        aa.append(A.substring(1,A.length()));

        StringBuilder bb=new StringBuilder();
        bb.append(B.substring(0,1).toUpperCase());
        bb.append(B.substring(1,B.length()));

        System.out.println(A.length()+B.length());
        System.out.println((A.compareTo(B)>0)?"Yes":"No");
        System.out.println(aa+" "+bb);
    }
}
