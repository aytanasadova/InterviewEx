package myExercises.hackerrank.interwiePreperation.arrays;

import java.util.List;

public class LeftRotation {
    public static void main(String[] args) {

    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here

        for (int i = 0; i < d; i++) {
            a.add(a.remove(0));
        }
        return a;
    }




}
