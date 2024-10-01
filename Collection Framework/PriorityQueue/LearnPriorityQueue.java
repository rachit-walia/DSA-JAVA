
import java.util.*;

public class LearnPriorityQueue {

    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(300);
        pq.add(40);
        pq.add(50);
        pq.add(60);
        // pq.add(30);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());

    }
}
