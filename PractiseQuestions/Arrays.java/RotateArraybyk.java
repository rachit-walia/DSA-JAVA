
import java.util.Arrays;
import java.util.Scanner;

public class RotateArraybyk {

    // Helper method to reverse part of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size and rotation index
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of positions to rotate the array by: ");
        int k = sc.nextInt();

        // Create and fill the array
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Normalize k to be within array bounds
        k = k % n;

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(arr, k, n - 1);

        // Output the rotated array
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}
