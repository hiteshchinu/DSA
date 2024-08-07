package LeetcodeQueue;

import java.util.LinkedList;
import java.util.Queue;

public class firstnegint {
    class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K){
    // Result array to store the first negative integer in each window
        long[] result = new long[N - K + 1];
        
        // Queue to store indices of negative numbers
        Queue<Integer> negativeIndices = new LinkedList<>();
        
        // Initialize the result index
        int resultIndex = 0;
        
        // Process the first window
        for (int i = 0; i < K; i++) {
            if (A[i] < 0) {
                negativeIndices.add(i);
            }
        }
        
        // Add the result for the first window
        if (!negativeIndices.isEmpty()) {
            result[resultIndex++] = A[negativeIndices.peek()];
        } else {
            result[resultIndex++] = 0; // or some other value representing no negative number
        }
        
        // Process the rest of the windows
        for (int i = K; i < N; i++) {
            // Remove elements which are out of this window
            while (!negativeIndices.isEmpty() && negativeIndices.peek() < i - K + 1) {
                negativeIndices.poll();
            }
            
            // Add the current element if it's negative
            if (A[i] < 0) {
                negativeIndices.add(i);
            }
            
            // Add the result for the current window
            if (!negativeIndices.isEmpty()) {
                result[resultIndex++] = A[negativeIndices.peek()];
            } else {
                result[resultIndex++] = 0; // or some other value representing no negative number
            }
        }
        
        return result;
    }
}

}
