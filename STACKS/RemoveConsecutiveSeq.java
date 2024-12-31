
import java.util.*;

public class RemoveConsecutiveSeq {

    public static int[] remove(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Push element if the stack is empty or top element is not the same as current
            if (st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            } else {
                // Remove all consecutive duplicates
                while (i < n && st.peek() == arr[i]) {
                    i++;
                }
                st.pop(); // Remove the last matched element
                i--; // Adjust the index since the outer loop will increment it
            }
        }

        // Create result array from stack
        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 10, 10, 4, 4, 4, 5, 7, 7, 2};
        int[] res = remove(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
