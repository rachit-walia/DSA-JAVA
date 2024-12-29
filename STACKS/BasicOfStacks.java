
import java.util.*;

public class BasicOfStacks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter the number of element : ");
        n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

        Stack<Integer> lt = new Stack<>();
        while (st.size() > 0) {
            int x = st.peek();
            lt.push(x);
            st.pop();
        }
        System.out.println(lt);
    }
}
