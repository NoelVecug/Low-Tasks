package Task_6;

import java.util.ArrayList;

public class Divide {
    public static void main(String[] args) {
        // Write a Java program to print numbers between 1 and 100
        // which are divisible by 3, 5 and by both.
        ArrayList<Integer> three = new ArrayList<>();
        ArrayList<Integer> five = new ArrayList<>();
        ArrayList<Integer> both = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                three.add(i);
            }
            if (i % 5 == 0) {
                five.add(i);
            }
            if ((i % 3 == 0) && (i % 5 == 0)) {
                both.add(i);
            }
        }

        System.out.println("Divided by 3:");
        for (int i = 0; i < three.size() -1; i++) {
            System.out.printf("%d, ", three.get(i));
        }
        System.out.println(three.get(three.size()-1) + ".");

        System.out.println("Divided by 5:");
        for (int i = 0; i < five.size()-1; i++) {
            System.out.printf("%d, ", five.get(i));
        }
        System.out.println(five.get(five.size()-1) + ".");

        System.out.println("Divided by 3 and 5:");
        for (int i = 0; i < both.size()-1; i++) {
            System.out.printf("%d, ", both.get(i));
        }
        System.out.println(both.get(both.size()-1) + ".");

    }
}
