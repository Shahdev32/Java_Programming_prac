import java.util.HashMap;

public class CountryMapExample {
    public static void main(String[] args) {
        // 1️⃣ Create a HashMap
        HashMap<String, String> countries = new HashMap<>();

        // 2️⃣ Add 3 countries with their capitals
        countries.put("Pakistan", "Islamabad");
        countries.put("India", "New Delhi");
        countries.put("USA", "Washington, D.C.");

        // 3️⃣ Print the HashMap
        System.out.println("Countries and their capitals:");
        for (String country : countries.keySet()) {
            System.out.println(country + " -> " + countries.get(country));
        }

        // 4️⃣ Check if a key exists
        String keyToCheck = "India";
        if (countries.containsKey(keyToCheck)) {
            System.out.println("\n" + keyToCheck + " is present in the HashMap.");
        } else {
            System.out.println("\n" + keyToCheck + " is not present in the HashMap.");
        }

        // 5️⃣ Remove a key
        String keyToRemove = "USA";
        countries.remove(keyToRemove);
        System.out.println("\nHashMap after removing " + keyToRemove + ":");
        for (String country : countries.keySet()) {
            System.out.println(country + " -> " + countries.get(country));
        }

        // 6️⃣ Get the size of the HashMap
        System.out.println("\nSize of HashMap: " + countries.size());
    }
}
