
import java.util.Arrays;

public class MethodsofArray {

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1, 45};

        // Sort the array
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Correct usage of binarySearch (search for 5 in the sorted array)
        int index = Arrays.binarySearch(arr, 5);
        if (index >= 0) {
            System.out.println("Element 5 found at index: " + index);
        } else {
            System.out.println("Element 5 not found.");
        }

        // Arrays.equals() to compare two arrays
        int[] arr2 = {1, 2, 3, 4, 5, 45};
        boolean areEqual = Arrays.equals(arr, arr2);
        System.out.println("Arrays are equal: " + areEqual);

        // Arrays.compare() to compare two arrays lexicographically
        int comparisonResult = Arrays.compare(arr, arr2);
        if (comparisonResult == 0) {
            System.out.println("Arrays are lexicographically equal.");
        } else if (comparisonResult < 0) {
            System.out.println("arr comes before arr2 lexicographically.");
        } else {
            System.out.println("arr comes after arr2 lexicographically.");
        }
    }
}
