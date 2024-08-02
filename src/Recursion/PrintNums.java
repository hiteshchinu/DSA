package Recursion;

import java.util.Scanner;

public class PrintNums {
    public static void printNumbers(int n) {
        if (n < 1) {
            return;
        }
        // Print the current number
        System.out.print(n);
        // Recursive call with n-1
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        printNumbers(number);
        scanner.close();
    }
}
