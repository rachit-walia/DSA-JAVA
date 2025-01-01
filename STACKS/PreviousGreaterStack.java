
import java.util.Stack;

public class PreviousGreaterStack {

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 6, 7, 10, 5};
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            // if stack is empty and no previous gretaer element exist
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println("");

        // the originalarray
        System.out.println("The original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nPrevious element array");
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
