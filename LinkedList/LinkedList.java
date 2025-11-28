package LinkedList;

public class LinkedList {

    public class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    // Add First
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add Last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Insert at a given index
    public void insertAtIndex(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }

        if(index == size){
            addLast(data);
            return;
        }

        if(index < 0 || index > size){
            System.out.println("Index out of range!");
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;
        while(i < index - 1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete First
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        head = head.next;
        size--;

        if(head == null){
            tail = null;
        }
    }

    // Delete Last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        size--;

        if(head.next == null){
            head = tail = null;
            return;
        }

        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
    }

    // Delete at index
    public void deleteAtIndex(int index){
        if(index == 0){
            deleteFirst();
            return;
        }

        if(index < 0 || index >= size){
            System.out.println("Index out of range!");
            return;
        }

        Node temp = head;
        int i = 0;
        while(i < index - 1){
            temp = temp.next;
            i++;
        }

        temp.next = temp.next.next;

        if(index == size - 1){
            tail = temp;
        }

        size--;
    }

    // Delete by value
    public void deleteByValue(int value){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(head.data == value){
            deleteFirst();
            return;
        }

        Node temp = head;
        while(temp.next != null && temp.next.data != value){
            temp = temp.next;
        }

        if(temp.next == null){
            System.out.println("Value not found!");
            return;
        }

        temp.next = temp.next.next;

        if(temp.next == null){
            tail = temp;
        }

        size--;
    }

    // Search (Iterative)
    public int search(int key){
        Node temp = head;
        int index = 0;

        while(temp != null){
            if(temp.data == key){
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
    }

    // Search (Recursive)
    private int searchRec(Node head, int key){
        if(head == null) return -1;
        if(head.data == key) return 0;

        int idx = searchRec(head.next, key);
        if(idx == -1) return -1;
        return idx + 1;
    }

    public int searchRecursive(int key){
        return searchRec(head, key);
    }

    // Reverse Linked List
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        tail = head;
        head = prev;
    }

    // Print List
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        // Add
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);

        System.out.println("Initial List:");
        ll.printList();

        // Insert
        ll.insertAtIndex(3, 99);
        System.out.println("After Inserting 99 at index 3:");
        ll.printList();

        // Delete
        ll.deleteFirst();
        ll.deleteLast();
        ll.deleteAtIndex(2);
        ll.deleteByValue(99);

        System.out.println("After Deletions:");
        ll.printList();

        // Search
        System.out.println("Search 4 => index: " + ll.search(4));
        System.out.println("Search 5 (recursive) => index: " + ll.searchRecursive(5));

        // Reverse
        ll.reverse();
        System.out.println("Reversed List:");
        ll.printList();

        // Size
        System.out.println("Size of Linked List: " + ll.size);
    }
}
