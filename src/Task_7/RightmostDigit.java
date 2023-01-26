package Task_7;

import java.util.ArrayList;
import java.util.Scanner;

public class RightmostDigit {
    private static final int CAPACITY = 3;
    private static ArrayList<Integer> nums = new ArrayList<>(CAPACITY);
    public static void main(String[] args) {
        // Write a Java program that accepts three integers from the user
        // and return true if two or more of them (integers ) have the same rightmost digit.
        // The integers are non-negative.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input tree positive digits through 'Enter'.");
        for (int i = 0; i < CAPACITY; i++) {
            int num = scanner.nextInt();
            CheckPositive(num);
        }
        for (int c: nums) {
            System.out.println(nums.get(c));
        }


    }
    public static void CheckPositive(int num) {
        if (num < 0) {
            System.out.println("Negative digit. Please try again.");
        } else {
            nums.add(num);
        }
    }
}
