
public class PreviousGreaterElement {

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 6, 7, 10, 5};
        int n = arr.length;
        int[] res = new int[arr.length];
        for (int i = 0; i < n; i++) {
            res[i] = -1; // Default value if no previous greater element exists
            for (int j = i - 1; j >= 0; j--) { // Check all previous elements
                if (arr[j] > arr[i]) {
                    res[i] = arr[j];
                    break; // Break as soon as the previous greater element is found
                }
            }
        }
        System.out.println("the original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("");
        System.out.println("Array after greater previous element: ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");

        }

    }
}
