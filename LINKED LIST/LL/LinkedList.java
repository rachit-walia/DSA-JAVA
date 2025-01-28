
class Node {

    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
};

public class LinkedList {

    // Function to convert an array to a linked list
    public static Node arrayToLinkedList(int[] arr) {
        if (arr.length == 0) {
            return null; // Return null for an empty array
        }

        // Create the head node
        Node head = new Node(arr[0]);
        Node current = head;

        // Iterate through the array and create nodes
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;
    }

    // Function to traverse and display the linked list
    public static void traverseLinkedList(Node head) {
        Node current = head;

        // Iterate through the list and print data
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null"); // End of the list
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 10};

        // Convert array to linked list
        Node head = arrayToLinkedList(arr);

        // Traverse and display the linked list
        System.out.println("Linked List:");
        traverseLinkedList(head);
    }
}
