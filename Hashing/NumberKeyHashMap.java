import java.util.HashMap;

public class NumberKeyHashMap {
    public static void main(String[] args) {
        // Create a HashMap with Integer keys and String values
        HashMap<Integer, String> countries = new HashMap<>();

        // 1️⃣ Put operations (O(1) average)
        countries.put(1, "Pakistan");
        countries.put(2, "India");
        countries.put(3, "USA");

        // 2️⃣ Get operation (O(1) average)
        String country2 = countries.get(2);
        System.out.println("Key 2 corresponds to: " + country2);

        // 3️⃣ containsKey operation (O(1) average)
        if (countries.containsKey(3)) {
            System.out.println("Key 3 is present in the HashMap.");
        }

        // 4️⃣ remove operation (O(1) average)
        countries.remove(3);
        System.out.println("After removing key 3: " + countries);

        // 5️⃣ size operation (O(1))
        System.out.println("Size of HashMap: " + countries.size());

        // Print all key-value pairs
        System.out.println("All remaining entries:");
        for (Integer key : countries.keySet()) {
            System.out.println(key + " -> " + countries.get(key));
        }
    }
}
