
import java.util.LinkedList;
import java.util.ListIterator;

public class Library {

    public static void main(String[] args) {
        LinkedList<Integer> doublyLinkedList = new LinkedList<>();

        // Initial elements
        doublyLinkedList.add(10);
        doublyLinkedList.add(20);
        doublyLinkedList.add(30);
        doublyLinkedList.add(40);

        System.out.println("Doubly linked list after initial insertion:");
        display(doublyLinkedList);

        // Insertion at a specific po sition
        insertAtPosition(doublyLinkedList, 25, 2); // Insert 25 at position 2
        System.out.println("Doubly linked list after inserting 25 at position 2:");
        display(doublyLinkedList);

        // Deletion from a specific position
        deleteAtPosition(doublyLinkedList, 3); // Delete element at position 3
        System.out.println("Doubly linked list after deleting element at position 3:");
        display(doublyLinkedList);
    }

    // Method to insert an element at a specified position
    public static void insertAtPosition(LinkedList<Integer> list, int data, int position) {
        if (position < 0 || position > list.size()) {
            System.out.println("Invalid position");
        } else {
            list.add(position, data);
        }
    }

    // Method to delete an element at a specified position
    public static void deleteAtPosition(LinkedList<Integer> list, int position) {
        if (position < 0 || position >= list.size()) {
            System.out.println("Invalid position");
        } else {
            list.remove(position);
        }
    }

    // Method to display the linked list
    public static void display(LinkedList<Integer> list) {
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
