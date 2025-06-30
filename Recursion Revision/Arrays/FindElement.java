
public class FindElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 65, 24};
        int target = 4;
        int index = 0;
        if (find(arr, target, index)) {
            System.out.println("Yes, the element is present in the array");
        } else {
            System.out.println("No, the element is not present in the array");
        }
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }
}
