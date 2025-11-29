class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class SumTree {

    // Function to convert into Sum Tree
    public static int transformToSumTree(Node root) {
        // Base case
        if (root == null) {
            return 0;
        }

        // Get left and right subtree sum
        int leftSum = transformToSumTree(root.left);
        int rightSum = transformToSumTree(root.right);

        // Store old value before replacing
        int oldValue = root.data;

        // Replace node value with (left subtree + right subtree)
        root.data = leftSum + rightSum;

        // Return new sum including old value
        return root.data + oldValue;
    }

    // Preorder print
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        transformToSumTree(root);

        System.out.println("Preorder of Sum Tree:");
        preorder(root);
    }
}
