package Queues;

import java.util.Queue;
import java.util.PriorityQueue;

public class MainPQ{
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(9);
        queue.add(7);
        queue.add(3);
        queue.add(-8);
        queue.add(-5);
        queue.add(-10);
        queue.add(-1);

        System.out.println(queue);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}

