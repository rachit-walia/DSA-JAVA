
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

    public static void main(String[] args) {
        int n = 3;
        // printInc(n);
        int a = fact(n);
        int b = sum(n);
        // System.out.println(a);
        // System.out.println(b);
        int arr[] = {1, 2, 3, 4, 6, 3};
        System.out.println(isSorted(arr, 0));

    }
}
