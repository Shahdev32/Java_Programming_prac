package Trees;

public class DiameterOfTree {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Class to return height + diameter at the same time
    static class Info {
        int height;
        int diameter;

        Info(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    // Optimized function to find diameter
    public static Info diameter(Node root) {

        // Base Case
        if (root == null) {
            return new Info(0, 0);
        }

        // Get info from left & right
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        // Height
        int myHeight = Math.max(leftInfo.height, rightInfo.height) + 1;

        // Diameter through root
        int diam1 = leftInfo.height + rightInfo.height + 1;

        // Diameter from left subtree or right subtree
        int diam2 = Math.max(leftInfo.diameter, rightInfo.diameter);

        // Final diameter
        int myDiameter = Math.max(diam1, diam2);

        return new Info(myHeight, myDiameter);
    }

    // Main method
    public static void main(String[] args) {

        // Create tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);

        Info ans = diameter(root);

        System.out.println("Height of Tree: " + ans.height);
        System.out.println("Diameter of Tree: " + ans.diameter);
    }
}
