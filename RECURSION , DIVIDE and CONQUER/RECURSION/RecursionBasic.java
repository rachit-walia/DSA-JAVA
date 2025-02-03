
public class RecursionBasic {

    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);

    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }

    public static int lastOccurence(int arr[], int key, int i) {
        // Base case: if i reaches the end of the array, return -1
        if (i == arr.length) {
            return -1;
        }

        // Recursive call to check the rest of the array
        int isFound = lastOccurence(arr, key, i + 1);

        // If key is found in the future part of the array, return that index
        if (isFound != -1) {
            return isFound;
        }

        // If the current element matches the key, return the current index
        if (arr[i] == key) {
            return i;
        }

        return -1; // If the key is not found
    }

    public static void main(String[] args) {
        int n = 3;
        // printInc(n);
        int a = fact(n);
        int b = sum(n);
        // System.out.println(a);
        // System.out.println(b);
        int arr[] = {1, 2, 7, 4, 6, 3};
        System.out.println(isSorted(arr, 0));
        System.out.println(firstOccurence(arr, 3, 1));
        System.out.println(lastOccurence(arr, 1, 0));

    }
}
