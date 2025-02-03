
public class MergeSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1]; // Temporary array
        int i = si; // Iterator for left part
        int j = mid + 1; // Iterator for right part
        int k = 0; // Iterator for temp array

        // Merge two sorted subarrays
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left subarray
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right subarray
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp array back to original array
        for (k = 0; k < temp.length; k++) {
            arr[si + k] = temp[k];
        }
    }

    public static void mergesort(int arr[], int si, int ei) {
        if (si >= ei) {
            return; // Base case: single element or invalid range
        }
        int mid = si + (ei - si) / 2;
        mergesort(arr, si, mid);   // Sort left part
        mergesort(arr, mid + 1, ei); // Sort right part
        merge(arr, si, mid, ei);   // Merge both sorted halves
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        System.out.println("Original Array:");
        printArr(arr);

        mergesort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArr(arr);
    }
}
