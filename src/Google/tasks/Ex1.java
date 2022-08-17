package Google.tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) throws FileNotFoundException {

//         Task to find given string into file context;

        findStringInFile("/sdf", "abc");
    }


    static boolean findStringInFile(String path, String str) throws FileNotFoundException {

        Scanner sc = new Scanner(new File(path));
        Boolean result = false;

        while (sc.hasNextLong() && (result == Boolean.FALSE)) {
            String aLong = sc.next();
            result = aLong.contains(str);
        }

        return result;
    }
}