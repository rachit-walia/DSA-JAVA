
import java.util.*;

public class CreateArray {

    // 1d array;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the array: ");
        // int n = sc.nextInt();

        // int[] arr = new int[n];
        // System.err.println("Enter the elements of the array: ");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // // print the array
        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        //
        //
        // 2d array
        System.out.println("Enter the number of rows of your 2d array");
        int r = sc.nextInt();
        System.out.println("Enter the number of coloums of your 2d array");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
