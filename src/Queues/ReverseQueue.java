package Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();
    
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println("Before: " + queue);

        //Reverse the queue
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
        System.out.println("After: " + queue);
    }
}
