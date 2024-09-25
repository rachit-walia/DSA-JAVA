
import java.util.ArrayDeque;

public class stack {

    public static void main(String[] args) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        System.out.println("We are adding elements in the stack form: ");
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st);
        System.out.println(st.pop());

        System.out.println("We are adding elements in the queue form: ");
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        System.out.println(q);
        System.out.println(q.poll());

    }
}
