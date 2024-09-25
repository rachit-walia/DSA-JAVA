
// import java.util.LinkedList;
import java.util.*;

// queue : FIFO (First in first out)
// dequeue: First se nikata hai
// Enqueue: last se nikalega
public class queue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // q.add(10);
        // q.add(20);
        // q.add(30);
        // q.add(40);
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
        // System.out.println(q);
        // System.out.println(q.poll());
        // System.out.println(q);

    }
}
