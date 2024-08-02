package BitwiseOperators;

public class LeetCode {
    public static void main(String[] args) {
        int n = 00000000000011101111101;
        int result = 0;
        while(n!=0){
            int lastbit = n & 1; // Get the last bit
            result += lastbit;   // Add the last bit to the result
            n = n >> 1;          // Shift right to process the next bit
        }
        System.out.println("Number of 1 bits: " + result); 
    }
}
