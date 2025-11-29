import java.util.Arrays;

class Heap {
    int[] heap;
    int size;
    int capacity;
    boolean isMinHeap; // true for MinHeap, false for MaxHeap

    // Constructor
    Heap(int capacity, boolean isMinHeap) {
        this.capacity = capacity;
        this.isMinHeap = isMinHeap;
        heap = new int[capacity];
        size = 0;
    }

    // Helper methods to get parent and child indices
    int parent(int i) { return (i - 1) / 2; }
    int left(int i) { return 2 * i + 1; }
    int right(int i) { return 2 * i + 2; }

    // Swap
    void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Compare for MinHeap or MaxHeap
    boolean compare(int child, int parent) {
        if(isMinHeap) return heap[child] < heap[parent];
        else return heap[child] > heap[parent];
    }

    // Insert element
    void insert(int key) {
        if(size == capacity) {
            System.out.println("Heap is full!");
            return;
        }
        heap[size] = key;
        int i = size;
        size++;

        // Heapify Up
        while(i != 0 && compare(i, parent(i))) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    // Heapify down (used in delete)
    void heapify(int i) {
        int l = left(i);
        int r = right(i);
        int extreme = i;

        if(l < size && compare(l, extreme)) extreme = l;
        if(r < size && compare(r, extreme)) extreme = r;

        if(extreme != i) {
            swap(i, extreme);
            heapify(extreme);
        }
    }

    // Delete element at index i
    void delete(int i) {
        if(i >= size) return;
        heap[i] = heap[size - 1];
        size--;
        heapify(i);
    }

    // Get Min or Max
    int getTop() {
        if(size == 0) {
            System.out.println("Heap is empty!");
            return -1;
        }
        return heap[0];
    }

    // Heap Sort (returns sorted array)
    int[] heapSort() {
        int[] copy = Arrays.copyOf(heap, size);
        int originalSize = size;

        for(int i = size - 1; i >= 1; i--) {
            swap(0, i);
            size--;
            heapify(0);
        }

        size = originalSize;
        return copy;
    }

    // Print Heap
    void printHeap() {
        for(int i = 0; i < size; i++)
            System.out.print(heap[i] + " ");
        System.out.println();
    }
}

public class HeapExample {
    public static void main(String[] args) {
        // Min Heap
        Heap minHeap = new Heap(10, true);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(8);
        minHeap.insert(1);
        System.out.print("Min Heap: ");
        minHeap.printHeap();

        System.out.println("Min element: " + minHeap.getTop());
        minHeap.delete(1); // delete element at index 1
        System.out.print("Min Heap after deletion: ");
        minHeap.printHeap();

        // Max Heap
        Heap maxHeap = new Heap(10, false);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(8);
        maxHeap.insert(1);
        System.out.print("Max Heap: ");
        maxHeap.printHeap();

        System.out.println("Max element: " + maxHeap.getTop());
        maxHeap.delete(2); // delete element at index 2
        System.out.print("Max Heap after deletion: ");
        maxHeap.printHeap();

        // Heap Sort using MinHeap
        int[] sortedArray = minHeap.heapSort();
        System.out.print("Heap Sorted array (MinHeap): ");
        for(int val : sortedArray) System.out.print(val + " ");
        System.out.println();
    }
}
