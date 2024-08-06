package Queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queuee {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());

        System.out.println(queue.poll());
        // System.out.println(queue.poll());
        // System.out.println(queue.poll());
        // System.out.println(queue.poll());
        // System.out.println(queue.poll());
        // System.out.println(queue.poll());
        // System.out.println(queue.poll());

        // System.out.println(queue.peek());
        System.out.println(queue);

        // queue.clear();
        // System.out.println(queue);

        // System.out.println(queue.size());

        queue.clear();

        //reverse(queue);
        // System.out.println(queue);
    }
}
