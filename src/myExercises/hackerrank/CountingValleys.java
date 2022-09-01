package myExercises.hackerrank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.*;


//Counting Valleys
public class CountingValleys {


    /**
     * An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly  steps, for every step it was noted if it was an uphill U,
     * or a downhill D,  step. Hikes always start and end at sea level, and each step up or down represents a  unit change in altitude.
     * We define the following terms:
     * A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
     * A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
     * Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
     */

    public static void main(String[] args) throws IOException {
        int valley , valley1 ;
        valley = countingValleys(8, "DDUUUUDDUUDDDDUU");
        System.out.println(valley);
        valley1 = countingValleys1(8, "DDUUUUDDUUDDDDUU");
        System.out.println(valley1);
    }


    public static int countingValleys1(int steps, String path) {
        long start = System.currentTimeMillis();

        int d = 0, u = 0, valley = 0;
        char[] pathAr ;

        pathAr = path.toCharArray();

        for (Character elem : pathAr) {

            if ((u == d) && (elem.equals('D')))
                valley++;
            if (elem.equals('D')) d++;
            if (elem.equals('U')) u++;
        }

        long end = System.currentTimeMillis();
        System.out.println("countingValleys1  Complation time is: "+(end-start));
        return valley;
    }


    /**
     * This method cannot pass all tests due time limitation
     */
    public static int countingValleys(int steps, String path) {
        long start = System.currentTimeMillis();

        // Write your code here
        int d = 0, u = 0, valley = 0;
        Object next;

        List<Character> pathArray = new ArrayList<>(steps);
        for (char c : path.toCharArray()) {
            pathArray.add(c);
        }

        Iterator<Character> i = pathArray.iterator();

        while (i.hasNext()) {
            next = i.next();

            if ((u == d) && (next.equals('D'))) {
                valley++;
            }

            if (next.equals('D')) d++;
            if (next.equals('U')) u++;
        }

        long end = System.currentTimeMillis();
        System.out.println("countingValleys  Complation time is: "+(end-start));

        return valley;
    }

}
