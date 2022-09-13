package myExercises.hackerrank.interwiePreperation.strings.stringTokens;

import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        if (s==null || s.trim().length()==0) {
            System.out.println(0);
            return;
        }
        s=s.trim();
        // Write your code here.
        String[] sr= s.split("[ ,'?_@!.]+");
        System.out.println(sr.length);
        for (String e : sr) {
            System.out.println(e);
        }


    }
}
