package Trees;

public class LowestCommonAncestor {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // ========================================
    // LCA FUNCTION
    // ========================================
    public static Node lca(Node root, int n1, int n2) {
        if (root == null) return null;

        // If match → return the node
        if (root.data == n1 || root.data == n2) {
            return root;
        }

        // Search left & right subtree
        Node leftAns = lca(root.left, n1, n2);
        Node rightAns = lca(root.right, n1, n2);

        // If both sides gave answer → this is LCA
        if (leftAns != null && rightAns != null) {
            return root;
        }

        // Otherwise return whichever side is non-null
        return (leftAns != null) ? leftAns : rightAns;
    }

    // ========================================
    // MAIN
    // ========================================
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

        int n1 = 4, n2 = 5;

        Node ans = lca(root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " = " + ans.data);
    }
}