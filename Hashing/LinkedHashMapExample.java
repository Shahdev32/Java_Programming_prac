import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        LinkedHashMap<Integer, String> countries = new LinkedHashMap<>();

        // Add entries (keys are numbers)
        countries.put(1, "Pakistan");
        countries.put(2, "India");
        countries.put(3, "USA");

        // Print all entries
        System.out.println("LinkedHashMap entries:");
        for (Map.Entry<Integer, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Check if a key exists
        if (countries.containsKey(2)) {
            System.out.println("\nKey 2 exists in the map.");
        }

        // Remove a key
        countries.remove(3);
        System.out.println("\nAfter removing key 3:");
        for (Map.Entry<Integer, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Get the size
        System.out.println("\nSize of LinkedHashMap: " + countries.size());
    }
}
