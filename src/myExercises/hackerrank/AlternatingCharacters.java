package myExercises.hackerrank;



/**
 * https://www.hackerrank.com/challenges/alternating-characters/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings&h_r=next-challenge&h_v=zen
 * You are given a string containing characters A and B only.
 * Your task is to change it into a string such that there are no matching adjacent characters.
 * To do this, you are allowed to delete zero or more characters in the string.
 * Your task is to find the minimum number of required deletions.
 * ABABABAB -> 0, AAAA-> 3
 */
// TODO: 01/09/2022  not solved 
public class AlternatingCharacters {
    public static void main(String[] args) {
        int result = alternatingCharacters("AAAA");
        System.out.println(result);
    }

    public static int alternatingCharactersV1(String s) {
        if (s==null) return 0;
        char [] sArr=s.toCharArray();
        int count=0;
        char firstLetter=sArr[0];
        char nextLetter;

        if (firstLetter=='A') nextLetter='B';
        else nextLetter='A';

        for (int i=0;i<sArr.length;i++){
            if (sArr[i+1]==nextLetter) nextLetter=sArr[i];
            else count++;
        }

        return count;

    }


    public static int alternatingCharacters(String s) {
        // Write your code here
        if (s==null) return 0;

        int result=0;
        char[] sArr=s.toCharArray();
        char firstLetter;
        char nextLetter;

        if (sArr[0]=='A') {
            firstLetter='A';
            nextLetter='B';
        }
        else   {
            firstLetter='B';
            nextLetter='A';
        }
        for (int i=0; i<sArr.length-1;i++){
            if (sArr[i+1]==nextLetter){
                nextLetter=getNextLetter(nextLetter);
            }
            else result ++;
        }

        return result;
    }

    private static char getNextLetter(char c){
        return (c=='A')?'B':'A';
    }
}


