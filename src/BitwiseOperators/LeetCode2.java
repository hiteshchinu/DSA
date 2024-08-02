package BitwiseOperators;

import java.util.Arrays;

//338. Counting Bits
public class LeetCode2 {
    public static void main(String[] args) {
        int n = 5;

        int[] ans = new int[n+1];

        // Loop through each number from 0 to n

        for (int i = 0; i <= n; i++) {
            // Calculate the number of 1's in the binary representation of i
            // ans[i >> 1]: Count of 1's in the binary representation of i/2 (i right-shifted by 1 bit)
            // (i & 1): Adds 1 if the last bit of i is 1 (i is odd), otherwise adds 0 (i is even)
            ans[i] = ans[i>>1] + (i & 1);
            //System.out.println(ans[i]);
        }
        // Print the array
        System.out.println(Arrays.toString(ans));
        
    }
}


