package LeetcodeProblems;

public class DominoAndTrominoTiling {
    public static void main(String[] args) {
        DominoAndTrominoTiling solution = new DominoAndTrominoTiling();
        System.out.println(solution.numTilings(3)); // Output: 5
        System.out.println(solution.numTilings(4)); // Output: 11
    }

    public int numTilings(int n) {
        int MOD = 1_000_000_007;
        if (n == 1) return 1;
        if (n == 2) return 2;

        long[] dp = new long[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;

        for (int i = 4; i <= n; i++) {
            dp[i] = (2 * dp[i - 1] + dp[i - 3]) % MOD;
        }

        return (int) dp[n];
    }
}

