package Trees;

public class MinDistanceBetweenNodes {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // --------------------------------------------------------
    // 1. LCA Function
    // --------------------------------------------------------
    public static Node lca(Node root, int n1, int n2) {
        if (root == null) return null;

        if (root.data == n1 || root.data == n2) return root;

        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);

        if (left != null && right != null) return root;

        return (left != null) ? left : right;
    }

    // --------------------------------------------------------
    // 2. Distance function from root to a target node
    // --------------------------------------------------------
    public static int distance(Node root, int target) {
        if (root == null) return -1;

        if (root.data == target) return 0;

        int left = distance(root.left, target);
        int right = distance(root.right, target);

        if (left == -1 && right == -1) return -1;

        if (left != -1) return left + 1;
        else return right + 1;
    }

    // --------------------------------------------------------
    // 3. Minimum Distance
    // --------------------------------------------------------
    public static int minDistance(Node root, int n1, int n2) {
        Node lcaNode = lca(root, n1, n2);

        int d1 = distance(lcaNode, n1);
        int d2 = distance(lcaNode, n2);

        return d1 + d2;
    }

    // --------------------------------------------------------
    // MAIN
    // --------------------------------------------------------
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

        int n1 = 4, n2 = 8;

        System.out.println("Minimum Distance = " + minDistance(root, n1, n2));
    }
}
