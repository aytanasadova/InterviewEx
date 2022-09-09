package myExercises.hackerrank.general.strings;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int ln=A.length();
        boolean rs=true;
        for (int i=0; i<ln/2;i++)
            if (A.charAt(i)!=A.charAt(ln-(i+1)))  rs=false;;
        System.out.println(rs?"Yes":"No");
    }
}
