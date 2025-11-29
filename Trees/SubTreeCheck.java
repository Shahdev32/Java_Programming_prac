package Trees;

public class SubTreeCheck {

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
    // Check if two trees are identical
    // ===========================
    public static boolean isIdentical(Node root, Node subRoot) {
        // both null
        if (root == null && subRoot == null) {
            return true;
        }

        // one null, one not → not identical
        if (root == null || subRoot == null) {
            return false;
        }

        // check value + left subtree + right subtree
        if (root.data == subRoot.data) {
            return isIdentical(root.left, subRoot.left) &&
                   isIdentical(root.right, subRoot.right);
        }

        return false;
    }

    // ===========================
    // Check if subRoot is a subtree of root
    // ===========================
    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) return false;

        // If identical found
        if (isIdentical(root, subRoot)) {
            return true;
        }

        // Search in left or right subtree
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // ===========================
    // MAIN METHOD
    // ===========================
    public static void main(String[] args) {

        // Main tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        // Subtree
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        if (isSubtree(root, subRoot)) {
            System.out.println("YES — It is a subtree!");
        } else {
            System.out.println("NO — Not a subtree.");
        }
    }
}
