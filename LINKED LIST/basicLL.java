
public class basicLL {

    // display linked list using recursion
    public static void displayr(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        displayr(head.next);
    }

    // display linked list using normal function
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    // function to count lenght of the linked list
    public static int length(Node head) {
        int count = 0;

        while (head != null) {
            count++;
            head = head.next;

        }
        return count;
    }

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }

    }

    public static void main(String[] args) {
        Node a = new Node(5);
        // System.out.println(a.next);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // connecting linked list
        // a->b->c->d->e
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // System.out.println(a.next);
        // // basicLL$Node@2f92e0f4
        // System.out.println(b);
        // traversal a linked list
        // Node temp = a;
        // while (temp != null) {
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }
        display(a);
        System.out.println("");
        displayr(a);
        System.out.println("");
        // length of the linked list
        System.out.println("The length of the linked list is : " + length(a));
    }
}
