package Stack;

import java.util.Stack;
public class Main {
    public static void main(String[] args) {

        Stack<Integer> newStack = new Stack<>();

        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);

        System.out.println(newStack);

        
        System.out.println(newStack.isEmpty());

        System.out.println(newStack.pop());
        System.out.println(newStack.peek());
        System.out.println(newStack.pop());
        System.out.println(newStack.pop());
        System.out.println(newStack.pop());

        System.out.println(newStack.isEmpty());

        while (!newStack.isEmpty()) {
            Integer value = newStack.pop();
            System.out.println(value);
        } //it empties the stack beause it pops each element and print it


        // System.out.println(newStack.pop());
    }
}
