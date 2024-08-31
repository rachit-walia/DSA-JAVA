// the  best time complexibity of linear search is O(1)

// the worst time complexibity of linear search is O(N), where N is size of the array
public class LinearSearch {

    public static void main(String[] args) {
        int[] nums = {23, 14, 13, 56, 78, 45, 34, 5};
        int target = 23;
        int ans = linear(nums, target);
        System.out.println(ans);
    }

    // Search in the array: return the index if item found, otherwise if item not found, return -1
    static int linear(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // Run a loop through the array
        for (int index = 0; index < arr.length; index++) {
            // Check for the element at every index if it is equal to target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // If the target is not found, return -1
        return -1;
    }
}
