package Recursion;

public class StairPath1or3JumpsusingDP {
    public static int countWaysDP(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1; // Base case: starting stair

        for (int i = 1; i <= n; i++) {
            dp[i] += dp[i - 1];
            if (i >= 2) {
                dp[i] += dp[i - 2];
            }
            if (i >= 3) {
                dp[i] += dp[i - 3];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4; // Example: find ways to reach the 4th stair
        System.out.println("Number of ways to reach the " + n + "th stair (DP): " + countWaysDP(n));
    }
}
