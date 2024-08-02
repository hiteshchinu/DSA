package Recursion;

import java.util.Scanner;

public class Sum {

    // Method to calculate the sum of n natural numbers using recursion
    public static int sumOfNaturalNumbers(int n) {
        // Base case: if n is 1, return 1
        if (n == 1) {
            return 1;
        }
        // Recursive call: add n to the sum of (n-1) natural numbers
        return n + sumOfNaturalNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = sumOfNaturalNumbers(number);
        System.out.println("The sum of the first " + number + " natural numbers is: " + sum);
        scanner.close();
    }
}
