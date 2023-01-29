package Task_5;

// Write a Java program to print the odd numbers from 1 to 99.
// Prints one number per line.

/*
    Ну тут в целом тоже про вынос кода в метод. И еще про переиспользование.
    Твой код в целом работал для конкретных чисел 1 и 99. Мой совет всегда от конкретных значений
    Абстрагироваться. Да тут в задаче они даны, но тебе потом будет меньше проблем на работе, если
    Будешь писать абстрактный код. Поэтому я тут вынес в отдельный метод код, который в заданном промежутке
    Выводит нечетные числа
 */

public class OddNumbers {
    public static void main(String[] args) {
        printOddNumbers(1, 99);
    }

    private static void printOddNumbers(int from, int to) {
        for (int i = from; i <= to; i++) {
            printIfOdd(i);
        }
    }

    private static void printIfOdd(int num) {
        if (num % 2 != 0) {
            System.out.println(num);
        }
    }
}
