package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(5));
        System.out.println(map.size());
        System.out.println(map.remove(2));
        System.out.println(map);
















        // // Create a HashMap
        // HashMap<String, Integer> hashMap = new HashMap<>();

        // // Add key-value pairs to the HashMap
        // hashMap.put("Apple", 5);
        // hashMap.put("Banana", 0);
        // hashMap.put("Orange", 8);
        // hashMap.put("Mango", 2);

        // // Retrieve and print a value
        // System.out.println("Quantity of Apples: " + hashMap.get("Apple"));

        // // Check if a key exists
        // if (hashMap.containsKey("Banana")) {
        //     System.out.println("Banana is available.");
        // }

        // // Remove a key-value pair
        // hashMap.remove("Mango");

        // // Iterate over the HashMap and print all key-value pairs
        // for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
        //     System.out.println("Fruit: " + entry.getKey() + ", Quantity: " + entry.getValue());
        // }

        // // Get the size of the HashMap
        // System.out.println("Total number of fruits: " + hashMap.size());

        // // Clear all entries in the HashMap
        // hashMap.clear();
        // System.out.println("HashMap cleared. Size now: " + hashMap.size());
    }
}
