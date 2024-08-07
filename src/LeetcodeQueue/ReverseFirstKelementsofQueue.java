package LeetcodeQueue;

import java.util.Queue;


// https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1

public class ReverseFirstKelementsofQueue {
    class GfG {
        // Recursive function to reverse the first k elements of a queue
        private Queue<Integer> reverseKElements(Queue<Integer> q, int k) {
            if (q.isEmpty() || k <= 0) return q;
    
            // Remove the front element
            int front = q.poll();
    
            // Recursively reverse the remaining elements with k-1
            q = reverseKElements(q, k - 1);
    
            // Add the front element to the back of the queue
            q.offer(front);
    
            return q;
        }
    
        // Function to reverse the first k elements of the queue and maintain the order of the rest
        public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
            if (q.isEmpty() || k <= 0) return q;
    
            // Reverse the first k elements
            q = reverseKElements(q, k);
    
            // Rotate the remaining elements to the back of the queue
            int size = q.size();
            for (int i = 0; i < size - k; i++) {
                q.offer(q.poll());
            }
    
            return q;
        }
    }

}
