
import java.util.ArrayList;
import java.util.Arrays;
//using recursion-- this will give TLI because it keeps on running

public class MinimumCostClimbingStairs {

    public static void main(String[] args) {
        ArrayList<Integer> cost = new ArrayList<>(Arrays.asList(10, 15, 20));
        System.out.println(minimumCost(cost));
    }

    public static int minimumCost(ArrayList<Integer> cost) {
        int n = cost.size();
        return Math.min(solve(cost, n - 1), solve(cost, n - 2));
    }

    // Recursive function to calculate the minimum cost to reach the top
    private static int solve(ArrayList<Integer> cost, int n) {
        if (n == 0) {
            return cost.get(0); // Base case for the first step

        }
        if (n == 1) {
            return cost.get(1); // Base case for the second step

        }
        return cost.get(n) + Math.min(solve(cost, n - 1), solve(cost, n - 2));
    }
}
