import java.util.*;
class Item {
    int value;
    int weight;

    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

public class FractionalKnapsackSimple {

    // Function to get maximum value in knapsack
    public static double fractionalKnapsack(int capacity, Item[] items) {

        // Step 1: Sort items by value/weight ratio in descending order
        java.util.Arrays.sort(items, (a, b) -> {
            double r1 = (double) a.value / a.weight;
            double r2 = (double) b.value / b.weight;
            return Double.compare(r2, r1); // descending
        });

        double totalValue = 0;
        int remainingCapacity = capacity;

        // Step 2: Take items greedily
        for (Item item : items) {
            if (item.weight <= remainingCapacity) {
                // Take whole item
                totalValue += item.value;
                remainingCapacity -= item.weight;
            } else {
                // Take fraction of item
                totalValue += item.value * ((double) remainingCapacity / item.weight);
                break; // Knapsack is full
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        // Example: items {value, weight}
        Item[] items = {
            new Item(60, 10),
            new Item(100, 20),
            new Item(120, 30)
        };

        int capacity = 50;

        double maxValue = fractionalKnapsack(capacity, items);
        System.out.println("Maximum value in Knapsack = " + maxValue);
    }
}
