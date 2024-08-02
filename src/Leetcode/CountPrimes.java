package Leetcode;

public class CountPrimes {
    
    // Helper method to check if a number is prime
    private boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false; // If divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true;
    }

    // Method to count the number of prime numbers less than n
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountPrimes cp = new CountPrimes();
        System.out.println(cp.countPrimes(10)); // Output: 4
        System.out.println(cp.countPrimes(0));  // Output: 0
        System.out.println(cp.countPrimes(15));  // Output: 0
    }
}
