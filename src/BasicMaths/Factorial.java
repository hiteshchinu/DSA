package BasicMaths;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        int result = 1;
        
        for (int i = num; i >= 1; i--) {
            result *= i;
        }
        
        System.out.println("Result: " + result);
    }
}

