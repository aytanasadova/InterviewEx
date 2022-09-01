package myExercises.hackerrank;
import java.util.Arrays;
import java.util.List;

/**
 * There is a new mobile game that starts with consecutively numbered clouds.
 * Some clouds are thunderheads and others are cumulus.
 * The player can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus 1  or 2 .
 * The player must avoid the thunderheads. Determine the minimum number of jumps it will take to jump from the starting postion to the last cloud.
 * It is always possible to win the game.
 * For each game, you will get an array of clouds numbered 0 if they are safe or  1 if they must be avoided.
 */
public class JumpingOnTheClouds {

    public static void main(String[] args) {
        List<Integer> c = Arrays.asList(0, 1, 0, 0, 0, 1, 0);
        int jumpingCount = jumpingOnClouds(c);
        System.out.println(jumpingCount);
    }


    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int jumpingCount = 0,currentIndex = 0;

        while (currentIndex < c.size()-1) {
            if (((currentIndex + 2)<= c.size()-1) && (c.get(currentIndex + 2) == 0) )  currentIndex = currentIndex + 2;
            else currentIndex++;
            jumpingCount++;
        }
        return jumpingCount;
    }

}
