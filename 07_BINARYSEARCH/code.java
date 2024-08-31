
public class code {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 15, 54, 8542, 45212};
        int target = 54;
        int ans = binarysearch(arr, target);
        System.out.println(ans);

    }

    // return the index
    // return -1 if it does not exist
    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the middle element

            // int mid = (start + end) / 2;
            // might be possible that (start+end) exceeds the range of integer in java.
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
