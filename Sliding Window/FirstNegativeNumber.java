// Q-- first negative number in every window of size k

import java.util.*;

public class FirstNegativeNumber {

    public static void firstNegativeNumberInWindow(int[] arr, int n, int k) {
        Queue<Integer> queue = new LinkedList<>();

        // Process the first window
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                queue.add(i);
            }
        }

        // Iterate over the rest of the array
        for (int i = k; i <= n; i++) {
            // Print the first negative number of the current window
            if (!queue.isEmpty()) {
                System.out.print(arr[queue.peek()] + " ");
            } else {
                System.out.print("0 "); // No negative number in this window
            }

            // Remove elements that are out of this window
            while (!queue.isEmpty() && queue.peek() <= i - k) {
                queue.poll();
            }

            // Add the current element if it's negative
            if (i < n && arr[i] < 0) {
                queue.add(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        int n = arr.length;

        firstNegativeNumberInWindow(arr, n, k);
    }
}
