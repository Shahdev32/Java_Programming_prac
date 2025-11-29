import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> set = new TreeSet<>();

        // Add elements
        set.add("Banana");
        set.add("Apple");
        set.add("Orange");
        set.add("Banana"); // Duplicate, will not be added

        System.out.println("TreeSet: " + set);

        // Remove an element
        set.remove("Apple");

        // Check if element exists
        if (set.contains("Orange")) {
            System.out.println("Orange is present");
        }

        // First and Last element
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        // Iterate in sorted order
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
