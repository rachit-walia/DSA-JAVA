
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

    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length); // Fixed method name
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
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

    public boolean isEmpty() {
        return root == null;
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    // Main method to test the BST functionality
    public static void main(String[] args) {
        BST bst = new BST();

        // Test inserting and displaying nodes
        int[] numbers = {50, 30, 70, 20, 40, 60, 80};
        bst.populate(numbers);

        System.out.println("Displaying BST:");
        bst.display();

        // Check if the tree is balanced
        System.out.println("Is the BST balanced? " + bst.balanced());

        // Test inserting a sorted array and check balance again
        System.out.println("\nInserting sorted array:");
        int[] sortedNumbers = {10, 20, 30, 40, 50, 60, 70};
        bst.populateSorted(sortedNumbers);

        System.out.println("Displaying BST after inserting sorted array:");
        bst.display();

        System.out.println("Is the BST balanced? " + bst.balanced());
    }
}
