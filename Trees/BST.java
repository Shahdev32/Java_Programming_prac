import java.util.*;

class BST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    // Insert a node into BST
    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Search a node in BST
    boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        if (key < root.data) return search(root.left, key);
        else return search(root.right, key);
    }

    // Find minimum value node in a BST (used in delete)
    Node minValueNode(Node root) {
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    // Delete a node from BST
    Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // Node with only one child or no child
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            // Node with two children: get the inorder successor
            Node temp = minValueNode(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data);
        }

        return root;
    }

    // Print all nodes in a given range [low, high]
    void printRange(Node root, int low, int high) {
        if (root == null) return;

        if (low < root.data) {
            printRange(root.left, low, high);
        }

        if (low <= root.data && root.data <= high) {
            System.out.print(root.data + " ");
        }

        if (high > root.data) {
            printRange(root.right, low, high);
        }
    }

    // Inorder traversal (for checking BST)
    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        BST tree = new BST();

        // Insert nodes
        int[] values = {50, 30, 20, 40, 70, 60, 80};
        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);
        System.out.println();

        // Search node
        int key = 40;
        System.out.println(key + " found? " + tree.search(tree.root, key));

        // Delete node
        tree.root = tree.delete(tree.root, 30);
        System.out.print("Inorder after deleting 30: ");
        tree.inorder(tree.root);
        System.out.println();

        // Print range
        System.out.print("Nodes in range [40, 70]: ");
        tree.printRange(tree.root, 40, 70);
        System.out.println();
    }
}
 