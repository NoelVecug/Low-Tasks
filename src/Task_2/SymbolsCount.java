package Task_2;

// Write a Java program to count the letters,
// spaces, numbers and other characters of an input string.

/*
    Тут в целом с вынесением метода та же ошибка.
    И еще на заметку не ебись со сканером в таких заданиях, это бесполезно
    Тем более ты его не закрыл, что чревато утечками в больших проектах.
    Сканнер это ресурс который надо закрывать.
    По поводу твоего метода его можно было и не искать.
    У тебя проверки на все были, в каждой из них добавил оператор continue,
    Что позволит избежать бессмысленных проверок и как раз посчитать твой otherCount, потому
    Что по сути все, что не нашло до этого входит в otherCount.
 */

public class SymbolsCount {
    public static void main(String[] args) {
        String input = "ABC 123 123 ]]1%%$#";
        calcStringSymbols(input);
    }

    private static void calcStringSymbols(String input) {
        int alphabetCount = 0;
        int spaceCount = 0;
        int numbersCount = 0;
        int otherCount = 0;

        for (char c : input.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                alphabetCount++;
                continue;
            }
            if (Character.isWhitespace(c)) {
                spaceCount++;
                continue;
            }
            if (Character.isDigit(c)) {
                numbersCount++;
                continue;
            }
            otherCount++;
        }
        System.out.printf("""
                The string: %s
                letter: %d
                space: %d
                number: %d
                other: %d""", input, alphabetCount, spaceCount, numbersCount, otherCount);
    }
}
