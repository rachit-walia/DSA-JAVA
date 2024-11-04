
import java.util.*;

public class LLlibrary {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(5); // insert at the beginning
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        System.out.println("Linked list after insertion:");
        display(linkedList);

        // deletion of elements
        linkedList.removeFirst(); // deletion from the beginning
        System.out.println("Linked list after deleting the first element:");
        display(linkedList);

        linkedList.removeLast(); // delete from the end
        System.out.println("Linked list after deleting the last element:");
        display(linkedList);
    }

    // display method for linked list
    public static void display(LinkedList<Integer> list) {
        for (int element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
