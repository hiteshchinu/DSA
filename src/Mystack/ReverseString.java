package MyStack;

import java.util.Stack;

public class ReverseString {
    public static void main(String args[]){
        String str = "unihchsetih/moc.buhtig//:sptth";

        Stack<Character> stack = new Stack<>();
        
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        
        System.out.println("Reverse of String is: " + reversed.toString());
    }
}