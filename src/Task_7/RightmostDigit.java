package Task_7;

import java.util.Scanner;

public class RightmostDigit {
    public static void main(String[] args) {
        // Write a Java program that accepts three integers from the user
        // and return true if two or more of them (integers ) have the same rightmost digit.
        // The integers are non-negative.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input three positive digits.");

        System.out.print("First: ");
        int num1 = scanner.nextInt();
        System.out.print("Second: ");
        int num2 = scanner.nextInt();
        System.out.print("Third: ");
        int num3 = scanner.nextInt();

        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Error: Find a negative digit.");
        } else {
            int max = Integer.max(num1, num2);
            int greatestDigit = Integer.max(max, num3);
            while (greatestDigit > 0) {
                if (num1 % greatestDigit == 0 && num2 % greatestDigit == 0) {
                    System.out.println("Greatest division: " + greatestDigit);
                    break;
                } else if (num1 % greatestDigit == 0 && num3 % greatestDigit == 0) {
                    System.out.println("Greatest division: " + greatestDigit);
                    break;
                } else if (num2 % greatestDigit == 0 && num3 % greatestDigit == 0) {
                    System.out.println("Greatest division: " + greatestDigit);
                    break;
                } else greatestDigit--;
            }
        }
    }
}
