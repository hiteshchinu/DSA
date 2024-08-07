package LeetcodeQueue;

import java.util.Queue;

public class QueueReversal {
    class GfG {
    // Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q) {
        // Base case: if the queue is empty, return it
        if (q.isEmpty()) {
            return q;
        }

        // Remove the front element from the queue
        int front = q.poll();
        
        // Recursively reverse the remaining queue
        q = rev(q);
        
        // Add the removed element to the back of the reversed queue
        q.add(front);
        
        return q;
    }
}

}
