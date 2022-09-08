package myExercises.hackerrank.general.arrays;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale indl=new Locale("en","in","");
        // Write your code here.
        NumberFormat usf=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat chf=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat ff=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat inf=NumberFormat.getCurrencyInstance(indl);

        System.out.println("US: " + usf.format(payment));
        System.out.println("India: " + inf.format(payment));
        System.out.println("China: " + chf.format(payment));
        System.out.println("France: " + ff.format(payment));
    }
}
