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

public class Deletion {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 10};

        // Create a linked list from the array
        Node head = null;
        for (int i = arr.length - 1; i >= 0; i--) {
            head = new Node(arr[i], head);
        }

        System.out.println("Original Linked List:");
        printList(head);

        // Delete node from the start
        head = deleteFromStart(head);
        System.out.println("After deleting from start:");
        printList(head);

        // Delete node from the end
        head = deleteFromEnd(head);
        System.out.println("After deleting from end:");
        printList(head);

        // Delete node at position k
        int k = 2; // Example position
        head = deleteAtPosition(head, k);
        System.out.println("After deleting at position " + k + ":");
        printList(head);
    }

    // Delete node from the start
    public static Node deleteFromStart(Node head) {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return null;
        }
        return head.next; // Move the head pointer to the next node
    }

    // Delete node from the end
    public static Node deleteFromEnd(Node head) {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return null;
        }
        if (head.next == null) {
            // Only one element in the list
            return null;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next; // Move to the second last node
        }
        current.next = null; // Remove the last node
        return head;
    }

    // Delete node at position k (1-based index)
    public static Node deleteAtPosition(Node head, int k) {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return null;
        }
        if (k == 1) {
            return deleteFromStart(head); // Delete the first node
        }

        Node current = head;
        int count = 1;
        while (current != null && count < k - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            System.out.println("Position " + k + " is out of bounds.");
            return head; // Return the list unchanged
        }

        current.next = current.next.next; // Bypass the node at position k
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
