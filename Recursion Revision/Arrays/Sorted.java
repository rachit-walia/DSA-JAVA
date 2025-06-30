
public class Sorted {

    public static void main(String[] args) {
        int[] arr = {223, 42, 13, 4, 23, 2, 44};
        int index = 0;
        if (sort(arr, index)) {
            System.out.println("The arr is sorted");
        } else {
            System.out.println("The array is not sorted");
        }
    }

    static boolean sort(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true; // base condition
        }
        return arr[index] < arr[index + 1] && sort(arr, index + 1);

    }

}
