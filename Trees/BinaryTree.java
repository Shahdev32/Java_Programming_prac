package Trees;

import java.util.*;

public class BinaryTree {

    // ===========================
    // Node Class
    // ===========================
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // ===========================
    // Build Tree Class
    // ===========================
    static class BuildTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length) return null;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // ===========================
    // Traversals
    // ===========================

    // Preorder (Root, Left, Right)
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder (Left, Root, Right)
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Postorder (Left, Right, Root)
    public static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // ===========================
    // Tree Height
    // ===========================
    public static int height(Node root) {
        if (root == null) return 0;

        int leftH = height(root.left);
        int rightH = height(root.right);

        return Math.max(leftH, rightH) + 1;
    }

    // ===========================
    // Count Nodes
    // ===========================
    public static int countNodes(Node root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // ===========================
    // Sum of Nodes
    // ===========================
    public static int sumNodes(Node root) {
        if (root == null) return 0;
        return root.data + sumNodes(root.left) + sumNodes(root.right);
    }

    // ===========================
    // Level Order Traversal
    // ===========================
    public static void levelOrder(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.remove();
            System.out.print(curr.data + " ");

            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
    }

    // ===========================
    // MAIN METHOD
    // ===========================
    public static void main(String[] args) {

        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1};

        BuildTree tree = new BuildTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Root node = " + root.data);

        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        System.out.print("Postorder: ");
        postorder(root);
        System.out.println();

        System.out.println("Height of tree: " + height(root));
        System.out.println("Total nodes: " + countNodes(root));
        System.out.println("Sum of all nodes: " + sumNodes(root));

        System.out.print("Level Order: ");
        levelOrder(root);
        System.out.println();
    }
}
