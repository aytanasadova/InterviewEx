package myExercises.hackerrank.general.Algorithms.warmup.timeConversion;

import java.io.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        Integer hourInt;
        String hourString,resultS="",newHourString="";

        hourString=s.substring(0,2);
        hourInt=Integer.valueOf(hourString);


        if (s.contains("AM"))
        {
            s=s.replace("AM", "");
            if (hourInt==12) newHourString="00";
            else newHourString=hourString;
        }
        else if(s.contains("PM"))
        {
            s=s.replace("PM", "");
            if (hourInt==12) newHourString="12" ;
            else newHourString=String.valueOf(hourInt+12);
        }

        return  s.replace(hourString,newHourString);

    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
