package myExercises.hackerrank.general.Algorithms.implementation.extraLongFactorials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class ResultIter {

    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger f=BigInteger.valueOf(1);
        f=nextPow(f,BigInteger.valueOf(n));
        System.out.println(f);
    }

    private static BigInteger nextPow(BigInteger lastPow,BigInteger n){
        lastPow=lastPow.multiply(n);
        if (n.intValue()>1) nextPow(lastPow,n.subtract(BigInteger.valueOf(1)));
        return lastPow;
    }

}

public class SolutionIteration {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        ResultIter.extraLongFactorials(n);

        bufferedReader.close();
    }
}
