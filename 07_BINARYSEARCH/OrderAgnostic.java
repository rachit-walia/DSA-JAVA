
public class OrderAgnostic {

    public static void main(String[] args) {
        // You can test the function here
        int[] arr = {10, 9, 8, 7, 6, 5}; // Example descending sorted array
        int target = 7;
        int result = order(arr, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }

    static int order(int[] arr, int target) {
        int start = 0;  
        int end = arr.length - 1;

        // Determine if the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) { // Notice the condition change for descending order
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // Target not found
    }
}
