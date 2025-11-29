package Trees;

import java.util.*;

public class TopViewTree {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Create pair to store node + horizontal distance
    static class Info {
        Node node;
        int hd; // horizontal distance

        Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    // ==========================
    // TOP VIEW FUNCTION
    // ==========================
    public static void topView(Node root) {
        if (root == null) return;

        // Map to store first node at each horizontal distance
        Map<Integer, Integer> map = new TreeMap<>();

        // Queue for BFS
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(root, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();

            // If HD not seen before → add to map
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node.data);
            }

            // Move left
            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
            }

            // Move right
            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
            }
        }

        // Print top view
        for (int key : map.keySet()) {
            System.out.print(map.get(key) + " ");
        }
    }

    // ==========================
    // MAIN METHOD
    // ==========================
    public static void main(String[] args) {

        /*
                 1
               /   \
              2     3
             / \   / \
            4   5 6   7
                   \
                    8
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);

        System.out.print("Top View: ");
        topView(root);
    }
}
