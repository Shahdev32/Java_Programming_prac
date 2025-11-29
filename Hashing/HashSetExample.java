import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate, will not be added

        System.out.println("HashSet: " + set);

        // Remove an element
        set.remove("Banana");

        // Check if element exists
        if (set.contains("Orange")) {
            System.out.println("Orange is present");
        }

        // Size of HashSet
        System.out.println("Size: " + set.size());

        // Iterate
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
