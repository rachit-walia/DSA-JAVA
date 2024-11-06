
public class MinimumCoinsRecursion {

    public static int minCoins(int[] coins, int amount) {
        // Base case: if amount is 0, no coins are needed.
        if (amount == 0) {
            return 0;
        }
        // If amount is negative, no solution is possible.
        if (amount < 0) {
            return Integer.MAX_VALUE;
        }

        int minCoins = Integer.MAX_VALUE;
        for (int coin : coins) {
            int result = minCoins(coins, amount - coin);
            if (result != Integer.MAX_VALUE) {
                minCoins = Math.min(minCoins, result + 1);
            }
        }
        return minCoins;
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = minCoins(coins, amount);
        System.out.println(result == Integer.MAX_VALUE ? -1 : result);
    }
}
