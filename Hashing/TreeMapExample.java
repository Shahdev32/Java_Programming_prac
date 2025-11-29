import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap with Integer keys
        TreeMap<Integer, String> countries = new TreeMap<>();

        // Add entries (keys are numbers)
        countries.put(3, "USA");
        countries.put(1, "Pakistan");
        countries.put(2, "India");

        // Print all entries (keys will be sorted automatically)
        System.out.println("TreeMap entries (sorted by keys):");
        for (Map.Entry<Integer, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Check if a key exists
        if (countries.containsKey(2)) {
            System.out.println("\nKey 2 exists in the TreeMap.");
        }

        // Remove a key
        countries.remove(3);
        System.out.println("\nAfter removing key 3:");
        for (Map.Entry<Integer, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Get the size
        System.out.println("\nSize of TreeMap: " + countries.size());
    }
}
