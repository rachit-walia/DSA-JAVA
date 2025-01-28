
public class DoublyLL {

    public static class Node {

        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println("");
    }

    public static void displayrev(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println("");
    }

    public static void display2(Node random) {
        //  
        Node temp = random;
        // move this temp backwards to the head
        while (temp.prev != null) {
            temp = temp.prev;
        }

        // when temp is at head
        // print the list
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // insetion at tail of dll
    public static void insertAttail(Node head, int x) {
        Node temp = head;
        // temp ko tail tk leke gyege
        while (temp.next != null) {
            temp = temp.next;

        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
    }

    // inserion at the head of doubly linked list
    public static Node insertAthead(Node head, int x) {
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }

    // insertion at the index of a doubly linked list
    public static void insertAtIdx(Node head, int idx, int x) {
        Node s = head;
        for (int i = 1; i <= idx - 1; i++) {
            s = s.next;

        }
        // s is at idx-1;
        Node r = s.next;
        Node t = new Node(x);
        // s t r
        s.next = t;
        t.prev = s;
        t.next = r;
        t.prev = t;
    }

    public static void main(String[] args) {
        // 4 10 2 99 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.next = b;
        a.prev = null;
        b.next = c;
        b.prev = a;
        c.next = d;
        c.prev = b;
        d.next = e;
        d.prev = c;
        e.next = null;
        e.prev = d;
        display(a);
        insertAttail(a, 90);
        display(a);
        insertAtIdx(a, 3, 55);
        display(a);
        // displayrev(e);
        // display2(d);
        // Node newhead = insertAthead(a, 35);
        // display(newhead);
    }
}
