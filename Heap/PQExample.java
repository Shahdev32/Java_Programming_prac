import java.util.PriorityQueue;

public class PQExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min-heap by default

        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);

        System.out.println("PriorityQueue: " + pq); // internal order may differ
        System.out.println("Head element: " + pq.peek()); // 5 (smallest)

        System.out.println("Removing elements in priority order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // 5, 10, 20, 30
        }
    }
}
