
import java.util.*;

public class ReturnList {

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 8, 7, 5, 7};
        int target = 7;

        ArrayList<Integer> result = findAllIndex(arr, target, 0, new ArrayList<>());
        System.out.println("Indices of target " + target + ": " + result);
    }

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
