
import java.util.Scanner;

public class BinaryTreeFirst {

    // Constructor
    public BinaryTreeFirst() {
    }

    // Inner Node class
    private static class Node {

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    // Root node of the binary tree
    private Node root;

    // Method to start populating the tree
    public void populate(Scanner scanner) {
        System.out.println("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value); // Create root node
        populate(scanner, root);
    }

    // Recursive method to populate the binary tree
    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value + "? (true/false)");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);  // Create left child node
            populate(scanner, node.left); // Recursively populate the left subtree
        }

        System.out.println("Do you want to enter right of " + node.value + "? (true/false)");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);  // Create right child node
            populate(scanner, node.right); // Recursively populate the right subtree
        }
    }

    // Display the binary tree
    public void display() {
        display(root, "");
    }

    // Recursive method to display the tree in pre-order fashion
    private void display(Node node, String indent) {
        if (node == null) {
            return; // Base case: if the node is null, return
        }
        System.out.println(indent + node.value); // Print current node
        display(node.left, indent + "\t"); // Display left subtree with indent
        display(node.right, indent + "\t"); // Display right subtree with indent
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Correct scanner initialization
        BinaryTreeFirst tree = new BinaryTreeFirst(); // Instantiate BinaryTreeFirst
        tree.populate(scanner);  // Populate tree
        tree.display();  // Display tree
    }
}
