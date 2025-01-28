
public class Intro {

    public static void main(String[] args) {
        int[] arr = {10, 22, 64, 75, 100};
        int k = 2;
        int maxSum = findMaxSum(arr, k);
        System.out.println("Maximum sum of a subarray of size " + k + " is: " + maxSum);
    }

    public static int findMaxSum(int[] arr, int k) {
        if (arr.length < k) {
            System.out.println("Invalid input: Array size is smaller than subarray size.");
            return -1;
        }

        // Compute the sum of the first window of size k
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        // Initialize the maximum sum as the first window sum
        int maxSum = windowSum;

        // Slide the window over the array
        for (int i = k; i < arr.length; i++) {
            // Add the next element in the window and remove the first element of the previous window
            windowSum += arr[i] - arr[i - k];
            // Update the maximum sum if needed
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
