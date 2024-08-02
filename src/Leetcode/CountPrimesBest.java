package Leetcode;

import java.util.Arrays;

public class CountPrimesBest {
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                count++;
                // Mark multiples of i as non-prime
                for (int j = 2 * i; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        CountPrimesBest cp = new CountPrimesBest();
        System.out.println("Primes less than 10: " + cp.countPrimes(10));  // Output: 4
        System.out.println("Primes less than 20: " + cp.countPrimes(20));  // Output: 8
        System.out.println("Primes less than 50: " + cp.countPrimes(50));  // Output: 15
    }
}

