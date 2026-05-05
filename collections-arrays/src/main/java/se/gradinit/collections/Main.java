package se.gradinit.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Arrays Example
        System.out.println("--- Arrays Example ---");
        String[] colors = {"Red", "Green", "Blue"};
        System.out.println("Second color: " + colors[1]);
        System.out.println("Array length: " + colors.length);

        // 2. List Example (ArrayList)
        System.out.println("\n--- List (ArrayList) Example ---");
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Duplicates allowed
        System.out.println("Fruits list: " + fruits);
        System.out.println("First fruit: " + fruits.get(0));

        // 3. Set Example (HashSet)
        System.out.println("\n--- Set (HashSet) Example ---");
        Set<String> uniqueFruits = new HashSet<>();
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Apple"); // Duplicate - will be ignored
        System.out.println("Unique fruits: " + uniqueFruits);
        System.out.println("Contains Banana? " + uniqueFruits.contains("Banana"));

        // 4. Map Example (HashMap)
        System.out.println("\n--- Map (HashMap) Example ---");
        Map<String, Integer> fruitInventory = new HashMap<>();
        fruitInventory.put("Apple", 50);
        fruitInventory.put("Banana", 30);
        fruitInventory.put("Orange", 20);
        System.out.println("Inventory: " + fruitInventory);
        System.out.println("Quantity of Apples: " + fruitInventory.get("Apple"));

        // Iterating over a Map
        System.out.println("Iterating through inventory:");
        for (Map.Entry<String, Integer> entry : fruitInventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
