package Task_6;

// Write a Java program to print numbers between 1 and 100
// which are divisible by 3, 5 and by both.

/*
    Тут тот же самый вынос метода + вынос константного значения в константу
    Тоже возьми себе на заметку не хардкодить числа в методах.
    Любую хуйню взятую из воздуха всегда выноси в константу и называй ее соответствующим образом
 */

public class Divide {
    private static final int FIRST_DIVISOR = 3;
    private static final int SECOND_DIVISOR = 5;

    public static void main(String[] args) {
        printDivisibleNumbers(1, 100);
    }

    private static void printDivisibleNumbers(int from, int to) {
        for (int i = from; i <= to; i++) {
            checkDivisionAndPrint(i);
        }
    }

    private static void checkDivisionAndPrint(int num) {
        if ((num % FIRST_DIVISOR == 0) && (num % SECOND_DIVISOR == 0)) {
            System.out.println(num + " is divisible by both divisors");
        }
        if (num % FIRST_DIVISOR == 0) {
            System.out.println(num + " is divisible by " + FIRST_DIVISOR);
        }
        if (num % SECOND_DIVISOR == 0) {
            System.out.println(num + " is divisible by " + SECOND_DIVISOR);
        }
    }
}
