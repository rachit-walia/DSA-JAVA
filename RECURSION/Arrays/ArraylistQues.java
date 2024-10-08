
import java.util.ArrayList;

public class ArraylistQues {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};

        // Demonstration of the three methods
        System.out.println(find(arr, 4, 0)); // Output: true (4 is found)
        System.out.println(findIndex(arr, 4, 0)); // Output: 3 (first index of 4)
        System.out.println(findIndexLast(arr, 4, arr.length - 1)); // Output: 4 (last index of 4)

        // Finding all indices where 4 occurs
        ArrayList<Integer> resultList = findAllIndex(arr, 4, 0, new ArrayList<>());
        System.out.println(resultList); // Output: [3, 4]
    }

    // Find if the target exists in the array
    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    // Find the first index of the target
    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index + 1);
    }

    // Find the last index of the target
    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndexLast(arr, target, index - 1);
    }

    // Find all indices of the target
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }
}
