
public class BinarySearchTree {

    public class Node {

        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            this.height = 0; // Initialize height as 0 for new nodes
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    // Helper method to calculate the height of a node
    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    // Method to check if the tree is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Insert a value into the BST
    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        }

        // Update height
        node.height = 1 + Math.max(height(node.left), height(node.right));
        return node;
    }

    // Display the tree
    public void display() {
        display(root, "Root Node : ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left, "Left child of " + node.getValue() + " : ");
        display(node.right, "Right child of " + node.getValue() + " : ");
    }

    // In-order Traversal
    public void inOrder() {
        System.out.println("In-order Traversal:");
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.getValue() + " ");
        inOrder(node.right);
    }

    // Pre-order Traversal
    public void preOrder() {
        System.out.println("Pre-order Traversal:");
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getValue() + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // Post-order Traversal
    public void postOrder() {
        System.out.println("Post-order Traversal:");
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.getValue() + " ");
    }

    // Check if the tree is balanced
    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }
        int balanceFactor = Math.abs(height(node.left) - height(node.right));
        return balanceFactor <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    // Get the height of the tree
    public int getHeight() {
        return height(root);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);

        bst.display();

        bst.inOrder();
        bst.preOrder();
        bst.postOrder();

        System.out.println("Height of tree: " + bst.getHeight());
        System.out.println("Is tree balanced? " + bst.isBalanced());
    }
}
