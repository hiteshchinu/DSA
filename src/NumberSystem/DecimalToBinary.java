package NumberSystem;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String args[]) {
        // Decimal to Binary
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int num = scanner.nextInt();
        scanner.close();

        String result = "";
        while (num > 0) {
            int rem = num % 2;
            num = num / 2;
            result = rem + result;
        }
        System.out.println("Binary: " + result);
    }
}
