package myExercises.courseMoshEx.stack;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        String s = "abcde";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())  sb.append(stack.pop());

        System.out.println(sb);
    }
}
