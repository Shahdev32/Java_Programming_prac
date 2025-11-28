

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class QueuePrograms {

    // --------------------------------------------------------
    // 1️⃣ QUEUE USING ARRAY (Manual Implementation)
    // --------------------------------------------------------
    static class ArrayQueue {
        int arr[];
        int size;
        int front;
        int rear;

        ArrayQueue(int size){
            this.size = size;
            arr = new int[size];
            front = 0;
            rear = -1;
        }

        boolean isEmpty(){
            return rear < front;
        }

        boolean isFull(){
            return rear == size - 1;
        }

        void enqueue(int data){
            if(isFull()){
                System.out.println("Queue is Full!");
                return;
            }
            arr[++rear] = data;
        }

        int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[front++];
        }

        int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[front];
        }

        void printQueue(){
            System.out.print("Array Queue: ");
            for(int i = front; i <= rear; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }



    // --------------------------------------------------------
    // 2️⃣ QUEUE USING LINKED LIST (Manual Implementation)
    // --------------------------------------------------------
    static class LinkedListQueue {

        class Node {
            int data;
            Node next;

            Node(int data){
                this.data = data;
                this.next = null;
            }
        }

        Node front = null;  // head
        Node rear = null;   // tail

        void enqueue(int data){
            Node newNode = new Node(data);

            if(front == null){
                front = rear = newNode;
                return;
            }

            rear.next = newNode;
            rear = newNode;
        }

        int dequeue(){
            if(front == null){
                System.out.println("Queue is Empty!");
                return -1;
            }
            int val = front.data;
            front = front.next;

            if(front == null) rear = null; // queue became empty

            return val;
        }

        int peek(){
            if(front == null){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return front.data;
        }

        void printQueue(){
            System.out.print("LinkedList Queue: ");
            Node temp = front;

            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }



    // --------------------------------------------------------
    // 3️⃣ QUEUE USING JAVA COLLECTIONS (Queue + Deque)
    // --------------------------------------------------------
    public static void javaCollectionsQueues(){

        // A. Queue using LinkedList
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);

        System.out.println("Java Queue (LinkedList): " + q1);
        q1.poll();
        System.out.println("After remove: " + q1);


        // B. Queue using ArrayDeque (Recommended!)
        Queue<Integer> q2 = new ArrayDeque<>();
        q2.add(100);
        q2.add(200);
        q2.add(300);

        System.out.println("Java Queue (ArrayDeque): " + q2);
        q2.poll();
        System.out.println("After remove: " + q2);


        // C. Deque as Queue
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(1);
        dq.offer(2);
        dq.offer(3);

        System.out.println("Deque Queue: " + dq);
        dq.poll();
        System.out.println("After poll: " + dq);
    }



    // --------------------------------------------------------
    // MAIN METHOD – Test All Queues
    // --------------------------------------------------------
    public static void main(String[] args) {

        // 1️⃣ Array Queue
        ArrayQueue aq = new ArrayQueue(5);
        aq.enqueue(1);
        aq.enqueue(2);
        aq.enqueue(3);
        aq.printQueue();                // 1 2 3
        aq.dequeue();
        aq.printQueue();                // 2 3

        // 2️⃣ Linked List Queue
        LinkedListQueue llq = new LinkedListQueue();
        llq.enqueue(10);
        llq.enqueue(20);
        llq.enqueue(30);
        llq.printQueue();               // 10 20 30
        llq.dequeue();
        llq.printQueue();               // 20 30

        // 3️⃣ Java Collections Queue
        System.out.println("\n--- Java Collections Queue Demo ---");
        javaCollectionsQueues();
    }
}
