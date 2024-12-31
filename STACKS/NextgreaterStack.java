
import java.util.*;

public class NextgreaterStack {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 8, 6, 3, 4};
        int n = arr.length;
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack smaller than or equal to the current element
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            // If stack is empty, no greater element exists
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }

            // Push the current element onto the stack
            st.push(arr[i]);
        }

        // Print the original array
        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        // Print the result array
        System.out.println("Next greater elements:");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
