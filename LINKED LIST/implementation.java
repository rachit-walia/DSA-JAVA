
public class implementation {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {

        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtBegin(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void insertAtIdx(int idx, int val) {
            if (idx < 0 || idx > size()) {
                System.out.println("Index out of bounds");
                return;
            }

            Node t = new Node(val);

            if (idx == 0) { // Insert at the beginning
                insertAtBegin(val);
                return;
            } else if (idx == size()) { // Insert at the end
                insertAtEnd(val);
                return;
            }

            Node temp = head;
            for (int i = 1; i < idx; i++) { // Traverse to the node before the target index
                temp = temp.next;
            }

            t.next = temp.next; // Link the new node to the next node
            temp.next = t; // Link the current node to the new node
        }

        // get index of the element
        int getAt(int idx) {
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(15);
        ll.insertAtBegin(10);
        ll.insertAtBegin(11);

        ll.display(); // Should print: 11 10 4 5 15

        ll.insertAtIdx(2, 65); // Insert 65 at index 2
        ll.display(); // Should print: 11 10 65 4 5 15

        System.out.println("Size of linked list: " + ll.size()); // Should print: 6
        System.out.println(ll.getAt(3));
    }
}
