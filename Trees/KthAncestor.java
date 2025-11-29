package Trees;

public class KthAncestor {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // =====================================================
    // Function to find K-th ancestor
    // =====================================================
    public static int kthAncestor(Node root, int target, int k) {
        return helper(root, target, k).ancestor;
    }

    // Helper result structure
    static class Result {
        int ancestor;   // stores final answer
        int dist;       // stores distance from target to this node

        Result(int ancestor, int dist) {
            this.ancestor = ancestor;
            this.dist = dist;
        }
    }

    // Returns:
    // dist = -1 → target not found in this subtree
    // dist >= 0 → distance from this node to the target
    public static Result helper(Node root, int target, int k) {
        if (root == null) return new Result(-1, -1);

        // If we found the target node
        if (root.data == target) {
            return new Result(-1, 0); // distance=0, no ancestor yet
        }

        // Search left and right
        Result left = helper(root.left, target, k);
        Result right = helper(root.right, target, k);

        // If target not found in both subtrees
        if (left.dist == -1 && right.dist == -1) {
            return new Result(-1, -1);
        }

        // If found in left subtree
        if (left.dist != -1) {
            int distance = left.dist + 1;
            if (distance == k) {
                return new Result(root.data, distance);  // kth ancestor found
            }
            return new Result(left.ancestor, distance);  // continue passing up
        }

        // If found in right subtree
        if (right.dist != -1) {
            int distance = right.dist + 1;
            if (distance == k) {
                return new Result(root.data, distance);
            }
            return new Result(right.ancestor, distance);
        }

        return new Result(-1, -1);
    }

    // =====================================================
    // MAIN
    // =====================================================
    public static void main(String[] args) {

        /*
                 1
               /   \
              2     3
             / \
            4   5
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int target = 4;
        int k = 2;

        int ans = kthAncestor(root, target, k);
        System.out.println(k + "-th ancestor of " + target + " = " + ans);
    }
}
