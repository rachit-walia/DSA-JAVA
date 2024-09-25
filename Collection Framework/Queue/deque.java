// offer 
// poll and peak
// import java.util.ArrayDeque;

import java.util.*;

public class deque {

    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(10);
        dq.offer(20);
        dq.offer(120);
        System.out.println(dq);
        System.out.println(dq.poll());
        System.out.println(dq.pollLast());

    }
}
