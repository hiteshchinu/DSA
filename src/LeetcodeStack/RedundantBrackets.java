package LeetcodeStack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

// https://www.naukri.com/code360/problems/redundant-brackets_975473
public class RedundantBrackets {
    public class Solution 
{
    public static boolean findRedundantBrackets(String s) {
        Stack<Character> stack = new Stack<>();
        List<Character> operators = Arrays.asList('+', '-', '*', '/');

        for (char ch : s.toCharArray()) {
            if (ch == '(' || operators.contains(ch)) {
                stack.push(ch);
            } else if (ch == ')') {
                char top = stack.pop();
                if (!operators.contains(top)) {
                    return true; // Yes, it's redundant.
                }
                while (!stack.isEmpty() && operators.contains(stack.peek())) {
                    stack.pop();
                }
                stack.pop(); // Pop the opening bracket.
            }
        }

        return false; // No redundant brackets found.
    }
}
}
