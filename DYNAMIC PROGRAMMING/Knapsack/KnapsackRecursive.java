
public class KnapsackRecursive {

    public static int knapsack(int[] weights, int[] values, int capacity, int n) {
        // Base case: if no items left or capacity is 0
        if (n == 0 || capacity == 0) {
            return 0;
        }
        // If weight of nth item is more than the knapsack capacity, skip this item
        if (weights[n - 1] > capacity) {
            return knapsack(weights, values, capacity, n - 1);
        } else {
            // Return the maximum of two cases:
            // 1. nth item included
            // 2. nth item not included
            int includeItem = values[n - 1] + knapsack(weights, values, capacity - weights[n - 1], n - 1);
            int excludeItem = knapsack(weights, values, capacity, n - 1);
            return Math.max(includeItem, excludeItem);
        }
    }

    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;
        int n = values.length;
        System.out.println("Maximum value in Knapsack = " + knapsack(weights, values, capacity, n));
    }
}
