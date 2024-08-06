package LeetcodeStack;

import java.util.Stack;

//https://www.naukri.com/code360/problems/reverse-stack-using-recursion_631875
public class ReverseStackUsingRecursion {

public class Solution {
    
    // Function to insert an element at the bottom of the stack
    public static void insertAtBottom(Stack<Integer> stack, int element) {
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }
        
        int top = stack.pop();
        insertAtBottom(stack, element);
        stack.push(top);
    }
    
    // Function to reverse the stack using recursion
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        
        int top = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, top);
    }
}

}
