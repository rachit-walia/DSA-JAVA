
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];

        // Initialize the dp array with -1
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }

        System.out.println(fibo(n, dp));
    }

    public static int fibo(int n, int[] dp) {
        // Base case
        if (n <= 1) {
            return n;
        }

        // Check if already computed
        if (dp[n] != -1) {
            return dp[n];
        }

        // Compute and store in dp array
        dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp);
        return dp[n];
    }
}
