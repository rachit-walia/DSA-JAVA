
class CircularLinkedList {

    private Node head;
    private Node tail;

    // Node definition
    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to insert at a specific position
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        // Insert at head if list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Point to itself to make it circular
            return;
        }

        // Insert at the specified position
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            tail.next = head; // Update tail to point to the new head
        } else {
            Node temp = head;
            int count = 0;

            while (count < position - 1 && temp.next != head) {
                temp = temp.next;
                count++;
            }

            newNode.next = temp.next;
            temp.next = newNode;

            // Update tail if new node is added at the end
            if (temp == tail) {
                tail = newNode;
            }
            tail.next = head; // Ensure it's circular
        }
    }

    // Method to delete from a specific position
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // Delete the head node
        if (position == 0) {
            if (head == tail) { // Only one element
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        // Traverse to find the node before the one to delete
        Node temp = head;
        int count = 0;

        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        // If we're at the last node, update tail
        if (temp.next == tail) {
            tail = temp;
        }

        // Skip the node to delete it
        temp.next = temp.next.next;
        tail.next = head; // Maintain circular property
    }

    // Method to display the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        // Insert elements
        cll.insertAtPosition(10, 0);
        cll.insertAtPosition(20, 1);
        cll.insertAtPosition(30, 2);
        cll.insertAtPosition(40, 3);

        System.out.println("Circular linked list after insertion:");
        cll.display();

        // Insert at specific position
        cll.insertAtPosition(25, 2);
        System.out.println("Circular linked list after inserting 25 at position 2:");
        cll.display();

        // Delete at specific position
        cll.deleteAtPosition(3);
        System.out.println("Circular linked list after deleting element at position 3:");
        cll.display();
    }
}
