package Task_3;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        //Write a Java program to print the ascii value of a given character.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a symbol: ");
        String symb = scanner.nextLine();
        Character ch = symb.charAt(0);
        int ascii = ch;
        System.out.printf("Ascii of '%c': %d", ch, ascii);
    }
}
