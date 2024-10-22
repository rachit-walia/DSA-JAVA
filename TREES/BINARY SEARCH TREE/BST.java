import java.util.Scanner;

public class BST {

    public class Node {

        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public BST() {
        this.root = null; // Initialize root to null in the constructor
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        }

        // Update the height of the node after insertion
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isBST() {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    // Validate if the tree is a Binary Search Tree
    private boolean isBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.value <= min || node.value >= max) {
            return false;
        }

        return isBST(node.left, min, node.value) && isBST(node.right, node.value, max);
    }

    public static void main(String[] args) {
        BST bst = new BST();
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.println("Enter the number of elements to insert in the BST: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements to insert in the BST:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            bst.insert(value);
        }

        // Display the tree
        System.out.println("Displaying BST:");
        bst.display();

        // Check if the tree is a valid BST
        System.out.println("Is the tree a valid BST? " + bst.isBST());

        sc.close();
    }
}
