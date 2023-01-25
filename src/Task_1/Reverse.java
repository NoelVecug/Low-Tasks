package Task_1;

public class Reverse {
    public static void main(String[] args) {
        // Write a Java program to reverse a string.
        
        String word = "Pretty long string";
        char ch;
        String reverseWord = "";
        
        for (int i = word.length()-1; i >= 0; i--) {
            ch = word.charAt(i);
            reverseWord += ch;
        }
        System.out.println("Reverse Word is " + reverseWord);
    }
}
