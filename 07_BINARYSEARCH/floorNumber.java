
import java.util.*;

public class floorNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array in sorted order: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int ans = number(arr, target);
        if (ans >= 0) {
            System.out.println("The floor of " + target + " is " + arr[ans]);
        } else {
            System.out.println("No floor found in the array for the target " + target);
        }
    }

    static int number(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // If the target is found, return its index.
            }
        }

        return end; // Return the index of the largest element less than or equal to the target.
    }
}
