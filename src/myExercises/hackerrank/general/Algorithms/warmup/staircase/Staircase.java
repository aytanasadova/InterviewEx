package myExercises.hackerrank.general.Algorithms.warmup.staircase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staircase {

    public static void staircase(int n) {
        // Write your code here
        for (int m = 1; m <= n; m++) {

            for (int i = n - m; i > 0; i--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= m; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        staircase(n);

        bufferedReader.close();
    }
}
