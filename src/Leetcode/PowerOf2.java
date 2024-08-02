package Leetcode;
import java.util.Scanner;
public class PowerOf2 {

    // Method to check if a number is a power of two
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        int lastbit = 0;
        while (n != 0) {
            lastbit = n & 1;
            n = n >> 1;
            if (lastbit == 1 && n > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PowerOf2 powerOf2 = new PowerOf2();
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        boolean result = powerOf2.isPowerOfTwo(n);

        // Display the result
        System.out.println("Is " + n + " a power of two? " + result);
        scanner.close();
    }
}
