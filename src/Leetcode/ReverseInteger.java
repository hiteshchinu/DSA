package Leetcode;

public class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;
        
        while (x != 0) {
            int n = x % 10;
            
            // Check for overflow
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            
            rev = rev * 10 + n;
            x = x / 10;
        }
        
        return rev;
    }

    public static void main(String[] args) {
        ReverseInteger solution = new ReverseInteger();
        
        // Test cases
        System.out.println(solution.reverse(123));    // Output: 321
        System.out.println(solution.reverse(-123));   // Output: -321
        System.out.println(solution.reverse(120));    // Output: 21
        System.out.println(solution.reverse(0));      // Output: 0
        System.out.println(solution.reverse(1534236469)); // Output: 0 (overflow case)
    }
}
