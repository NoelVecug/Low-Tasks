package Task_2;

import java.util.Scanner;

public class SymbolsCount {
    public static void main(String[] args) {
        // Write a Java program to count the letters,
        // spaces, numbers and other characters of an input string.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string with random symbols");
        char[] str = scanner.nextLine().toCharArray();
        StringBuilder fullStr = new StringBuilder();
        int alphabetCount = 0;
        int spaceCount = 0;
        int numbersCount = 0;
        int otherCount = 0;
        for (char c : str) {
            fullStr.append(c);
            if (Character.isAlphabetic(c)) {
                alphabetCount++;
            }
            if (Character.isWhitespace(c)) {
                spaceCount++;
            }
            if (Character.isDigit(c)) {
                numbersCount++;
            }
            if (Character.isBmpCodePoint(c) && (!Character.isDigit(c) && !Character.isWhitespace(c)
            && !Character.isAlphabetic(c))) {
                // I don't find Character method for "other" symbols
                otherCount++;
            }
        }
        System.out.printf("""
                The string: %s
                letter: %d
                space: %d
                number: %d
                other: %d""", fullStr, alphabetCount, spaceCount, numbersCount, otherCount);
    }
}
