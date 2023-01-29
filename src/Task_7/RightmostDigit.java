package Task_7;

import java.util.Scanner;

// Write a Java program that accepts three integers from the user
// and return greatest division if two or more of them (integers ) have the same rightmost digit.
// The integers are non-negative.

/*
    Тут опять же можно вынести все в метод (но мне уже лень :))) )
    В остальном убрал твой элс после проверки на негатив, ибо он создает лишнюю вложенность
    Что является антипаттерном. Совет: всегда избегай else и else if
    У тебя в той тройной проверке был else if что по сути бессмысленно, ибо если в иф зайдет
    То из цикла выведет оператор break и до остальных ифов не дойдет.
    В остальном красавчик, все тут хорошо
 */

public class RightmostDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input three positive digits.");

        System.out.print("First: ");
        int num1 =scanner.nextInt();
        System.out.print("Second: ");
        int num2 =scanner.nextInt();
        System.out.print("Third: ");
        int num3 =scanner.nextInt();

        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Error: Find a negative number.");
            return;
        }
        int greatestNumber = Integer.max(Integer.max(num1, num2), num3);

        while (greatestNumber > 0) {
            if (num1 % greatestNumber == 0 && num2 % greatestNumber == 0) {
                System.out.println("Greatest division: " + greatestNumber);
                break;
            }
            if (num1 % greatestNumber == 0 && num3 % greatestNumber == 0) {
                System.out.println("Greatest division: " + greatestNumber);
                break;
            }
            if (num2 % greatestNumber == 0 && num3 % greatestNumber == 0) {
                System.out.println("Greatest division: " + greatestNumber);
                break;
            }
            greatestNumber--;
        }
    }
}
