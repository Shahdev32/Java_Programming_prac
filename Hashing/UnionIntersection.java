import java.util.HashSet;

public class UnionIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        // HashSet to store union
        HashSet<Integer> unionSet = new HashSet<>();
        // HashSet to store intersection
        HashSet<Integer> intersectionSet = new HashSet<>();

        // Add all elements of first array to unionSet
        for (int num : arr1) {
            unionSet.add(num);
        }

        // Loop through second array
        for (int num : arr2) {
            // Add to unionSet (will ignore duplicates)
            unionSet.add(num);

            // Check if element is in arr1 set (intersection)
            if (unionSet.contains(num) && contains(arr1, num)) {
                intersectionSet.add(num);
            }
        }

        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
    }

    // Helper method to check if array contains a value
    public static boolean contains(int[] arr, int key) {
        for (int num : arr) {
            if (num == key) return true;
        }
        return false;
    }
}
