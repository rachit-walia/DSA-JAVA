
public class MaximumSumSubarray {

    public static int maximumSum(int[] arr, int k) {
        if (arr.length == 0 || arr.length < k) {
            return 0;
        }

        int i = 0;
        int j = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        while (j < arr.length) {
            sum += arr[j]; // Adding element to the sum

            if (j - i + 1 < k) {
                j++; // Expanding the window
            } else if (j - i + 1 == k) {
                maxSum = Math.max(maxSum, sum); // Updating maxSum
                sum -= arr[i]; // Removing the leftmost element
                i++; // Sliding the window
                j++; // Moving forward
            }
        }
        return maxSum; // Return after checking all subarrays
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 4};
        int k = 3;
        System.out.println("Maximum sum of subarray of size " + k + " is: " + maximumSum(arr, k));
    }
}
