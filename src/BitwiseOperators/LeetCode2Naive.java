package BitwiseOperators;

import java.util.Arrays;

//338. Counting Bits (Naive approch)
public class LeetCode2Naive {
    public static void main(String[] args) {
        int n = 5;

        // Array to hold the number of 1's for each number from 0 to n
        int[] ans = new int[n + 1];
        
        // Loop through each number from 0 to n
        for (int i = 0; i <= n; i++) {
            ans[i] = countBits(i);
        }
        
        // Print the array
        System.out.println(Arrays.toString(ans));
    }

    // Helper method to count the number of 1's in the binary representation of a number
    public static int countBits(int num) {
        int count = 0;
        while (num > 0) {
            // Increment count if the least significant bit is 1
            count += num & 1;
            // Right shift the number by 1 bit
            num >>= 1;
        }
        return count;
    }
}