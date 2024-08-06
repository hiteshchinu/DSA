package LeetcodeStack;

import java.util.Stack;

public class SortStack {
    public class Solution {

    public static void sortStack(Stack<Integer> stack) {
        // Base case: if stack is empty or has only one element, it's already sorted
        if (stack.isEmpty()) return;

        int top = stack.pop();
        sortStack(stack);
        
        // Insert the removed element back in the sorted stack
        insertSorted(stack, top);
    }
    
    // Function to insert an element in the sorted stack
    private static void insertSorted(Stack<Integer> stack, int element) {
        // Base case: if stack is empty or the element is greater than the top element
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }
        
        int top = stack.pop();
        
        insertSorted(stack, element);
        
        stack.push(top);
    }
}
}
