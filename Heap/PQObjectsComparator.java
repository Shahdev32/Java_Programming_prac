import java.util.PriorityQueue;
import java.util.Comparator;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class PQObjectsComparator {
    public static void main(String[] args) {
        // PriorityQueue with custom Comparator (min-heap by marks)
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.comparingInt(s -> s.marks));

        pq.add(new Student("Alice", 85));
        pq.add(new Student("Bob", 92));
        pq.add(new Student("Charlie", 78));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
