package se.gradinit.loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. For loop
        System.out.println("--- For Loop ---");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Count: " + i);
        }

        // 2. While loop
        System.out.println("\n--- While Loop ---");
        int count = 1;
        while (count <= 3) {
            System.out.println("Count: " + count);
            count++;
        }

        // 3. Do-While loop
        System.out.println("\n--- Do-While Loop ---");
        int num = 1;
        do {
            System.out.println("Count: " + num);
            num++;
        } while (num <= 3);

        // 4. For-each loop
        System.out.println("\n--- For-each Loop ---");
        String[] colors = {"Red", "Green", "Blue"};
        for (String color : colors) {
            System.out.println("Color: " + color);
        }

        // 5. Iterator
        System.out.println("\n--- Iterator ---");
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
