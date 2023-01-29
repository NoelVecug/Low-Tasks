package Task_1;

// Write a Java program to reverse a string.

/*
    Всегда думай про переиспользуемость кода который ты пишешь
    Поэтому даже при выполнении таких тривиальных задач
    Выноси логически связанные блоки кода, которые делают конкретную функцию в методы
    Еще не создавай лишних переменных. У тебя была переменная char ch; в которую ты складывал символ,
    Что бесполезно, ибо у тебя этот символ используется только внутри цикла, это можно было опустить.
    Еще по поводу строк: в каждой ситуации, когда тебе нужно проводить какие то операции со строками,
    Изменять их, соединять, обрезать и т.п. старайся использовать StringBuilder(Есть еще StringBuffer)
    Почитай про него и научись применять. По код стайлу это более правильно, да и с точки зрения языка
    Тоже более правильно, т.к в джаве не изменяемые строки.
 */

public class Reverse {
    public static void main(String[] args) {
        String word = "Pretty long string";

        System.out.println("Reverse Word is " + reverse(word));
    }

    private static String reverse(String string) {
        StringBuilder reversedString = new StringBuilder();

        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString.append(string.charAt(i));
        }
        return reversedString.toString();
    }
}
