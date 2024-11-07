import java.util.*;

public class MatrixChainMultiplication {
    private static int[][] DP;

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;  // Set n to the length of the array
        DP = new int[n][n];  // Initialize DP with size n x n

        // Fill DP array with -1
        for (int[] row : DP) {
            Arrays.fill(row, -1);
        }

        // Call MCM with correct indices
        System.out.println("Minimum number of multiplications is: " + MCM(arr, 1, n - 1));
    }

    public static int MCM(int[] arr, int i, int j) {
        // Base case: only one matrix
        if (i == j) return 0;

        // If already calculated, return the stored result
        if (DP[i][j] != -1) return DP[i][j];

        int min = Integer.MAX_VALUE;

        // Place parenthesis at different positions and calculate cost recursively
        for (int k = i; k < j; k++) {
            int currmin = MCM(arr, i, k) + MCM(arr, k + 1, j) + arr[i - 1] * arr[k] * arr[j];
            min = Math.min(min, currmin);
        }

        DP[i][j] = min;  // Store the result
        return DP[i][j];
    }
}
