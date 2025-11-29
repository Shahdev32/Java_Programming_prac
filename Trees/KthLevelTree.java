package Trees;

public class KthLevelTree {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // ============================
    // Print K-th Level of Tree
    // ============================
    public static void printKthLevel(Node root, int level) {
        if (root == null) return;

        // If target level reached
        if (level == 1) {
            System.out.print(root.data + " ");
            return;
        }

        // Go to next level
        printKthLevel(root.left, level - 1);
        printKthLevel(root.right, level - 1);
    }

    // ============================
    // MAIN
    // ============================
    public static void main(String[] args) {

        /*
                 1
               /   \
              2     3
             / \   / \
            4   5 6   7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 3;  // which level

        System.out.print("Nodes at level " + k + ": ");
        printKthLevel(root, k);
    }
}
