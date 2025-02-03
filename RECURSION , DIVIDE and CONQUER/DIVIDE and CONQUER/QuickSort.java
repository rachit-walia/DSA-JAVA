
public class QuickSort {

    public static void quicksort(int arr[], int s, int e) {
        if (s < e) {
            int pidx = partition(arr, s, e);
            quicksort(arr, s, pidx - 1); // Sort left partition
            quicksort(arr, pidx + 1, e); // Sort right partition
        }
    }

    public static int partition(int arr[], int s, int e) {
        int pivot = arr[e]; // Choosing last element as pivot
        int i = s - 1;

        for (int j = s; j < e; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, e);
        return i + 1;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        System.out.println("Original array:");
        printArray(arr);

        quicksort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
