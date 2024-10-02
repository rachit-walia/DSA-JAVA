
public class SortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 67};
        System.out.println(sorted(arr, 3));

    }

    static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}
