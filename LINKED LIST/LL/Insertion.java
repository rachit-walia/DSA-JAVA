// Class for a Node

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
}

public class Insertion {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 10};

        // Create a linked list from the array
        Node head = null;
        for (int i = arr.length - 1; i >= 0; i--) {
            head = new Node(arr[i], head);
        }

        System.out.println("Original Linked List:");
        printList(head);

        // Insert at the head
        head = insertAtHead(head, 1);
        System.out.println("After inserting at head:");
        printList(head);

        // Insert at the tail
        head = insertAtTail(head, 15);
        System.out.println("After inserting at tail:");
        printList(head);

        // Insert at position k
        int k = 3; // Example position
        head = insertAtPosition(head, 99, k);
        System.out.println("After inserting at position " + k + ":");
        printList(head);
    }

    // Insert a node at the head
    public static Node insertAtHead(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head; // New node points to the current head
        return newNode; // New node becomes the new head
    }

    // Insert a node at the tail
    public static Node insertAtTail(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode; // If the list is empty, new node becomes the head
        }

        Node current = head;
        while (current.next != null) {
            current = current.next; // Traverse to the last node
        }
        current.next = newNode; // Append the new node at the end
        return head;
    }

    // Insert a node at position k (1-based index)
    public static Node insertAtPosition(Node head, int data, int k) {
        Node newNode = new Node(data);
        if (k == 1) {
            newNode.next = head; // Insert at the head
            return newNode;
        }

        Node current = head;
        int count = 1;
        while (current != null && count < k - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position " + k + " is out of bounds. Node not inserted.");
            return head; // Return the list unchanged
        }

        newNode.next = current.next; // New node points to the next node
        current.next = newNode; // Current node points to the new node
        return head;
    }

    // Print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
