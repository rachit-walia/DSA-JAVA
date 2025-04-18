// Longest Common Subsequence

public class Solution {

    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dpGrid = new int[n + 1][m + 1];

        // Filling the dpGrid from bottom to top
        for (int row = n - 1; row >= 0; row--) {
            for (int col = m - 1; col >= 0; col--) {
                if (text1.charAt(row) == text2.charAt(col)) {
                    dpGrid[row][col] = 1 + dpGrid[row + 1][col + 1];
                } else {
                    dpGrid[row][col] = Math.max(dpGrid[row + 1][col], dpGrid[row][col + 1]);
                }
            }
        }
        return dpGrid[0][0];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example inputs for testing
        String text1 = "abcde";
        String text2 = "ace";

        // Calculate and print result
        int result = solution.longestCommonSubsequence(text1, text2);
        System.out.println("The longest common subsequence length is: " + result);
    }
}
