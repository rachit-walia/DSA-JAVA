
public class KnapsackMemoized {

    public static int[][] memo; // creating a memo table

    public static int knapsack(int[] weights, int[] values, int capacity, int n) {
        // Check if the result is already in the memo table
        if (memo[n][capacity] != -1) {
            return memo[n][capacity];
        }

        // Base case: if no items left or capacity is 0
        if (n == 0 || capacity == 0) {
            return 0;
        }

        // If weight of nth item is more than the knapsack capacity, skip this item
        if (weights[n - 1] > capacity) {
            memo[n][capacity] = knapsack(weights, values, capacity, n - 1);
        } else {
            // Calculate the maximum of two cases:
            // 1. nth item included
            // 2. nth item not included
            int includeItem = values[n - 1] + knapsack(weights, values, capacity - weights[n - 1], n - 1);
            int excludeItem = knapsack(weights, values, capacity, n - 1);
            memo[n][capacity] = Math.max(includeItem, excludeItem);
        }
        return memo[n][capacity];
    }

    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;
        int n = values.length;

        // Initialize the memo table with -1, indicating uncomputed states
        memo = new int[n + 1][capacity + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= capacity; j++) {
                memo[i][j] = -1;
            }
        }

        System.out.println("Maximum value in Knapsack = " + knapsack(weights, values, capacity, n));
    }
}
