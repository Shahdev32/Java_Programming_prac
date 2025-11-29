import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate, will not be added

        System.out.println("LinkedHashSet: " + set);

        // Remove an element
        set.remove("Banana");

        // Check if element exists
        if (set.contains("Orange")) {
            System.out.println("Orange is present");
        }

        // Size of LinkedHashSet
        System.out.println("Size: " + set.size());

        // Iterate in insertion order
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
